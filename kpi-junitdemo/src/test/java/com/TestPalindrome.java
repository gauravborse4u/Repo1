package com;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestPalindrome {

	@Test
	public void testpalindrome() {
		assertEquals(false, Palindrome.palindrome(123));
	}
}
