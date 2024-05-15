package Learn;

public class ConstructorKeyword {
	private int i;
	private String j;

	// default constructor
	// if you use this constructor for creating object then for that object 'i' will
	// be 0 and 'j' will be null.
	public ConstructorKeyword() {

	}
	
	//overloaded constructor
	public ConstructorKeyword(int i, String j) {
		this.i = i;
		this.j = j;
	}
}
