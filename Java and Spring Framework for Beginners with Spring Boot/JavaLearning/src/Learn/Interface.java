package Learn;

abstract class abstractClass {

	// abstract class can have (0 or more) abstract method + (0 or more) normal
	// method.
	public abstract void m1();

	public void m2() {
		System.out.println("method2");
	}
}

interface myInterface {
	// ->If in abstract class all the methods are abstract then that can also be
	// defined by interface.
	// ->Interface is not a Class, while abstract class is a Class
	// -> by default every method of an interface is 'public abstract'
	public abstract void m1();

	public void m2();

	void m3();

	// interface can have variables, by default they are 'final and static'
	// reason for this is, we don't create instance of interface and when we
	// implement interface, we override methods and not variables. so, If it is not
	// final and static then we never get a chance to assign values to it.
	int i = 44;

	// following will give an error, because final variables should be assigned some
	// value.
	// int j;

}
interface otherInterface{
	void m4();
}
// Like classes, Interface can extend other Interface("extends")
interface hello extends otherInterface
{
	void m5();
}
// Unlike classes, multiple inheritance is also possible
interface multipleInheritance extends otherInterface,myInterface
{
	void m6();
}
// all methods of interface should be overridden if class is not an abstract class. 
class classInterface implements myInterface, otherInterface {

	@Override
	public void m1() {
		// TODO Auto-generated method stub
		System.out.println("m1");

	}

	@Override
	public void m2() {
		// TODO Auto-generated method stub
		System.out.println("m2");

	}

	@Override
	public void m3() {
		// TODO Auto-generated method stub
		System.out.println("m3");

	}

	@Override
	public void m4() {
		// TODO Auto-generated method stub
		System.out.println("m4");

	}

}

public class Interface {
	public static void main(String[] args) {
		myInterface interfaceAnonymousInnerClass = new myInterface() {
			@Override
			public void m3() {
				// TODO Auto-generated method stub
				System.out.println("anonymous Inner m3");

			}

			@Override
			public void m2() {
				// TODO Auto-generated method stub
				System.out.println("anonymous Inner m2");

			}

			@Override
			public void m1() {
				// TODO Auto-generated method stub
				System.out.println("anonymous Inner m1");
			}
		};
		interfaceAnonymousInnerClass.m1();
		interfaceAnonymousInnerClass.m2();
		interfaceAnonymousInnerClass.m3();
		classInterface cin = new classInterface();
		cin.m1();
		cin.m2();
		cin.m3();

		// access interface variables
		System.out.println(myInterface.i);
		// interface variables are final, so, can not be changed.
		// myInterface.i = 3;
		
		// note: class can implements more than one interface at a time 
		// note: interface can extends other interface same as classes. 
		
		// interface -extends--> interface
		// class -implements--> interface
		// class -extends--> class
		
		otherInterface other = new classInterface();
		other.m4(); // m1, m2 and m3 can not be called by this object. 
		myInterface my = (myInterface)other;
		my.m1(); // m4 can not be called by this object. 
		my.m2();
		my.m3();
		
	}
}
