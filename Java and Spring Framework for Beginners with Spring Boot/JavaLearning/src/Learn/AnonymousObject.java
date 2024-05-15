package Learn;

class MyData {
	public MyData() {
		System.out.println("object created");
	}

	public void show() {
		System.out.println("show");
	}
}

public class AnonymousObject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// MyData myData = new MyData(); can be divided in two steps as below.
		MyData myData; // -> this creates reference variable inside static memory of main
		myData = new MyData(); // -> this creates actual object inside heap memory and assigns it's address to
								// reference variable created in first step.
		myData.show();
		// to access the show() method we need to create object of class A.

		// this also creates object(i.e., it will call constructor) in heap but we are
		// not assigning any reference variable in stack memory to point it.
		new MyData(); // -> this kind of objects called Anonymous object and it can not be used again.
		new MyData().show(); // -> Anonymous object
	}

}
