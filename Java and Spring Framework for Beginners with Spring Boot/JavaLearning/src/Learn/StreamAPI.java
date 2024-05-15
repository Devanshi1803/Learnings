package Learn;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class StreamAPI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Streasm API introduced in version 1.8
		List<Integer> nums = Arrays.asList(1, 2, 3, 4);
		System.out.println(nums);
		// let's first look at different for loops
		for (int i = 0; i < nums.size(); i++) {
//			System.out.println(nums.get(i));
		}
		for (int n : nums) {
//			System.out.println(n);
		}

		// how forEach actually works?
		// forEach takes comsumer as parameter which is functional Interface
		Consumer con = new Consumer<Integer>() {

			@Override
			public void accept(Integer t) {
				// TODO Auto-generated method stub
				System.out.println(
						"foreach gives one value at a time and this method will get called for each of it " + t);

			}

		};
		nums.forEach(con);
		System.out.println("-----");

		// as Consumer is functional interface, we can write lambda expression like
		// this.
		nums.forEach(n -> System.out.println(n));

		// to perform some operation on above array.
		// e.g., filter even number and double the value and sum it in normal way
		int sum = 0;
		for (int n : nums) {
			if (n % 2 == 0) {
				n = n * 2;
				sum += n;
			}
		}

		System.out.println("sum:: " + sum);

		// above same thing using StreamAPI
		// nums will not get affected by operation performed using Stream
		Stream<Integer> s1 = nums.stream();

		// following code works same as forEach but here for example filter takes
		// Predicate as parameter instead of Consumer. Predicate is interface and it's
		// test method should define filter condition
		int streamSum = s1.filter(n -> n % 2 == 0) // filter even numbers
				.mapToInt(n -> n * 2) // double the value
				.reduce(0, (c, e) -> c + e);
		// following line will give runtime error as Stream object can be used only
		// once.
//		s1.forEach(n -> System.out.println(n));

		System.out.println("sum using StreamAPI " + streamSum);

		// Parallel Stream -> Stream + Thread
		List<Integer> largeData = new ArrayList<>(10000);
		for (int i = 0; i < 10000; i++) {
			Random rand = new Random();
			largeData.add(rand.nextInt(100));
		}
		System.out.println(largeData);
		// let's multiply each value by 2 and add using normal Stream and parallel
		// Stream
		long startTime1 = System.currentTimeMillis();
		int StreamSum = largeData.stream().mapToInt(i -> {
			try {
				Thread.sleep(1);
			} catch (Exception e) {
				System.out.println(e);

			}
			return i * 2;
		}).sum();
		long endTime1 = System.currentTimeMillis();

		System.out.println(StreamSum + " Sequential Stream " + (endTime1 - startTime1));
		long startTime2 = System.currentTimeMillis();

		int ParallelStreamSum = largeData.parallelStream().mapToInt(i -> {
			try {
				Thread.sleep(1);
			} catch (Exception e) {
				System.out.println(e);

			}
			return i * 2;
		}).sum();
		long endTime2 = System.currentTimeMillis();

		System.out.println(ParallelStreamSum + " parallel Stream " + (endTime2 - startTime2));

		// if parallel is taking more time then that might be due to time taken for
		// thread creation. it depends on machine you are using.

	}

}
