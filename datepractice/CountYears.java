package datepractice;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class CountYears {
	public static void main(String[] args) throws InterruptedException {
		try(Scanner sc= new Scanner(System.in)){
			while(true) {
				try {
					System.out.print("Enter Date (DD-MM-YYYY): ");
					String date = sc.next();
					LocalDate pastDate = LocalDate.parse(date,DateTimeFormatter.ofPattern("dd-MM-yyyy"));
					LocalDate now = LocalDate.now();
					Period period = Period.between(pastDate, now);
					date = pastDate.getDayOfMonth()+" "+pastDate.getMonth()+", "+pastDate.getYear();
					String todayDate = now.getDayOfMonth()+" "+now.getMonth()+", "+now.getYear();
					System.out.println("Number of years between "+date+" and "+todayDate+" : "+period.getYears());
					break;
				}
				catch(Exception e) {
					System.err.println("=== Error in date format you entered ===");
					Thread.sleep(1000);
					System.out.println("Sorry something wrong");
				}
			}
		}
	}
}
