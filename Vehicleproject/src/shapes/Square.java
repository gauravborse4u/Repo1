package shapes;

public class Square extends Area{
	
	String name="Square";
	void myname() {
		System.out.println("I am Square");
	}

	public static void main(String[] args) {
	
		Square s1=new Square();
		s1.myname();
		s1.area(s1.name);
		
	}

}
