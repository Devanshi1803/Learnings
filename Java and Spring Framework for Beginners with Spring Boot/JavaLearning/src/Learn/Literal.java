package Learn;

public class Literal {
	public static void main(String[] args) {
		int num1 = 9; //9 is literal 
		System.out.println(num1);
		int num2 = 0b101; //base 2
		System.out.println(num2);
		int num3 = 0x7E; //hexadecimal 
		System.out.println(num3);
		int num4 = 10_000_0; //to handle multiple zeros -> more readable
		System.out.println(num4);
		double num5 = 56; //implicit type casting
		System.out.println(num5);
		double num6 = 12e10; //12^10
		System.out.println(num6);
		char c = 'a';
		System.out.println(c+1); //can be treated as integer
		c++; 
		System.out.println(c);
		String str = "hello world";
		System.out.println(str);
	}
}
