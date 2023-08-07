package Learn;

class Computer {

	// method overloading -> methods with same name but different number of
	// parameters or different parameter type

	// Note: if number of parameter and their types are same and return type is
	// different then it is not method overloading -> it will give error
	
	//https://www.tutorialspoint.com/difference-between-method-overloading-and-method-overriding-in-java#:~:text=Method%20overloading%20is%20a%20type,including%20the%20parameters%20and%20signature.
	public void playMusic() {
		System.out.println("Playing Music");
	}

	public void playMusic(String type) {
		System.out.println("Playing " + type + " Music");
	}
}

public class Methods {
	// main is the method where execution starts
	public static void main(String[] args) {

		Computer c = new Computer();
		c.playMusic();
		c.playMusic("jazz");
	}
}
