package Learn;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class Collections {
	public static void main(String args[]) {
		Collection num1 = new ArrayList(); // num1 will not have indexing
		List num2 = new ArrayList(); // num2 will have indexing
		num1.add(1);
		num1.add(2);
		System.out.println(num1);
		num2.add("hi");
		System.out.println(num2.get(0));

		// following for loop will give error because collection interface works with
		// object, so, data in num1 array is treated as object and not int. and you can
		// not store them in int.
//		for (int n : num1) {
//			System.out.println(n);
//		}

		// To solve above problem check below declaration
		Collection<Integer> num3 = new ArrayList<Integer>();
		// type defining on right is side is not mandatory after version 1.7
		Collection<Integer> numm = new ArrayList<>();
		num3.add(3);
		num3.add(4);
		// as type is mentioned following line will give compile time error
//		num3.add('5');
		for (int n : num3) {
			System.out.println(n);
		}

		// why type is so important? check below code.
//		Collection num4 = new ArrayList();
//		num4.add(3);
//		num4.add(4);
//		// Due to following line it will give runtime error in case type is not present.
//		num4.add("not number");
//		for (Object n : num4) {
//			int num = (Integer) n;
//			System.out.println(num);
//		}

		Set<Integer> num5 = new HashSet<Integer>(); // num2 will have indexing
		num5.add(10);
		num5.add(81);
		num5.add(1);
		num5.add(1);
		// no index on set + it doesn't follow sorted order while printing
		// no duplicates will be printed + sequence is not followed
		System.out.println(num5);

		Set<Integer> num6 = new TreeSet<Integer>(); // num2 will have indexing
		num6.add(10);
		num6.add(81);
		num6.add(1);
		num6.add(1);
		// no index on set + it does follow sorted order while printing
		// no duplicates will be printed + sequence is sorted
		System.out.println(num6);
		Iterator iter = num6.iterator();
		while (iter.hasNext()) {
			System.out.println(iter.next());

		}

		// why do we need map? -> keys are unique
		// to store data as key: value pair

		Map<String, Integer> students = new HashMap<String, Integer>();
		students.put("shreya", 26);
		students.put("devanshi", 25);
		students.put("Mishri", 3);
		students.put("Mishri", 6); // data will get updated and not added
		// sequence will not be followed
		System.out.println(students);

		System.out.println(students.keySet());
		for (String name : students.keySet()) {
			System.out.println(name + " : " + students.get(name));

		}
		System.out.println(students.values());

		// Difference b/w hashMap and hashTable?
		// -> both are same except one thing-> HashTable is synchronized and hashMap is
		// not
	}
}
