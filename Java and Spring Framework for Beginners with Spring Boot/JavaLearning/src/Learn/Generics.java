package Learn;

class Box<T> {
	private T data;

	public  void setData(T data) {
		this.data = data;
	}

	public T getData() {
		return data;
	}

	public static <T> void doTheThing(T parameter) {
		// This method can perform actions on the parameter of type T
		// But it's not immediately clear what methods can be called on T
		// due to the generic nature of T.
		System.out.println("Doing the thing with: " + parameter);
	}
}

// The issue here is that within the Container2 class, dataItem is of type T, which could be any class. 
// If doTheThing() is not a method that exists on every possible type that could be substituted for T, 
// calling dataItem.doTheThing() will cause a compilation error because the compiler cannot guarantee that 
// this method exists for all potential types.
class Container2<T> {
	private T dataItem;

	public Container2(T dataItem) {
		this.dataItem = dataItem;
	}

	public void doSomething() {
		// This attempts to call a method on dataItem, but it's generic, so we can't be
		// sure
		// if the method exists on every possible type T could be substituted with.
		// This line will cause a compilation error.
		// dataItem.doTheThing();
	}

	public T getDataItem() {
		return dataItem;
	}
}

interface Doable {
	void doTheThing();
}

class Container<T extends Doable> {
	private T dataItem;

	public Container(T dataItem) {
		this.dataItem = dataItem;
	}

	public void doSomething() {
		// Now, because T extends Doable, we can be sure that any object
		// assigned to dataItem will have the doTheThing() method.
		dataItem.doTheThing();
	}

	public T getDataItem() {
		return dataItem;
	}
}

//Sample classes implementing the Doable interface
class DoableClass implements Doable {
	@Override
	public void doTheThing() {
		System.out.println("Doing the thing in DoableClass");
	}
}

class AnotherDoableClass implements Doable {
	@Override
	public void doTheThing() {
		System.out.println("Doing the thing in AnotherDoableClass");
	}
}

public class Generics {
	public static void main(String[] args) {
		Box<String> str = new Box();
		Box<Integer> i = new Box();

		str.setData("hi");
		i.setData(2);
		// Attempting to call methods on the generic parameter
        // Uncommenting this will result in a compilation error
        // i.doTheThing("hi").getClass(); // This won't compile

		// Creating a Container with a class that implements Doable interface
		DoableClass doableObj = new DoableClass();
		Container<DoableClass> doableContainer = new Container<>(doableObj);
		doableContainer.doSomething(); // Calls doTheThing() method

		// Creating a Container with a class that doesn't implement Doable interface
		// This will result in a compilation error
		// UnDoableClass unDoableObj = new UnDoableClass();
		// Container<UnDoableClass> unDoableContainer = new Container<>(unDoableObj);

		// You can also have other classes implementing Doable interface
		AnotherDoableClass anotherDoableObj = new AnotherDoableClass();
		Container<AnotherDoableClass> anotherDoableContainer = new Container<>(anotherDoableObj);
		anotherDoableContainer.doSomething(); // Calls doTheThing() method

	}
}
