package org.rygn;

import java.time.Instant;
import java.time.temporal.ChronoUnit;

public class MainInstant {

	public static void main(String[] args) {
		
		try {
			Instant justBeforeNow = Instant.now();
			
			Thread.sleep(10);
			
			Instant now = Instant.now();
			
			System.out.println("Now it is : " + now);
			
			Thread.sleep(10);
			
			Instant justAfterNow = Instant.now();
			
			System.out.println("Before is before now ? " + justBeforeNow.isBefore(now));
			
			System.out.println("After is after now ? " + justAfterNow.isAfter(now));
			
			Instant inTwoHours = now.plus(2, ChronoUnit.HOURS);
			
			System.out.println("In two hours it will be : " + inTwoHours);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

}
