package Learn;

class loadWithoutObjectCreation{
	static {
		System.out.println("**********loading class without creating any object of this class**********");
	}
}

class Mobile {
	// instance variables -> stored inside heap of particular object
	String brand;
	int price;
	static String name; // it belongs to class not object

	// we can initialize static variable inside constructor but it will be
	// initialized every time we create an object, rather it should be initialized
	// only once. for that we have concept of static block. check below.
	public Mobile() {
		System.out.println("**********Inside constructor**********");
		brand = "";
		price = 200;
		name = "phone";
	}

	// static block. it will be called only once. it doesn't matter how many objects
	// you create, it will be called only once.
	// static method will get called before constructor. because inside heap when
	// you create object of Mobile, you will need reference to static variable name
	// **every time you create object, two things happens in sequence, 
	// 1) class loads
	// 2) objects are instantiated
	// class loading happens only once, in JVM we have special area called "class loader". 
	// "class loader" contains all the loaded class and by default there will not be
	// any class.
	// when you create your *first object*(as class load happens only once) of
	// class, it gets loaded from library to "class loader".
	// when class gets loaded, we call static block, so since class loading happens
	// first, and that's why we call static block first
	// if you don't create any object  -> neither constructor nor static block will get called. 
	// how to load class(call static block) without creating object?? -> [**] 
	static {
		System.out.println("**********Inside static block**********");
		name = "phone2";
		// non-static can not be initialized here.
		// price = 90;
	}

	// instance method
	public void show() {
		System.out.println("Brand ::" + brand);
		System.out.println("price ::" + price);
		System.out.println("name ::" + name);
		System.out.println();
	}

	public static void show1() {
		// non static variables can not be used inside static method
		// because when you call Mobile.show1(), JVM won't figure out which branch and
		// price variable to use.
		// System.out.println("Brand ::" + brand);
		// System.out.println("price ::" + price);
		System.out.println("name(show1) ::" + name);
		System.out.println();
	}

	// how to use non-static variables inside static method
	public static void show2(Mobile obj) {
		System.out.println("Brand ::" + obj.brand);
		System.out.println("price ::" + obj.price);
		System.out.println("name ::" + name);
		System.out.println();
	}

}

public class Static {

	// why main method is static?
	// ->if main is non-static then we can not call it without object of
	// Static(class name in which main is defined)
	// class define above it. and main is starting point of execution so, if we need
	// to create object of Static class to call it, where can we create without
	// starting point? it's kind of deadlock situation if main is non-static.
	public static void main(String[] args) throws ClassNotFoundException{
		// TODO Auto-generated method stub
		// for obj1 and obj2 both space will be allocated in heap.
		// static -> if any instance variable is static then that will be stored as
		// common between all objects inside heap and will be shared by all objects.
		// for obj1 and obj2 JVM will create two different objects with brand and price
		// variable but name variable will be stored as common between both the objects
		// as it is static
		Mobile obj1 = new Mobile();
		obj1.brand = "Apple";
		obj1.price = 1500;
		obj1.name = "smart phone";

		Mobile obj2 = new Mobile();
		obj2.brand = "Apple1";
		obj2.price = 1501;
		obj2.name = "smart phone 2"; // changing name variable of obj2 will change value for obj1 also

		// as name is static we can call it with class name also.
		Mobile.name = "class name";
		obj1.show();
		obj2.show();

		obj1.show1();
		// static method call
		Mobile.show1();

		Mobile.show2(obj1);
		
		// [**]
		// forName method will just load class without instantiating objects
		// forName can throw classNotFoundException
		Class.forName("Learn.loadWithoutObjectCreation");
				

	}

}
