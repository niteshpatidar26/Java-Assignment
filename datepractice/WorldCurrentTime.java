package datepractice;

import java.io.IOException;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class WorldCurrentTime {
	public static void main(String[] args) throws InterruptedException, IOException 
	{
			System.out.println("-------------Time in Different Countries---------------");
			DateTimeFormatter formatter = DateTimeFormatter.ofPattern("hh:mm:ss a");

			ZoneId zone = ZoneId.of("BST", ZoneId.SHORT_IDS);
			LocalTime now = LocalTime.now(zone);
			System.out.println("\nTime in London : " + now.format(formatter));

			zone = ZoneId.of("CET", ZoneId.SHORT_IDS);
			now = LocalTime.now(zone);
			System.out.println("\nTime in Berlin : " + now.format(formatter));

			zone = ZoneId.of("EST", ZoneId.SHORT_IDS);
			now = LocalTime.now(zone);
			System.out.println("\nTime in New York : " + now.format(formatter));

			zone = ZoneId.of("IST", ZoneId.SHORT_IDS);
			now = LocalTime.now(zone);
			System.out.println("\nTime in Mumbai : " + now.format(formatter));

			zone = ZoneId.of("SST", ZoneId.SHORT_IDS);
			now = LocalTime.now(zone);
			System.out.println("\nTime in Singapore : " + now.format(formatter));	
	}
}
