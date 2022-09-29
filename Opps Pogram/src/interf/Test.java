package interf;


interface I1{
	abstract void name();
	default void add(int a, int b) {
		System.out.println("Addition is :" + (a+b));
	}
	static void show() {
		System.out.println("This is an static method");
	}
}
public class Test implements I1{

	@Override
	public void name() {
		// TODO Auto-generated method stub
		System.out.println("This is an Abstract Method");
	}
	
	public static void main(String args[]) {
		Test t=new Test();
		
		t.name();
		t.add(70,40);
		I1.show();
	}

}
