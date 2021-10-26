package assignment_12_oct.method_reference;

public class Student {
	private String firstName;
	private String lastName;
	private int sem1Marks;
	private int sem2Marks;
	private int sem3Marks;
	private int sem4Marks;
	private int sem5Marks;
	private int sem6Marks;
	
	public Student() {
		
	}
	
	public String getFirstName() {
		return firstName;
	}



	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}



	public String getLastName() {
		return lastName;
	}



	public void setLastName(String lastName) {
		this.lastName = lastName;
	}



	public int getSem1Marks() {
		return sem1Marks;
	}



	public void setSem1Marks(int sem1Marks) {
		this.sem1Marks = sem1Marks;
	}



	public int getSem2Marks() {
		return sem2Marks;
	}



	public void setSem2Marks(int sem2Marks) {
		this.sem2Marks = sem2Marks;
	}



	public int getSem3Marks() {
		return sem3Marks;
	}



	public void setSem3Marks(int sem3Marks) {
		this.sem3Marks = sem3Marks;
	}



	public int getSem4Marks() {
		return sem4Marks;
	}



	public void setSem4Marks(int sem4Marks) {
		this.sem4Marks = sem4Marks;
	}



	public int getSem5Marks() {
		return sem5Marks;
	}



	public void setSem5Marks(int sem5Marks) {
		this.sem5Marks = sem5Marks;
	}



	public int getSem6Marks() {
		return sem6Marks;
	}



	public void setSem6Marks(int sem6Marks) {
		this.sem6Marks = sem6Marks;
	}

	
	
	@Override
	public String toString() {
		return "Name : " + firstName + " " + lastName + "\nSem1Marks : " + sem1Marks
				+ "\nSem2Marks : " + sem2Marks + "\nSem3Marks : " + sem3Marks + "\nSem4Marks : " + sem4Marks + "\nSem5Marks : "
				+ sem5Marks + "\nSem6Marks : " + sem6Marks;
	}

	public double getAverageMarks() {
		int totalMarks = sem1Marks+sem2Marks+sem3Marks+sem4Marks+sem5Marks+sem6Marks;
		return totalMarks/6;
	}

}
