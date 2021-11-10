package service;

import java.sql.*;
import java.util.*;

import entities.Employees;
import helper.DBConnectionFactory;

public class EmpDataByDeptId {

	public static void main(String[] args) 
	{
		List<Employees> empList = new ArrayList<>();
		try(Connection con = DBConnectionFactory.getConnectionInstance();
				Scanner sc = new Scanner(System.in);)
		{
			System.out.print("Enter Department id : ");
			int deptId=0;
			if(sc.hasNextInt()) {
				deptId=sc.nextInt();
			}
			PreparedStatement statement = con.prepareStatement("select * from employees where department_id=?");
			statement.setInt(1, deptId);
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
			empList.forEach(System.out::println);
			System.out.println();
			System.out.println("********************************************");
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
