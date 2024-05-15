package Learn;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

class exceptionDC extends Exception {
	public exceptionDC(String s) {
		super(s);
	}
}

public class ExceptionHandling {
	// compile time error
	// runtime error
	// logical error -> wrong logic/bug
	// exception -> can/cannot be recovered (e.g., ArithmeticException(can or cannot
	// be solved, depends on logic ..)
	// error -> cannot be recovered/handled (e.g., OutOfMemoryError)

	// if some method is throwing exception, while calling that method you have to
	// write try catch or re-throw it
	
	public static void main(String[] args) {
//		System.out.println(9 / 0);
//		System.out.println(
//				"this will not be executed as above statement is not in try catch and will throw an exception");
		
		
		try {
			System.out.println(9 / 1);
		} catch (ArithmeticException e) {
			System.out.println("will be executed only if Exception occured");
		} finally {
			System.out.println("---will always be executed");
		}
		System.out.println("This will be printed as exception is in try catch block");

		// multiple catch -> write specific exceptions first and then generic
		try {
			int num[] = new int[5];
			System.out.println(num[5]);

		} catch (ArithmeticException e) {// specific
			System.out.println("first exception");
//			System.out.println(e);
		} catch (Exception e) {// generic
			System.out.println("second exception");
//			e.printStackTrace(); 
		}

		// hierarchy
		// object class -> throwable class -> error class, exception class
		// exception class -> runtime exception, SQLexception, IO exception...
		// all runtime exceptions(Arithmetic, arrayIndexOutOfBound, nullPointer..) are
		// unchecked exception

		// checked vs unchecked
		// checked -> need to handle/compiler will ask to handle
		// unchecked -> handling it is not mandatory

		// throw and throws
		
		try {
			reThrowingException(); // need to handle as it is throwing exception
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());

		}
		handlingException(); // no need to handle already handled

		try {
			customException();
		} catch (exceptionDC e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}

		notHandlingException(); // Arithmetic Exception is unchecked so, it won't ask to handle compulsory
	}

	public static void reThrowingException() throws Exception {
		passingToParentException(); // if you are not handling exception thrown by passingToParentException() method
									// here, then need to
									// re-throw (mandatory in case of checked exception)(ducking exception)
	}

	public static void handlingException() {
		try {
			System.out.println(9 / 0);
		} catch (ArithmeticException e) {
			System.out.println("divide by zero");
		}
	}

	public static void notHandlingException() {
		System.out.println(9 / 0);
	}

	// we are telling that following method might throw and exception and it needs
	// to be handled from wherever it gets called
	public static void passingToParentException() throws Exception {
		throw new Exception("Hello there!!!!!!!!!!!!!!!!!!!!!!!!!"); // custom message
	}

	// custom Exception
	public static void customException() throws exceptionDC {
		throw new exceptionDC("It's me, exception DC");
	}
}
