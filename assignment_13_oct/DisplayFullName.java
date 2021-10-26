package assignment_13_oct;

import java.util.List;

public class DisplayFullName {
	public static void main(String[] args) {
		List<Student> students = Student.getStudents();
		System.out.println("----- Students Names -----");
		students
		.forEach(x->System.out.println(x.getFirstName().toUpperCase()+" "+x.getLastName().toUpperCase()));
		System.out.println("-----------------------------------");
	}

}
