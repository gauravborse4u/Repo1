package com;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Details2 {

	public static void find() {
		
		LocalDate date = LocalDate.now();
		System.out.println("Current Date is : " + date);
		
		LocalDate year = date.plus(8, ChronoUnit.YEARS);
		System.out.println("Next date in 2030 is  : " + year);
	}
	
	public static void main(String a[]) {
		find();
		//Output : Current Date is : 2022-10-07
		//Next date in 2030 is  : 2030-10-07
	}
	
}
