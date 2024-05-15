package Learn;

class PolyParent {
	public void show() {
		System.out.println("*parent*");
	}
}

class PolyChild1 extends PolyParent {
	
	// overriding
	public void show() {
		System.out.println("*child*");
	}
	
	// overloading
	public void show(int a) {
		System.out.println("*overloading*");
	}
}

public class Polymorphism {
	// Polymorphism => many + behavior
	// two type: compile time(early binding) & run time(late binding)

	// overloading -> part of compile time polymorphism
	// overriding, dynamic method dispatch -> part of run time polymorphism

	public static void main(String[] args) {
		PolyChild1 c1 = new PolyChild1();
		c1.show(); 
		// PolyChild1 is PolyParent but vice versa is not true.
		// PolyChild1 c2 = new PolyParent();
		// reference variable of super class and object of sub class
		PolyParent c2 = new PolyChild1();
		c2.show();

		// dynamic method dispatch -> below thing is called dynamic method dispatch.
		PolyParent c3 = new PolyParent();
		c3.show();
		// following line only works when you have inheritance(PolyChild1 is extending
		// PolyParent).
		c3 = new PolyChild1(); // reference variable in main stack will update its address from PolyParent's
								// object address to PolyChild1's object address
		c3.show();
	}
}
