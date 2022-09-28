package polymorphism;

public class Expenses extends Employee {

	int exp=10000;
	
	
	void salary() {
		salary -= exp;
		System.out.println("Your Salary after expenses is : " + salary);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Employee ex1=new Expenses();
		
		ex1.salary();
	}

}
