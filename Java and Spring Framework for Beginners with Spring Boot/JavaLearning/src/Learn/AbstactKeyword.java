package Learn;


//A class with an abstract method must be marked as abstract 
// An abstract class is not required to have any abstract methods
abstract class absClass {
	public void m1() {
		// not sure how to implement?? -> no code written here

		// this is method declaration
		// if you don't know implementation then instead of declaring method, define it
		// like m3.
	}

	public void m2() {
		System.out.println("method2");
	}

	// I'm giving abstract idea of feature, you have to define it when you extend.
	public abstract void m3();

	public abstract void m4();

}

abstract class myAbs extends absClass {

	// when you extend abstract class, you have to implement all the abstract method
	// of base class -> if you don't want that then define this class also as
	// abstract class
	@Override
	public void m3() {
		// TODO Auto-generated method stub
		System.out.println("method3");

	}

}

class myAbs2 extends myAbs { // concrete class -> its object can be created and extends abstract class
	@Override
	public void m4() {
		// TODO Auto-generated method stub
		System.out.println("method4");

	}

}

public class AbstactKeyword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// object of abstract class can not be created.
//		absClass ab = new absClass();
//		ab.m1();
//		ab.m2();
		absClass abs = new myAbs2();
		abs.m3();
		myAbs2 mab = new myAbs2();
		mab.m1();
		mab.m2();

		// nested abstract classes are also possible (class -extends--> abstract class
		// -extends--> abstract class)
	}

}
