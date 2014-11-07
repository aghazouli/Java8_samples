package org.rygn;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.temporal.ChronoUnit;

import com.sun.org.apache.bcel.internal.generic.L2D;




public class MainZonedDateTime {

	public static void main(String[] args) {
		
		try {
			LocalDate birthday = LocalDate.of(1978, Month.AUGUST, 25);
			
			System.out.println("I was born a " + birthday.getDayOfWeek());
			
			LocalTime now = LocalTime.now();
			
			LocalTime endOfWorkshop = LocalTime.of(17, 30, 00);
			
			System.out.println("Workshop will end at " + endOfWorkshop);
			
			System.out.println("We have " + ChronoUnit.MINUTES.between(now, endOfWorkshop) + " minutes left");
			
			
			LocalDateTime nowDt = LocalDateTime.now();
			
			LocalDateTime nextChristmas = LocalDateTime.of(2014, 12, 25, 00, 00, 00);
			
			System.out.println("Still " + ChronoUnit.DAYS.between(nowDt, nextChristmas) + " days before Christmas");
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

}
