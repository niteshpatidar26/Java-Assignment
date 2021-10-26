package assignment_13_oct;

import java.util.Comparator;
import java.util.List;

public class SortStudents {
	public static void main(String[] args) {
		List<Student> students = Student.getStudents();
		
		Comparator<Student> cmp = (ob1,ob2)->{
			if(ob1.getRollNo() > ob2.getRollNo())
				return -1;
			else if(ob1.getRollNo()<ob2.getRollNo())
				return 1;
			else
				return 0;
		};
		
		students
		.stream()
		.sorted(cmp)
		.forEach(System.out::println);
	}

}
