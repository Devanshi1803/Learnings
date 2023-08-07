package Learn;

//design calculator object
class calc {

	// public as it should be accessible from anywhere.
	public int add(int a, int b) {
		return a + b;
	}

	public int sub(int a, int b) {
		return a - b;
	}
}

public class Class_AND_Object {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// java -> object oriented programming -> everything is object
		// object knows something(properties) + it does something(methods/behavior)
		// blueprint -> JVM -> Object

		// e.g., phone is an object, you buy phone not design a phone. i.e, phone object
		// should handle all phone related functionalities

		// rather than having the following way to addition and subtraction of two
		// numbers we can have calc class which does everything for us
		int num1 = 2;
		int num2 = 3;
		int result = num1 + num2;
		System.out.println("direct way");
		System.out.println(result);
		result = num1 - num2;
		System.out.println(result);

		// calc class use
		// c called reference variable
		// new keyword asks JVM to provide space to c variable by creating an object of
		// type calc
		System.out.println("using class");
		calc c = new calc();
		System.out.println(c.add(num1, num2));
		System.out.println(c.sub(num1, num2));

	}

}
