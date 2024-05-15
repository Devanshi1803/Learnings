package Learn;

enum Status {
	// named constants
	failed, success, pending
}
enum Laptop {
	// named constants and its price
	macbook(1000), xps(2000), surface(1500), abc; // objects 
	private int price;
	// object without price can not be created if constructor without param given below is not written. 
	private Laptop(){ // constructor
		this.price = 400;
	}
	private Laptop(int price){ // constructor
		this.price = price;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
}
public class Enum {
	public static void main(String[] args) {
		// Status is class and everything inside it, is a class
		Status s = Status.failed;
		System.out.println(s);
		// prints index of status.
		System.out.println(s.ordinal());
		// to get all status
		Status[] sarray = Status.values();
		
		for (Status st : sarray) {
			System.out.println(st + " : " + st.ordinal());
		}

		// error
		// Status s1 = "vf";
		Status statusCheck = Status.failed;
		switch (statusCheck) {
		// statusCheck is type of 'Status' so no need to write Status.pending in case
		// but in case of if-else Status.<state> is required.
		case pending:
			System.out.println("--Pending");
			break;
		case failed:
			System.out.println("--Failed");
			break;
		case success:
			System.out.println("--Success");
			break;
		}
		if(statusCheck.equals(Status.pending)) {
			System.out.println("--Pending");

		}
		else if(statusCheck.equals(Status.failed)) {
			System.out.println("--Failed");

		}
		
		// enum is class but it can not be extend by other class.
		// enum in java extends Enum class. 
		System.out.println(s.getClass());

		System.out.println(s.getClass().getSuperclass());
		
		
		// laptop as class
		Laptop l = Laptop.macbook;
		
		// we can change value of price.
		System.out.println(l.getPrice());
		l.setPrice(3000);
		System.out.println(l.getPrice());
		for (Laptop lap : Laptop.values()) {
			System.out.println(lap + " : " + lap.getPrice());
		}

	}
}
