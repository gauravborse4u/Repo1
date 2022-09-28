package interf;


interface I1{
	void name();
	default int color() {
		return 1;
	}
}
public class Test implements I1{

	@Override
	public void name() {
		// TODO Auto-generated method stub
		
	}
	
	public static void main(String args[]) {
		Test t=new Test();
		
		t.name();
		t.color();
	}

}
