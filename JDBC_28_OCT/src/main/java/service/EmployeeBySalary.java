package service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import entities.Employees;
import helper.DBConnectionFactory;

public class EmployeeBySalary {

	public static void main(String[] args) 
	{
		List<Employees> empList = new ArrayList<>();
		try(Connection con = DBConnectionFactory.getConnectionInstance();
				Scanner sc = new Scanner(System.in);)
		{
			System.out.print("Enter Minimum salary : ");
			double minSalary=0;
			if(sc.hasNextDouble()) {
				minSalary=sc.nextDouble();
			}
			System.out.print("Enter Maximum salary : ");
			double maxSalary=0;
			if(sc.hasNextDouble()) {
				maxSalary=sc.nextDouble();
			}
			
			PreparedStatement statement = con.prepareStatement("select * from employees where salary between ? and ?");
			statement.setDouble(1, minSalary);
			statement.setDouble(2, maxSalary);
			ResultSet resultSet = statement.executeQuery();
			while(resultSet.next()) {
				Employees e = new Employees();
				e.setEmployeeId(resultSet.getInt("employee_id"));
				e.setFirstName(resultSet.getString("first_name"));
				e.setLastName(resultSet.getString("last_name"));
				e.setEmail(resultSet.getString("email"));
				e.setPhoneNumber(resultSet.getString("phone_number"));
				e.setHireDate(resultSet.getDate("hire_date").toLocalDate());
				e.setJobId(resultSet.getString("job_id"));
				e.setSalary(resultSet.getDouble("salary"));
				e.setCommissionPCT(resultSet.getDouble("commission_pct"));
				e.setManagerId(resultSet.getInt("manager_id"));
				e.setDepartmentId(resultSet.getInt("department_id"));
				empList.add(e);
			}
			System.out.println("************** Employees List **************");
			System.out.println();
			empList.forEach(x->{
				System.out.println("Employee Id : "+x.getEmployeeId()+"\tName : "+x.getFirstName()+" "+x.getLastName()
				+"\t\tDept Id : "+x.getDepartmentId()+"\tSalary : "+x.getSalary());
			});
			System.out.println();
			System.out.println("********************************************");
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
