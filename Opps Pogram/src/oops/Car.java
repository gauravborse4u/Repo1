package oops;

public class Car implements Destination, Prop{

	@Override
	public void speed() {
		// TODO Auto-generated method stub
		System.out.println("Speed is 80kmph");
	}

	@Override
	public void Mileage() {
		// TODO Auto-generated method stub
		System.out.println("Mileage is 200");
	}

	@Override
	public void dest() {
		// TODO Auto-generated method stub
		System.out.println("Destination is XYZ");
	}

}
