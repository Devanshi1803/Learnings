package Learn;

public class TypeConversion {
	public static void main(String[] args) {
		byte b = 127;
		int a = 256; 
		b = (byte)a; //modulo:: it will do a%(range of byte(i.e, -127 to 127 = 256)) 
		System.out.println(b); //data loss as 256 is > 1byte
		a = 5; 
		b = (byte)a; 
		System.out.println(b); //5 belongs to (-127, 127)(byte range so no data loss) 
		a = (int)5.6; 
		System.out.println(a); //prints 5 -> data loss
		byte num1 = 10;
		byte num2 = 30;
		int result = num1*num2; //300 is not in range of byte so can be stored in integer like this
		System.out.println(result);
		
	}
}
