package org.rygn;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;




public class MainDateTimeFormatter {

	public static void main(String[] args) {
		
		try {
			LocalDateTime feteNationaleDt = LocalDateTime.of(2015, 7, 14, 23, 59, 59);
			
			DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MMM dd, yyyy - HH:mm");
			
			String feteNationaleDtAsString = formatter.format(feteNationaleDt);
			
			System.out.println("Have great time at " + feteNationaleDtAsString);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

}
