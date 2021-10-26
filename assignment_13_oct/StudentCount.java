package assignment_13_oct;

import java.util.List;

public class StudentCount {
	public static void main(String[] args) {
		List<Student> students = Student.getStudents();
		long count = students
		.stream()
		.filter(name->name.getFirstName().startsWith("Y"))
		.count();
		
		System.out.println("Students count whose name starts with Y : "+count);
	}

}
