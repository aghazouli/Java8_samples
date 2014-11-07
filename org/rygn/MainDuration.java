package org.rygn;

import java.time.Duration;
import java.time.Instant;


public class MainDuration {

	public static void main(String[] args) {
		
		try {
			Instant now = Instant.now();
			
			System.out.println("Now it is : " + now);
			
			Duration tenSeconds = Duration.ofSeconds(10);
			
			Instant inTenSeconds = now.plus(tenSeconds);
			
			System.out.println("In ten seconds it will be : " + inTenSeconds);
			
			Duration twentySeconds = Duration.ofSeconds(20);
			
			Instant inTwentySeconds = inTenSeconds.plus(twentySeconds);
			
			long ms = Duration.between(now, inTwentySeconds).toMillis();
			
			System.out.println("Total interval : " + ms + "ms");
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

}
