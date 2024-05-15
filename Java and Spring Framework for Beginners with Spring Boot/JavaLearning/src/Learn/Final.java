package Learn;
class  Cal1{
	public void show() {
		System.out.println("show");
	}
	public final void add(int a, int b) {
		System.out.println("add: "+ (a+b));
	}
}
class advCal1 extends Cal1 {
	public void show() {
		System.out.println("show");
	}
	
	// we can not override final methods
//	public void add(int a, int b) {
//		System.out.println("add: "+ (a+b));
//	}
}
final class  Cal2{
	public void show() {
		System.out.println("show");
	}
	public final void add(int a, int b) {
		System.out.println("add: "+ (a+b));
	}
}
//final class can not be inherited. 
//class advCal2 extends Cal2 {
//	
//}
public class Final {
	// final keyword can be used with variable/method/class.
	public static void main(String[] a) {
		final int i = 9;
		// final variable values can not be changed. 
		// i=10;
		Cal1 c = new Cal1();
		c.add(1,2);
	}
}
