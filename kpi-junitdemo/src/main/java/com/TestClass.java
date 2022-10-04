package com;

import java.util.ArrayList;
import java.util.List;

@FunctionalInterface
interface test {
	void testing(List t);
}

public class TestClass {

	int rollno;
	String name;
	
	public int getRollNo() {
		return rollno;
	}
	
	public int setRollNO(int rollno) {
		return this.rollno=rollno;
	}
	
	public String getName() {
		return name;
	}
	
	public String setName(String name) {
		return this.name=name;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TestClass t1=new TestClass();
		TestClass t2=new TestClass();
		TestClass t3=new TestClass();
		List<TestClass> list=new ArrayList();
		
		list.add(t1);
		list.add(t2);
		list.add(t3);
		
		list.forEach(t -> t2.getRollNo());
		

	}
}
