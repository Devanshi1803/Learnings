package Learn;

class A0 {
	public void show2() {
		System.out.println("in show a");
	}
}

class B0 extends A0 {
	// Every time we change name of method defined in parent class, we'll need to
	// change the name of child class method. -> if method names are not same, then
	// it can cause an issue. so, to avoid such issues we write @override annotation
	// to tell compiler that following method is supposed to be an overridden method
	// and let me know if it is not happening.

	// Annotations are to show intentions to the compiler.
	@Override // annotation here ensures that method name is matching with parent class method
				// name.
	public void show2() {
		System.out.println("in show b");
	}
}

public class Annotation {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// it is extra information we give to compiler or runtime
		// java have many in-built annotations. some are method level, some are at class
		// level etc.
		B0 b = new B0();
		b.show2();
	}

}
