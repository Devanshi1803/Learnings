package Learn;

import java.util.Arrays;
import java.util.List;

public class MethodReference {
	public static void main(String[] args) {
		List<String> names = Arrays.asList("devanshi", "shreya", "mishri");
		List<String> unames = names.stream().map(name -> name.toUpperCase()).toList();
		System.out.println(unames);
		// Method references in Java provide a shorthand notation for lambda expressions
		// when calling a method. They allow you to refer to a method by its name
		// instead of providing a full lambda expression. Method references make the
		// code more concise and improve readability.
		List<String> unames1 = names.stream().map(String::toUpperCase).toList();
		unames1.forEach(System.out::println);

	}
}
