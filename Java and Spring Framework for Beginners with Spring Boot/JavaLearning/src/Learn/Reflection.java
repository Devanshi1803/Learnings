package Learn;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Type;

class Cat {
	private final String name;
	private int age;
	public Cat() {
		this.name = "final";
        
    }
	public Cat(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void publicMethod() {
		System.out.println("Public method without param");
	}

	public void publicMethodWithParam(int a, String st) {
		System.out.println("Public method with param");
	}

	private void privateMethod() {
		System.out.println("Private method");
	}

	public static void publicStaticMethod() {
		System.out.println("Public static method");
	}

	private static void privateStaticMethod() {
		System.out.println("Private static method");
	}
}

public class Reflection {

	public static void main(String[] args) {
		// reflection is a feature that allows you to inspect and manipulate classes,
		// interfaces, fields, methods, and constructors at runtime. It provides a way
		// to examine and modify the structure and behavior of classes, even if you
		// don't have access to their source code.
//		Cat myCat = new Cat("HiCat", 1);
		try {
			// Dynamically load the class using Class.forName()
			Class cat = Class.forName("Learn.Cat");
			
			// Instantiate the class using newInstance()
			Cat myCat = (Cat)cat.getDeclaredConstructor().newInstance();
//			Cat c = new Cat();
			// Cast the instance to your class type and invoke a method
			if (myCat instanceof Cat) {
				Cat obj = (Cat) myCat;
				obj.publicMethod();
			}

			Field[] fields = cat.getDeclaredFields();
			for (Field field : fields) {
				System.out.println(field.getName());
			}
			System.out.println();

			// name can not be changed as it is final and private.
			// myCat.name = "changeName";
			// But with reflection without making any changes to actual code of Cat class,
			// we can force java to change the name of Cat object
			System.out.println("Before: " + myCat.getName());

			for (Field field : fields) {
				if (field.getName().equals("name")) {
					field.setAccessible(true);
					try {
						field.set(myCat, "newName");
					} catch (IllegalArgumentException | IllegalAccessException e) {
						e.printStackTrace();
					}
				}
			}
			// we changed final and private variable
			System.out.println("After: " + myCat.getName());

			System.out.println();

			// same as fields, we can also get all the method details of the class.
			Method[] methods = cat.getDeclaredMethods();
			for (Method method : methods) {
				System.out.println(method.getName());
			}
			System.out.println();

			// we can trigger any method using reflection
			for (Method method : methods) {
				// invoke method without parameter
				if (method.getName().equals("publicMethod")) {
					try {
						method.invoke(myCat);
					} catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
						e.printStackTrace();
					}
				}

				// invoke method with parameter
				if (method.getName().equals("publicMethodWithParam")) {
					try {
						method.invoke(myCat, 1, "myString");
						for(Type t: method.getParameterTypes()) {
							System.out.println("--"+t);
							System.out.println(method.getReturnType( ));

						}
					} catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
						e.printStackTrace();
					}
				}

				// invoke method private method
				if (method.getName().equals("privateMethod")) {
					method.setAccessible(true);
					try {
						// private method can to called using reflection
						method.invoke(myCat);
						// private method can not be called as below
						// myCat.privateMethod();
					} catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
						e.printStackTrace();
					}
				}

				// invoke static method
				if (method.getName().equals("publicStaticMethod")) {
					try {
						// we don't need class object to call static method, so pass null
						method.invoke(null);
					} catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
						e.printStackTrace();
					}
				}

				if (method.getName().equals("privateStaticMethod")) {
					method.setAccessible(true);
					try {
						// we don't need class object to call static method, so pass null
						method.invoke(null);
					} catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
						e.printStackTrace();
					}
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
