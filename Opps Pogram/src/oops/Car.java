package oops;

public class Car implements Destination, Prop{

	String desti;
	
	Car(){
		desti="Pune";
	}
	
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
	public void dest(String d) {
		// TODO Auto-generated method stub
		System.out.println("Your Destination is :" + d);
	}
	
	public void mydest() {
		System.out.print("Car destination is :" + desti);
	}
	
	public static void main(String args[]) {
		
		Car c1=new Car();
		
		c1.speed();
		c1.Mileage();
		c1.dest("Nashik");
		c1.mydest();
		
	}

}
