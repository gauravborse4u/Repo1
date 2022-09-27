package oops;

public abstract class Bike {
	abstract void run();
	
}

class Honda extends Bike{
	
	@Override
	void run() {
		System.out.println("Running Honda Bike");
		
	}
}

class Discover extends Bike{

	@Override
	void run() {
		System.out.println("Running Discover Bike");
		
	}
	
}
