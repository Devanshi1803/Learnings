package Learn;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class OptionalClass {
	public static void main(String[] args) {
		List<String> names = Arrays.asList("devanshi", "shreya", "mishri");

		// The findFirst() method is a terminal operation in the Java Stream API that
		// returns an Optional containing the first element of the stream, or an empty
		// Optional if the stream is empty.
		Optional<String> name = names.stream().filter(str -> str.contains("x")).findFirst();
		System.out.println(name.orElse("Not Found"));
		String name1 = names.stream().filter(str -> str.contains("i")).findFirst().orElse("Not Found");
		System.out.println(name1);

		Optional<String> name2 = names.stream().filter(str -> str.contains("x")).findFirst();
		System.out.println(name2.get());


	}
}
