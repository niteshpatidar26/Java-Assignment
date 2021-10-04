package Seriaization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Empserialized {
	public static void main(String[] args) throws Exception
	{
		Manager manager = new Manager();
		manager.setManagerId(1001);
		manager.setEmpId(1);
		manager.setEmpFirstName("Nitesh");
		manager.setEmpLastName("Patidar");
		manager.setEmpDOB("26-09-1998");
		manager.setEmpGender("Male");
		

		   FileOutputStream FOS = new FileOutputStream("manger.ser");
		   ObjectOutputStream OOS = new ObjectOutputStream(FOS);
		   OOS.writeObject(manager);
		   
		   FileInputStream FIS = new FileInputStream("manger.ser");
		   ObjectInputStream OIS = new ObjectInputStream(FIS);
		   
		   Manager M = (Manager)OIS.readObject();
		   System.out.println("ManagerID :"+" EmpID :"+" EmpFirstName :"+" EmplastName :"+" EmpDOB :"+" EmpGender");
		   System.out.println(M.getManagerId()+" : "+M.getEmpId()+" : "+M.getEmpFirstName()+" : "+M.getEmpLastName()+" : "+M.getEmpDOB()+" : "+M.getEmpGender());
	
	}


}
