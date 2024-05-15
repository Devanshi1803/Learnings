package Learn;

import java.util.Objects;

class A_class {

}

class B_class {
	private int a = 5;
}

class C_class {
	private int a = 5;

	public String toString() {
		return "hi";

	}

	

	// for object to be same, everything including hashcode should be same. so,
	// instead of writing by yourself, use IDE option to create one as given below. 
//	public boolean equals(C_class obj) {
//		return this.a == obj.a;
//	}
	
	@Override
	public int hashCode() {
		return Objects.hash(a);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		C_class other = (C_class) obj;
		return a == other.a;
	}
}

//every class in java extends 'Object' class. 
public class ObjectClass {
	public static void main(String[] args) {
		A_class a = new A_class();
		// though we don't have anything in class A_class, we have so many method
		// options to
		// call on this object.

		// to understand following outputs, check toString() method of Object class.
		System.out.println(a.toString());
		// printing object also calls toString() by default.
		System.out.println(a);

		B_class b = new B_class();
		System.out.println(b.toString());
		// printing object also calls toString() by default.
		System.out.println(b);

		// to get desired output toString method can be override in any class.
		C_class c = new C_class();
		System.out.println(c.toString());

		A_class a1 = new A_class();
		A_class a2 = new A_class();
		System.out.println(a1 == a2);
		// default equals compares hash-value of objects
		System.out.println(a1.equals(a2));

		// you can override equals method based on requirement.
		C_class c1 = new C_class();
		C_class c2 = new C_class();
		System.out.println(c1.equals(c2));
	}
}
