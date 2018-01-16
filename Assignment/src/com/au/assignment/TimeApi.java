package com.au.assignment;

import java.time.ZonedDateTime;

import java.util.Date;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;

public class TimeApi {

   public static void main(String args[]) {
	   TimeApi java8tester = new TimeApi();
      java8tester.testZonedDateTime();
   }
	
   public void testZonedDateTime() {
      
      Date currentDate = new Date();
      Instant now = currentDate.toInstant();
      
      
      ZoneId currentZone= ZoneId.of("Asia/Calcutta");
	  LocalDateTime localDateTime = LocalDateTime.ofInstant(now, currentZone);
      System.out.println("Asia/Calcutta Local date: " + localDateTime);
      
      ZoneId currentZone1= ZoneId.of("Europe/London");
	  LocalDateTime localDateTime1 = LocalDateTime.ofInstant(now, currentZone1);
      System.out.println("Europe/London Local date: " + localDateTime1);
      
      
      ZoneId currentZone2= ZoneId.of("America/New_York");
	  LocalDateTime localDateTime2 = LocalDateTime.ofInstant(now, currentZone2);
      System.out.println("America/New_York Local date: " + localDateTime2);
      
      ZoneId currentZone3= ZoneId.of("Africa/Johannesburg");
	  LocalDateTime localDateTime3 = LocalDateTime.ofInstant(now, currentZone3);
      System.out.println("Africa/Johannesburg Local date: " + localDateTime3);
      
      
      ZoneId currentZone4= ZoneId.of("America/Chicago");
	  LocalDateTime localDateTime4 = LocalDateTime.ofInstant(now, currentZone4);
      System.out.println("America/Chicago Local date: " + localDateTime4);
      
    
      
      
   }
}