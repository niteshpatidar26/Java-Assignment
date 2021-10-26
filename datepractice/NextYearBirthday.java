package datepractice;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class NextYearBirthday {
	public static void main(String[] args) throws InterruptedException 
	{
		try(Scanner sc = new Scanner(System.in))
		{
			while(true) {
				try {
					System.out.print("Enter Date of Birth (DD-MM-YYYY) : ");
					String dob = sc.next();
					DateTimeFormatter pattern = DateTimeFormatter.ofPattern("dd-MM-yyyy");	
					LocalDate birthDate = LocalDate.parse(dob, pattern);
					LocalDate localDate = LocalDate.of(LocalDate.now().getYear(),birthDate.getMonth(),birthDate.getDayOfMonth());
					System.out.println("Your Date of Birth :"+dob);
					System.out.println("This year yours birthday is on '"+localDate.getDayOfWeek()+"'");
					localDate = localDate.plusYears(1);
					System.out.println("Next Year yours birthday is on '"+localDate.getDayOfWeek()+"'");
					break;
				}
				catch(Exception e) 
				{
					System.err.println("=== Error in date format you entered ===");
					Thread.sleep(1000);
					System.out.println("*** Try Again ****");
				}
			}
		}
	}
}
