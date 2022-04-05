package com.java8;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;

public class BothDateAndTime {  // from here we can get both date and time from one class
	
	public static void main(String[] args) {
		
		LocalDateTime dt=LocalDateTime.now();  //All the method of LocalDate and LocalTime API is avaliable here also
		System.out.println(dt);
		
		LocalDateTime lt1=LocalDateTime.of(1993, 01, 15, 10, 45);
		System.out.println(lt1);
		
		System.out.println("Date after 1 months" +dt.plusMonths(1));
		
		System.out.println("Date before 1 months" +dt.minusMonths(1));
		
		
		//Period Calculation between 2 date Example
		
		LocalDate todayDate=LocalDate.now();
		
		System.out.println(todayDate);
		LocalDate bday=LocalDate.of(1992, 01, 15);
	
        Period p=Period.between(todayDate, bday);
        
        System.out.println(p.getDays() +"-" +p.getMonths() +"-" +p.getYears());
        
		
	}

}
