package Learn;

public class string {
	public static void main(String[] args) {

		// all primitive datatype in java starts with small alphabet
		// string is not a primitive datatype, it is class in java
		String name1 = new String("Devanshi");
		// without new keyword also, it works
		String name2 = "Chandegra";
		System.out.println(name1 + " " + name2);
		System.out.println(name1.hashCode() + " " + name2.hashCode());
		System.out.println(name1.charAt(1) + " " + name2.concat(" hi"));

		// as String is a class in java, whenever we create string object it will be
		// stored inside heap memory and its address will be stored inside stack of that
		// particular method against the name of that variable.

		String s1 = "hi"; // it is constant and can not be updated
		String s2 = "hi";
		System.out.println(s1 == s2); // this gives true means s1 and s2 points to same object in heap memory of JVM
		// There is something called "string constant pool" in heap memory of JVM. so,
		// whenever we create string constant it checks inside constant pool and create
		// new constant if it doesn't exists already.
		// in above case when it comes to s2 variable, "hi" constant will already be
		// present inside constant pool so its address will directly be stored inside s2
		// variable of main stack
		s1 = s1 + " hello";

		// when we do s1 = s1+" hello", we are not changing the value inside constant
		// pool as it is constant and can not be updated. but we are creating new
		// constant with new value inside heap and value of s1 inside stack will be
		// updated by address of new constant

		// constants which are not pointed by any variable will be removed by garbage
		// collector

		// mutable string-> can be changed
		// Immutable string-> cannot be changed
		// by default all stings are immutable
		System.out.println("-----Mutable String-----");
		// to create mutable string we have StringBuffer and StringBuilder class in java
		StringBuffer str1 = new StringBuffer("Devanshi");
		StringBuffer str2 = new StringBuffer();
		// StringBuffer gives 16 character space even if it is empty
		System.out.println(str1 + " " + str2);
		System.out.println(str1.capacity() + " " + str2.capacity()); // o/p: 24 16
		System.out.println(str1.length() + " " + str2.length());  //8 0 
		// for str1 space will be 24 character i.e., extra 16 character space will be
		// given every time
		// reason behind extra 16 character extra space: every time we create new string it is
		// stored in contiguous memory inside heap and whenever there is no contiguous
		// memory available we will need to relocate the string, and to reduce number of
		// relocation extra space is provided
		
		str1.append(" Chandegra"); //str1 value will be changed as it is mutable
		System.out.println(str1);
		
		// String stringBuff = str1; //will not work
		String stringBuff = str1.toString(); 
		System.out.println(stringBuff);
		
		//StringBuffer is thread safe and StringBuilder is not

	}
}