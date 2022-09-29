package Exhandling;

import java.util.Scanner;

public class Exphandling {
	
	
	static void divide(int a, int b) {
		int result=a/b;
		System.out.println(result);
	}
	

	public static void main(String args[]) {
						
		try {
			
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Enter 1 Number : ");
			int a=sc.nextInt();
			System.out.println("Enter 2 Number : ");
			int b=sc.nextInt();

			divide(a, b);
		}
		catch(Exception e) {
			System.out.println("Exception generated : " + e.getMessage());
		}
	}
}
