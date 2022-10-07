package com;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;

public class AdjustersDate {

	public static void CheckingAdjusters() {
		LocalDate date = LocalDate.now();
		System.out.println("Current Date is : " + date);
		
		LocalDate dayOfNextMonth = date.with(TemporalAdjusters.firstDayOfNextMonth());
		System.out.println("First Day Of Next Month : " + dayOfNextMonth);
		
		LocalDate NextSaturday = date.with(TemporalAdjusters.next(DayOfWeek.SATURDAY));
		System.out.println("Next Saturday form now : " + NextSaturday);
		
		LocalDate FirstDay = date.with(TemporalAdjusters.firstDayOfMonth());
		System.out.println("First Day Of  Month : " + FirstDay);
		
	}
	
	public static void main(String a[]) {
		
		CheckingAdjusters();
	}
}
