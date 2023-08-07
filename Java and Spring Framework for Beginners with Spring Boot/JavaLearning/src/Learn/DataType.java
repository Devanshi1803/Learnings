package Learn;

public class DataType {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//primitive datatype -> Integer/Float/Character/Boolean
		//subcategories
		//Integer -> 
			//byte(1 byte = 8 bit => range -2^7 to 2^7 - 1), 
			//short(to save memory if number is not large -> 2 byte), 
			//int(4 byte), 
			//long(to store bigger value-8 byte)
		//Float -> double(default, 8 byte), float(4 byte)
		//Char -> 2 byte (UNICODE -> bigger range in compare to ASCII)
		float marks = (float) 6.5; //(type casting is needed as default is double or write f at last)
		float marks1 = 6.5f; 
		double markss = 6.5; 
		byte a = 2; 
		char c = 'd'; //single quote accepts one character only + double quotes also not allowed
		boolean b = true; 
		int val1 = 9; 		
		byte b1 = (byte) 129; //129 is not in range of byte to gives error without type casting
		System.out.println(b1);  //prints -127
		long l = 6786l; //write l at last to define long value

	}

}
