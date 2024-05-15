package Learn;

public class WrapperClass {
	public static void main(String[] args) {
		// java is not 100% object oriented. there are many primitive datatypes(int,
		// double,..) and other things which are not class and does not extends Object
		// class.
		// This thing makes java faster, how?
		// -> This are not objects so doesn't get stored in heap memory like other
		// objects, which is time consuming to access.

		// There are some frameworks in java which works only with objects, ex.
		// Collection. Collection is like Arraylist, but it can not store primitive
		// types. so to work with such frameworks, we need wrapper classes.

		// wrapper class(extends Object class) -> for every primitive type in java, we
		// have wrapper class.
		// int -> Integer
		// char -> Character
		// double -> Double

		int i = 7;
		Integer i_class = i;
		System.out.println(i_class.toString()); // as Integer extends Object class, we can use toString() method.

		// strike out value represents deprecated syntax. i.e., it was used but now we
		// have better syntax. (given below)
		Integer i_class1 = new Integer(2);
		System.out.println(i_class1);

		Integer i_class2 = 3;
		System.out.println(i_class2);
		
		System.out.println("Boxing");

		//Boxing and autoBoxing
		int _i = 17;
		// boxing means (primitive -> class/object) conversion
		Integer boxing = new Integer(_i); // boxing
		Integer autoBoxing = _i; // autoBoxing
		System.out.println(autoBoxing.toString());

		
		System.out.println("UnBoxing");

		// unBoxing and autoBoxing
		// unBoxing means (class/object -> primitive) conversion
		Integer _i_ = new Integer(20); 
		int unBoxing = _i_.intValue(); // unBoxing
		int autoUnBoxing = _i_; // autoUnBoxing
		System.out.println(autoUnBoxing);
		
	}
}
