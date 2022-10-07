package com;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class ChronoDate {

	public static void checkingChronoEnum() {
		LocalDate date = LocalDate.now();
		System.out.println("Current date : " + date);

		LocalDate year = date.plus(1, ChronoUnit.YEARS);
		System.out.println("Next Year : " + year);

		LocalDate month = date.plus(1, ChronoUnit.MONTHS);
		System.out.println("Next Month : " + month);

		LocalDate week = date.plus(1, ChronoUnit.WEEKS);
		System.out.println("Next Week : " + week);

		LocalDate decade = date.plus(2, ChronoUnit.DECADES);
		System.out.println("20 Year from today : " + decade);
	}

	public static void main(String a[]) {
		checkingChronoEnum();

	}

}
