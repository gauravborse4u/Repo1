package com;

import java.time.LocalDate;

public class Details {

	public static void find() {

		LocalDate date = LocalDate.of(2022, 1, 26);
		System.out.println("Republic Day " + date);

		System.out.println(date.getDayOfWeek());
		System.out.println(date.getMonth());
		System.out.println(date.getYear());
	}

	
	public static void main(String a[]) {
		find();
	}
}
