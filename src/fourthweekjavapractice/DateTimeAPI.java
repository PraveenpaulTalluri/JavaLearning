package fourthweekjavapractice;

import java.time.*;

public class DateTimeAPI {
	public static void main(String[] args) {
		
		LocalDate localDate = LocalDate.now();
		LocalTime localTime = LocalTime.of(12, 20);
		LocalDateTime localDateTime = LocalDateTime.now(); 
		OffsetDateTime offsetDateTime = OffsetDateTime.now();
		ZonedDateTime zonedDateTime = ZonedDateTime.now(ZoneId.of("Europe/Paris"));
		
		
		System.out.println(localDate);
		System.out.println(localTime);
		System.out.println(localDateTime);
		System.out.println(offsetDateTime);
		System.out.println(zonedDateTime);
	
	}
}
