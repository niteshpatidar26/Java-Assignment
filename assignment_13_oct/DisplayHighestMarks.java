package assignment_13_oct;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;

public class DisplayHighestMarks {
	public static void main(String[] args) 
	{
		List<Student> students = Student.getStudents();
		students.forEach(x->{
			Map<String,Integer> map = new HashMap<>();
			System.out.println("************************** Student *************************************");
			map.put("Semester 1",x.getSem1Marks());
			map.put("Semester 2",x.getSem2Marks());
			map.put("Semester 3",x.getSem3Marks());
			map.put("Semester 4",x.getSem4Marks());
			map.put("Semester 5",x.getSem5Marks());
			map.put("Semester 6",x.getSem6Marks());
			Optional<Entry<String,Integer>> min = map
					.entrySet()
					.stream()
					.min((o1,o2)->o1.getValue().compareTo(o2.getValue()));
			Optional<Entry<String,Integer>> max = map
					.entrySet()
					.stream()
					.max((o1,o2)->o1.getValue().compareTo(o2.getValue()));
			
			System.out.println("Name : "+x.getFirstName()+" "+x.getLastName());
			System.out.println("Roll No : "+x.getRollNo());
			if(max.isPresent()) {
				System.out.println("Highest Marks : "+max.get().getValue() + " in "+max.get().getKey());				
			}
			if(min.isPresent()) {
				System.out.println("Lowest Marks : "+min.get().getValue() + " in "+min.get().getKey());				
			}
			System.out.println("************************************************************************");
		});
	}

}
