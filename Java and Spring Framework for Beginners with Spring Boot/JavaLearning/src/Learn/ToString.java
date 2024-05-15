package Learn;
class Dummy {
	
	private int n;
//	private String str;
	public Dummy(int n) {
//		System.out.println("object created");
		this.n =n;
//		this.str = str;
	}
	
	public void show() {
		System.out.println("show");
	}

//	public String toString() {
//		return "hello";
//	}
}
public class ToString {
	public static void main(String[] args) {
		Dummy d1 = new Dummy(1);
		System.out.println(d1.toString());
		StringBuilder s = new StringBuilder();
		s.append("hi");
		System.out.println(s.toString());
		
	}
}
