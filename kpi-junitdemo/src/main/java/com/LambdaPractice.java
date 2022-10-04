package com;

@FunctionalInterface
interface MathOperation {

	int operation(int a, int b);
	
}

public class LambdaPractice {

	private int operate(int a, int b, MathOperation mathOperation) {
	      return mathOperation.operation(a, b);
	   }
	
	public int addition(int a, int b) { 
		return a+b;
	}
	
	public int subtraction(int a, int b) { 
		return a-b;
	}
	
	public int multiplication(int a, int b) { 
		return a*b;
	}
	
	public int division(int a, int b) { 
		return a/b;
	}
	
	

	public static void main(String[] args) {
		
		

		// TODO Auto-generated method stub

		LambdaPractice tester=new LambdaPractice();
		
		MathOperation addition=(int a, int b) -> a+b;
		
		MathOperation subtraction=(a, b) -> a-b;
		
		MathOperation multiplication=(a, b) -> { return a*b;};
		
		MathOperation division=(int a, int b) -> a/b;
		
		System.out.println(tester.operate(40,50, addition));
		System.out.println(tester.operate(40,50, subtraction));
		System.out.println(tester.operate(40,50, multiplication));
		System.out.println(tester.operate(400,50, division));
		
	}

}
 