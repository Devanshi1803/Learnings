package Learn;

class base_class {
	public void show_base() {
		System.out.println("show base");
	}

}

class child_class extends base_class {
	public void show_child() {
		System.out.println("show child");
	}

}

public class Casting {
	public static void main(String[] args) {
		double d = 4.5;
		int i = (int) d; // type casting
		System.out.println(i); // data loss

		base_class base = new base_class();
		base.show_base();
		// error
		// base.show_child();
		child_class child = new child_class();
		child.show_base();
		child.show_child();
		base_class base_child = (base_class) new child_class(); // upcasting -> happens implicitely
		base_child.show_base();
		// error
		// base_child.show_child();
		child_class child_base =(child_class) base_child; // downcasting
		// now show_child can be called. 
		child_base.show_child();
	}
}
