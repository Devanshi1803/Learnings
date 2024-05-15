package Learn;


//we are encapsulating data and methods here and that is encapsulation 
class Human {
	int age;
	String name;
	private String password;

	// following methods can have other constraints and based on that we can provide
	// more security.
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}

public class Encapsulation {
	public static void main(String a[]) {
		Human h = new Human();
		h.age = 11;
		h.name = "Devanshi";
//		h.password = "abs";
		// ->currently anyone can access name variable using object instance. -> no 
		// security
		// ->not all data should be directly accessible
		// for that we can use private keyword as used in password variable
		System.out.println(h.name);

		// As password is private following will give error.
		// h.password = "pwd@1803";

		// how to access the data? -> via methods
		h.setPassword("pwd@1803");
		System.out.println(h.getPassword());

	}
}


