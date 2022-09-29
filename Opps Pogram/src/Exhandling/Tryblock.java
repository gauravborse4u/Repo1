package Exhandling;

import java.util.Scanner;

public class Tryblock {

    public static void main(String args[]) {
    	int a, b;
    	
    	int c;
    	
    	try(Scanner sc=new Scanner(System.in);Scanner sc1=new Scanner(System.in)){
    		c=sc.nextInt()/sc1.nextInt();
    		
    		System.out.println("Result :" + c);
    	}
    	catch(Exception e) {
    		System.out.println("Exception generated :" + e.getMessage());
    	}
    	finally {
    		System.out.println("Executed");
    	}
    }

}
