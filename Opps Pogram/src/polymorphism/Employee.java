package polymorphism;

public class Employee extends Finance  {

	public int salary=20000;
	

	@Override
	void salary() {
		// TODO Auto-generated method stub
		System.out.println("Your Salary is :" + salary);
	}

	@Override
	void salary(int increment) {
		// TODO Auto-generated method stub
		salary=salary + increment;
		System.out.println("Your Incremented Salary is :" + salary);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Employee e1=new Employee();
		
		e1.salary();
		e1.salary(1000);
		
	}

}
