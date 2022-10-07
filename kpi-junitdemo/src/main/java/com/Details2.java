package com;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjusters;

public class Details2 {

	public static void find() {
		
		LocalDate date = LocalDate.now();
		System.out.println("Current Date is : " + date);
		
		LocalDate year = date.plus(8, ChronoUnit.YEARS);
		System.out.println("Next date in 2030 is  : " + year);
		
		LocalDate day=year.with(TemporalAdjusters.next(DayOfWeek.WEDNESDAY));
		System.out.println("Next Wed of the 2030 : " + day);
	}
	
	public static void main(String a[]) {
		find();
		//Output : Current Date is : 2022-10-07
		//Next date in 2030 is  : 2030-10-07
		//Day of the Wed : 2030-10-09
	}
	
}
