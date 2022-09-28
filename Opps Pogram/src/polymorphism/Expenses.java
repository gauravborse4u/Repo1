package polymorphism;

public class Expenses extends Employee {

	int exp=100;
	
	
	void salary() {
		salary -= exp;
		System.out.println("Your Salary after expenses is : " + salary);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Expenses e1=new Expenses();
		
		e1.salary();
	}

}
