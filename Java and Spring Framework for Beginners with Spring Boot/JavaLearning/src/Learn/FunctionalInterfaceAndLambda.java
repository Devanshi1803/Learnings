package Learn;

@FunctionalInterface // it ensures that this interface has only one method.
interface AInterface {
	void myMethod();
}
@FunctionalInterface // it ensures that this interface has only one method.
interface BInterface {
	void myMethodWithParam(int i);
}
@FunctionalInterface // it ensures that this interface has only one method.
interface CInterface {
	int myMethodWithReturnType();
}

class BA implements AInterface {
	public void myMethod() {
		System.out.println("Hi My class");

	}
}

public class FunctionalInterfaceAndLambda {
	public static void main(String[] args) {
		// functional Interface are the interface which has only one method declared in
		// it.
		// we can use lambda expression only with functional interface.

		// normal way to use interface
		AInterface a = new BA();
		a.myMethod();

		// using anonymous inner class
		AInterface a2 = new AInterface() {
			public void myMethod() {
				System.out.println("anonymous inner class");
			}
		};
		a2.myMethod();

		// lambda expression -> simplify anonymous inner class
		// As AInterface is functional interface, compiler will not have to worry which
		// method it is and how to map.
		AInterface a3 = () -> {
			System.out.println("lambda expression");
		};
		a3.myMethod();

		AInterface a4 = () -> System.out.println("'{}' not needed if method has only one line of code.");
		a3.myMethod();
		
		// lambda expression with parameter
		// mentioning type is also not mandatory
		// BInterface b = (param) -> System.out.println(param); // valid
		BInterface b = (int param) -> System.out.println(param);
		b.myMethodWithParam(2);
		
		// mentioning type is also not mandatory
		// BInterface b = (param) -> System.out.println(param); // valid
		
		// in case of one variable no need to mention '()'
		// BInterface b = param -> System.out.println(param); // valid
		
		// lambda expression with return type
		CInterface c = () ->{ return 9;};
		System.out.println(c.myMethodWithReturnType());
		
		
		//following is also valid
		CInterface c2 = () -> 9;
		System.out.println(c2.myMethodWithReturnType());

		
		// *******Types of Interface
		// 1) Normal Interface
		//    -> can have more than one method declared in it
		// 2) Functional Interface(SAM Interface)(SAM - Single Abstract Method)
		//    -> can have only one method declared in it
		// 3) Marker Interface
		//    -> no method declared in it
		//    -> USE: read from internet

		
	}
}
