package Learn;

// can have multiple children
class Vehicle { // parent/super/base class
	private String brand;
	private int year;

	public Vehicle(String brand, int year) {
		this.brand = brand;
		this.year = year;
	}

	public void startEngine() {
		System.out.println("The engine is started.: parent class");
	}
}

// if other class extends Car then Vehicle becomes grandparent
class Car extends Vehicle { // child/sub/derived class
	// Car is a specialized type of Vehicle
	private int numberOfDoors;

	public Car(String brand, int year, int numberOfDoors) {
		super(brand, year);
		this.numberOfDoors = numberOfDoors;
	}

	// Method overriding
	public void startEngine() {
		System.out.println("The engine is started.: child class");
	}

	public void honkHorn() {
		System.out.println("Honk! Honk!");
	}
}

class Person {
	// Person has a Vehicle
	private Vehicle vehicle;

	public Person(Vehicle vehicle) {
		this.vehicle = vehicle;
	}

	public void drive() {
		System.out.println("The person is driving a car.");
	}
}

public class Inheritance {
	// Need?
	// Person has a Vehicle -> 'has' => Composition
	// Car is a Vehicle -> 'is' => Inheritance
	public static void main(String[] args) {

		// Creating a Car object
		Car myCar = new Car("Toyota", 2023, 4);

		// Creating a Person object with a Car
		Person person = new Person(myCar);

		// Demonstrating "is-a" relationship
		myCar.startEngine(); // Inherited method from Vehicle
		myCar.honkHorn(); // Car-specific method

		// Demonstrating "has-a" relationship
		person.drive(); // Person has a Car

		// Dog extends Animal -> Single Inheritance
		// Labrador extends Dog, Dog extends Animal -> multilevel inheritance

		// multiple Inheritance??? -> NOT possible in java -> Ambiguity problem
		// reason: Suppose [class A extends B,C] and there is method called hello() in
		// both B and C then which one will be executed using object of A.

		// Method overriding
		System.out.println("*****Method Overriding*****");
		Vehicle v = new Vehicle("my branch", 2);
		v.startEngine();
		// first JVM searches for method in child class, if found then execute otherwise
		// check in parent class.
		myCar.startEngine();
	}
}
