package com;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestOrder {

	@Test
	public void check() {
		  
		Order o2=new Order("XYZ", "Initiate", "29Sep");
		
		assertEquals(123, o2.OrderId);
		
		assertEquals("XYZ", o2.SecurityCode);
		
		assertEquals("Initiate", o2.OrderStatus);
		
		assertEquals("29Sep", o2.OrderDate);
	}

}
