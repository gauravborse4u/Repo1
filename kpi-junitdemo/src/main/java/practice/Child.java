package practice;

public class Child extends Parent implements Fun_Interf {

	int a;
	String str;

	Child() {
		str = "This is sample String";
	}

	@Override
	public void get(int a) {
		// TODO Auto-generated method stub
		System.out.println("Value of parameter \"" + a + "\" Calling Get() : Child");
	}

	public void show2() {
		System.out.println("Value of str is \"" + str + "\" Calling Show() : Child");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Parent c1 = new Child();
		c1.get();
		c1.show();

		Child c2 = new Child();
		c2.get(55);
		c2.show2();

	}

}
