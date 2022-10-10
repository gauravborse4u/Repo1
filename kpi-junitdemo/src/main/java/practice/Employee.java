package practice;

public class Employee implements Salary, Leave {

	int salary, leave;
	String name;

	Employee() {
		name = "Gaurav";
	}

	Employee(int salary, int leave) {
		this.salary = salary;
		this.leave = leave;
	}

	@Override
	public void Total_leave() {
		// TODO Auto-generated method stub
		System.out.println("Leaves are : " + leave);
	}

	@Override
	public void salary() {
		// TODO Auto-generated method stub
		System.out.println("Salary is : " + salary);
	}

	@Override
	public void Official_leave() {
		// TODO Auto-generated method stub

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Employee e1 = new Employee(20000, 2);
		e1.salary();
		e1.Total_leave();

		Employee e2 = new Employee();
		System.out.println(e2.name);

	}

}
