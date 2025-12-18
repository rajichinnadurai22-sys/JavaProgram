package Java.syntax;

abstract class Vehicle {

	// Abstract method (no body)
	abstract void start();

	// Normal method
	void fuelType() {
		System.out.println("Uses fuel");
	}
}

class Car extends Vehicle {

	// Implementing abstract method
	void start() {
		System.out.println("Car starts with a key");
	}
}

public class AbstractMain {
	public static void main(String[] args) {
		Vehicle v = new Car();
		v.start();
		v.fuelType();
	}
}
