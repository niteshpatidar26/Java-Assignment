package assignment_13_oct;

import java.util.Arrays;
import java.util.List;

public class Student {
	private int rollNo;
	private String firstName;
	private String lastName;
	private int sem1Marks;
	private int sem2Marks;
	private int sem3Marks;
	private int sem4Marks;
	private int sem5Marks;
	private int sem6Marks;
	
	private Student() {
		
	}
	
	
	private Student(Student.Builder builder) {
		this.rollNo=builder.rollNo;
		this.firstName=builder.firstName;
		this.lastName=builder.lastName;
		this.sem1Marks=builder.sem1Marks;
		this.sem2Marks=builder.sem2Marks;
		this.sem3Marks=builder.sem3Marks;
		this.sem4Marks=builder.sem4Marks;
		this.sem5Marks=builder.sem5Marks;
		this.sem6Marks=builder.sem6Marks;
	}


	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
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
	
	private static class Builder{
		private int rollNo;
		private String firstName;
		private String lastName;
		private int sem1Marks;
		private int sem2Marks;
		private int sem3Marks;
		private int sem4Marks;
		private int sem5Marks;
		private int sem6Marks;
		
		public Builder setRollNo(int rollNo) {
			this.rollNo = rollNo;
			return this;
		}
		public Builder setFirstName(String firstName) {
			this.firstName = firstName;
			return this;
		}
		public Builder setLastName(String lastName) {
			this.lastName = lastName;
			return this;
		}
		public Builder setSem1Marks(int sem1Marks) {
			this.sem1Marks = sem1Marks;
			return this;
		}
		public Builder setSem2Marks(int sem2Marks) {
			this.sem2Marks = sem2Marks;
			return this;
		}
		public Builder setSem3Marks(int sem3Marks) {
			this.sem3Marks = sem3Marks;
			return this;
		}
		public Builder setSem4Marks(int sem4Marks) {
			this.sem4Marks = sem4Marks;
			return this;
		}
		public Builder setSem5Marks(int sem5Marks) {
			this.sem5Marks = sem5Marks;
			return this;
		}
		public Builder setSem6Marks(int sem6Marks) {
			this.sem6Marks = sem6Marks;
			return this;
		}
		
		public Student build() {
			return new Student(this);
		}
		
	}
	
	
	
	@Override
	public String toString() {
		return "Student [RollNo : " + rollNo + ", Name : " + firstName + " " + lastName + ", Sem1Marks : "
				+ sem1Marks + ", Sem2Marks=" + sem2Marks + ", Sem3Marks=" + sem3Marks + ", Sem4Marks=" + sem4Marks
				+ ", Sem5Marks=" + sem5Marks + ", Sem6Marks=" + sem6Marks + "]";
	}


	public static List<Student> getStudents(){
		return Arrays.asList(
				new Builder()
				.setRollNo(101)
				.setFirstName("Kinshuk")
				.setLastName("Jain")
				.setSem1Marks(87)
				.setSem2Marks(76)
				.setSem3Marks(88)
				.setSem4Marks(98)
				.setSem5Marks(90)
				.setSem6Marks(91)
				.build(),
				new Builder()
				.setRollNo(102)
				.setFirstName("Ashotosh")
				.setLastName("Pathak")
				.setSem1Marks(97)
				.setSem2Marks(78)
				.setSem3Marks(80)
				.setSem4Marks(70)
				.setSem5Marks(86)
				.setSem6Marks(82)
				.build(),
				new Builder()
				.setRollNo(103)
				.setFirstName("Aishwary")
				.setLastName("Nashikkar")
				.setSem1Marks(75)
				.setSem2Marks(89)
				.setSem3Marks(90)
				.setSem4Marks(77)
				.setSem5Marks(60)
				.setSem6Marks(56)
				.build(),
				new Builder()
				.setRollNo(104)
				.setFirstName("Lokesh")
				.setLastName("Babu")
				.setSem1Marks(87)
				.setSem2Marks(98)
				.setSem3Marks(88)
				.setSem4Marks(96)
				.setSem5Marks(90)
				.setSem6Marks(91)
				.build(),
				new Builder()
				.setRollNo(105)
				.setFirstName("G")
				.setLastName("Venkata")
				.setSem1Marks(77)
				.setSem2Marks(78)
				.setSem3Marks(97)
				.setSem4Marks(90)
				.setSem5Marks(90)
				.setSem6Marks(81)
				.build()
				);
	}
}
