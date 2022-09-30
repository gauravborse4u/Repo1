package com;

public class Order {

	int OrderId = 123;
	String SecurityCode;
	String OrderStatus;
	String OrderDate;

	Order(String scode, String Ostatus, String Odate) {
		SecurityCode = scode;
		OrderStatus = Ostatus;
		OrderDate = Odate;
	}
}
