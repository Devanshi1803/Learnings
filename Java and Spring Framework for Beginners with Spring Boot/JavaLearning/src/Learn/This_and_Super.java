package Learn;

//every class in java extends 'Object' class by default even if you don't mention as below. toString(), equals(), and hashCode() are Object class's method
class A extends Object {
	private int ina;

	public A() {
		// following super method exists in first line of every constructor in java by
		// default.
		// super(); // this refers to the constructor of Object class
		System.out.println("Inside A class: 0 param");
	}

	public A(int ina) {
		System.out.println("Inside A class: 1 param");
		this.ina = ina;
	}

	public int getIna() {
		return ina;
	}

	public void setIna(int ina) {
		this.ina = ina;
	}

}

// B class is not not extending 'Object' class, we have defined A class explicitly. 
// B extends A and A extends Object -> this is called multilevel inheritance.
class B extends A {
	private int inb;

	public B() {
		super(); // this method exists in first line of every constructor in java by default.
		System.out.println("Inside B class: 0 param");
		// super(); // error: Constructor call must be the first statement in a
		// constructor
	}

	public B(int ina) {
		// by default super() will be called, that is default constructor of class A, if
		// you want to call overloaded constructor of A then explicitly define as below.
		super(ina);
		System.out.println("Inside B class: 1 param");
	}

	public B(int ina, int inb) {
		// if you want to call another constructor of same class then use this keyword
		// as below.
		this(ina);
		System.out.println("Inside B class: 2 param");
		this.inb = inb;
	}

	public int getInb() {
		return inb;
	}

	public void setInb(int inb) {
		this.inb = inb;
	}

}

public class This_and_Super {
	public static void main(String[] args) {
		// constructor of both class will be called

		System.out.println("************");
		B b = new B(1, 2);
		System.out.println("************");
		B b1 = new B(5);
		System.out.println("************");
		B b2 = new B();
		System.out.println("Inside B class");
		System.out.println(b.getIna());
		System.out.println(b.getInb());

	}
}
