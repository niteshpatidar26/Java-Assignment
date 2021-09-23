import java.util.ArrayList;
import java.util.Scanner;

public class StudentOperation 
{
	
	public static ArrayList<StudentConsoleApplication> list= new ArrayList<StudentConsoleApplication>();;
	int ID;
	 
	/*-----------------Method To ADD Student Object------------------------------------------- */
   public void addStudent() 
   {
	  
	    StudentConsoleApplication student = new StudentConsoleApplication();
	    Scanner sc = new Scanner(System.in);
	    
	          System.out.println("Enter Student ID");
	          student.setId(sc.nextInt());
	          
	          System.out.println("Enter Student Full Name");
	          student.setfName(sc.next());
	          sc.nextLine();
	           
	          System.out.println("Enter Student Age");
	          student.setAge(sc.nextInt());
	          sc.nextLine();
	          
	          System.out.println("Enter Student Course");
	          student.setCourse(sc.nextLine());
	          
	   list.add(student);
	   
	
   }
   /*--------Method To View Student Object Detail-----------------------------*/
   
   public  void viewStudent() 
   {

	  for (int i = 0; i < list.size(); i++)
	  {
		StudentConsoleApplication student = list.get(i);
		   System.out.println("******************************************************************************");
		     System.out.println("Student ID: "+student.getId());
		     System.out.println("Student Name: "+student.getfName());
		     System.out.println("Student Age: "+student.getCourse());
		     System.out.println("Student Course:"+student.getAge());
		   System.out.println("******************************************************************************");
	  }
	   	  
   }
   
   /*-----------Method To Delete Student Object--------------------------------------------*/
   
   
   public void deleteStudent() 
   {
	   System.out.println("Enter Student ID");
	   Scanner sc = new Scanner(System.in);
	   int ID = sc.nextInt();
	   	   
	   for (int i = 0; i < list.size(); i++) 
	   {
		   StudentConsoleApplication student = list.get(i);
		   if(student.getId()==ID) 
		   {
			   list.remove(student);
			   break;
		   }

	   }
   }
   
   /*---------Method To Update Student Detail--------------------------------------------*/
   
   public void updateStudent()
   {
	   System.out.println("Enter Student ID");
	   Scanner sc = new Scanner(System.in);
	   int ID = sc.nextInt();
	   	   
	   for (int i = 0; i < list.size(); i++) 
	   {
		   StudentConsoleApplication student = list.get(i);
		   if(student.getId()==ID) 
		   {
			   System.out.println("Enter Student new Name");
		          student.setfName(sc.next());
		          sc.nextLine();
		           
		          System.out.println("Enter Student new Age");
		          student.setAge(sc.nextInt());
		          sc.nextLine();
		          
		          System.out.println("Enter Student new Course");
		          student.setCourse(sc.nextLine());
		   }

	   }
   }

}



