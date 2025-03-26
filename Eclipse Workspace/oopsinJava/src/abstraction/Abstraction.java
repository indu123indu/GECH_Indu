package abstraction;

interface Animal{
	public void eat();
	
}

class Lion implements Animal{
	@Override
	public void eat() {
		System.out.println("Lion will eat me ");
	}
}

abstract class Vehicle{
	public abstract void start();
	
	public void stop() {
		System.out.println("The Vehicle is stopped");
	}
}

 class Car extends Vehicle{
	public  void start() {
	System.out.println("The Car is started");
 }
 public void stop() {
	 System.out.println("The Car key is stopped");
	 
 }
}


public class Abstraction {
	public static void main(String[] args) {
		
		Lion lion = new Lion();
		lion.eat();
		
		Car car = new Car();
		car.stop();
		car.start();
		
		
	}

}