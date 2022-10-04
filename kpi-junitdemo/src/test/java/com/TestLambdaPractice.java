package com;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestLambdaPractice {

	@Test
	public void check_op() {
		LambdaPractice L1 = new LambdaPractice();

		int add = L1.addition(5, 2);
		assertEquals(7, add);
		
		int sub = L1.subtraction(5, 2);
		assertEquals(3, sub);
		
		int mul = L1.multiplication(5, 2);
		assertEquals(10, mul);
		
		int div = L1.division(16, 2);
		assertEquals(8, div);
	}

}
