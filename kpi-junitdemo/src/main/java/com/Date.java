package com;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;

public class Date {

	public static void LocalDateTimeApi() {
		LocalDate date = LocalDate.now();
		System.out.println("The Current date is " + date);

		LocalTime time = LocalTime.now();
		System.out.println("The Current date is " + time);

		LocalDateTime current = LocalDateTime.now();
		System.out.println("The Current Date and Time is " + current);

		DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-mm-yyyy hh:mm:ss");
		String formatedDateTime = current.format(format);
		System.out.println("In formatted manner " + formatedDateTime);

		Month month = current.getMonth();
		int day = current.getDayOfMonth();
		int second = current.getSecond();
		int hour = current.getHour();
		int year = current.getYear();

		System.out.println(
				"Year : " + year + " Month : " + month + " Day : " + day + " Hour : " + hour + " Second : " + second);
		
		
		LocalDate date2=LocalDate.of(1999, 10, 10);
		System.out.println("In Past " + date2);
		
		LocalDateTime specificDate=current.withDayOfMonth(24).withYear(2015);
		System.out.println("In Past " + specificDate);
	}

	public static void main(String a[]) {

		LocalDateTimeApi();
	}
}
