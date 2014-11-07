package org.rygn;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;




public class MainLocalDateTime {

	public static void main(String[] args) {
		
		try {
			LocalDateTime feteNationaleDt = LocalDateTime.of(2014, 7, 14, 23, 59, 59);
			
			ZoneId hereInLyon = ZoneId.of("Europe/Paris");
			
			ZonedDateTime nowHere = ZonedDateTime.of(feteNationaleDt, hereInLyon);
			
			ZoneId overThereInLA = ZoneId.of("America/Los_Angeles");
			
			ZonedDateTime feteNationaleOverThere = nowHere.withZoneSameInstant(overThereInLA);
			
			System.out.println("When it is " + feteNationaleDt + " here, it is " + feteNationaleOverThere + " in LA");
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

}
