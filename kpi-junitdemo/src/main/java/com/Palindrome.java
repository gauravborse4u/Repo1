package com;

public class Palindrome {

	int n;

	public static boolean palindrome(int n) {

		int r, sum = 0, temp;
		temp = n;
		while (n > 0) {
			r = n % 10;
			sum = (sum * 10) + r;
			n = n / 10;
		}
		if (temp == sum)
			return true;
		else
			return false;
	}
}
