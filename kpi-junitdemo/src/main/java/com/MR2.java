package com;

public class MR2 {

	public static void ThreadStatus() {
		System.out.println("Running...");
	}
	
	public static void main(String a[]) {
		Thread t1=new Thread(MR2::ThreadStatus);
		t1.start();
	}
	
}
