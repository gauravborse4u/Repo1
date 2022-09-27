package shapes;

public class Rectangle extends Area {
	
	String name="Rectangle";
	void myname() {
		System.out.println("I am Rectangle");
	}

	public static void main(String[] args) {
		
		Rectangle r1=new Rectangle();
		r1.myname();
		r1.area(r1.name);

	}

}
