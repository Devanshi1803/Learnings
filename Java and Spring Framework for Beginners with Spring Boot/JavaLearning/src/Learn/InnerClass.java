package Learn;

class OuterClass {
	// variable
	private int myint;
	private InnerClass1 in;

	// method
	public void mymethod() {
		System.out.println("My Method");
	}

	// class
	class InnerClass1 {
		public void innerClassmethod() {
			System.out.println("Inner Class Method");
		}
	}

	static class InnerClass2 {
		public void staticInnerClassmethod() {
			System.out.println("Inner static Class Method");
		}
	}
}

class OuterAnonymousClass {

	// method
	public void myAnonymousmethod() {
		System.out.println("----");
	}
}

abstract class AbstractAnonymousClass {

	// method
	public abstract void abstractAnonymousmethod();
}

public class InnerClass {
	public static void main(String[] args) {
		OuterClass o = new OuterClass();
		o.mymethod();
		// Object of InnerClass1 can not be created outside outer class of it.
//		InnerClass1 i = new InnerClass1();
//		i.innerClassmethod();

		// the way we need OuterClass object to call myint and mymethod, we need that to
		// create object of InnerClass1 also
		OuterClass.InnerClass1 i1 = new OuterClass().new InnerClass1();
		i1.innerClassmethod();

		// If inner class(ex, InnerClass2) is static then no need to create object of
		// OuterClass
		OuterClass.InnerClass2 i2 = new OuterClass.InnerClass2();
		i2.staticInnerClassmethod();

		// note:: outer class can not be static

		// what if we want to change behavior of myAnonymousmethod() without creating
		// child class and overriding it
		// following way of writing logic is called anonymous class concept.
		// when you want to use overridden method only once, it is good idea to use
		// anonymous inner class rather than creating complete new class.
		OuterAnonymousClass oa = new OuterAnonymousClass() {
			public void myAnonymousmethod() {
				System.out.println("--haha--");
			}
		};
		oa.myAnonymousmethod();

		// abstract + anonymous
		
		// we are creating object of anonymous inner class and not AbstractAnonymousClass. 
		// AbstractAnonymousClass is abstract class, it's object can not be created.
		AbstractAnonymousClass aac = new AbstractAnonymousClass() {
			public void abstractAnonymousmethod() {
				System.out.println("--abstract anonymous--");
			}
		};
		aac.abstractAnonymousmethod();

	}
}
