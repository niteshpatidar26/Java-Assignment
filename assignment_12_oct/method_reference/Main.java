package assignment_12_oct.method_reference;

public class Main {

	public static void main(String[] args) 
	{
		StudentFactory factory = Student::new;
		Student student = factory.getInstance();
		student.setFirstName("Akshay");
		student.setLastName("Patil");
		student.setSem1Marks(92);
		student.setSem2Marks(94);
		student.setSem3Marks(96);
		student.setSem4Marks(98);
		student.setSem5Marks(93);
		student.setSem6Marks(99);
		
		Average avg = student::getAverageMarks;
		double averageScore = avg.compute();
		System.out.println("**** Student Data ****\n\n"+student);
		System.out.println("\nAverage Score : "+averageScore);
	}
}
