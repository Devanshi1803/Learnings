package Learn;

import java.util.ArrayList;

public class Copy {
public static void main(String[] arg) {
	ArrayList<String> str = new ArrayList<String>();
	str.add("Hello");
	ArrayList<String> scopy = str; //shallow copy
	ArrayList<String> dcopy = new ArrayList<String>(str); //deep copy
	System.out.println(str.get(0));
	System.out.println(scopy.get(0));
	System.out.println(dcopy.get(0));
	str.add(0, "Hi");
	System.out.println(str.get(0));
	System.out.println(scopy.get(0));
	System.out.println(dcopy.get(0));

}
}
