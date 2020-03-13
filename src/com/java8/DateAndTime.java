package com.java8;

import java.time.LocalDate;
import java.time.LocalTime;

public class DateAndTime {
	public static void main(String[] args) {
		
		
		LocalTime time=LocalTime.now();
		System.out.println(time);
		
		
		int hr=time.getHour();
		int min=time.getMinute();
		int sec=time.getSecond();
		System.out.println("Current time is "+hr +"-" +min +"-" +sec);
		
		LocalDate date=LocalDate.now();
		
		System.out.println(date);
		
		int dateoftheMonth=date.getDayOfMonth();
		int month=date.getMonthValue();
		int year=date.getYear();
		
		System.out.println("Current time is "+dateoftheMonth +"-" +month +"-" +year);
	}

}
