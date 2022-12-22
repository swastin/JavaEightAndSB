package com.swastin.javaEight.Streamapi;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamApiDemo {

	private static boolean allMatch;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* input/create stream */
		Stream<Integer> intStream = Stream.of(1, 2, 3, 4);// this create integer stream
		intStream.forEach(System.out::println);
		/* streambuilder */
		Stream<Object> build = Stream.builder().add(1).add(2).add(3).build();
		build.forEach(System.out::println);
		/* Stream Generator */
		Stream.generate(new Random()::nextInt).limit(10).forEach(System.out::println);
		/* Stream using Iterate */
		Stream.iterate(10, n -> n + 10).limit(50).forEach(System.out::println);

		/* Intermediate and terminal operation */
		System.out.println("----Intermediate and terminal opeartion--------");
		System.out.println("----Even-----");
		Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9).stream().filter((x -> x % 2 == 0)).collect(Collectors.toList())
				.forEach(System.out::println);
		System.out.println("----odd-----");
		Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9).stream().filter((x -> x % 2 != 0)).collect(Collectors.toList())
				.forEach(System.out::println);
		System.out.println("----Count number of element-----");
		/* Map operation */
		Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9).stream().map(x -> x * x).forEach(System.out::println);
		/* FlatMap operation */
		Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9).stream().flatMap(num -> Stream.of(num)).forEach(System.out::println);
		/* Distinct Element */
		Arrays.asList(1, 2, 3, 3, 4, 5, 5, 10, 11, 12, 13, 15, 15, 1, 2, 4).stream().distinct()
				.forEach(System.out::println);
		/* peak element */
		// Arrays.asList(1,2,3,3,4,5,5,10,11,12,13,15,15,1,2,4).stream().peek()
		Stream.of("one", "two", "three", "four", "seventy", "eighty", "ninety").filter(e -> e.length() > 3)
				.peek(e -> System.out.println("Filtered value: " + e)).map(String::toUpperCase)
				.peek(e -> System.out.println("Mapped value: " + e)).collect(Collectors.toList());
		/* Reduce operation */
		System.out.println("--------Reduce operation-----------");
		System.out.println(
				Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10).stream().reduce(0, (sum, element) -> sum + element)
				);
		/*Terminal operations*/
		System.out.println("--------------findAny------------");
		Integer integer = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10).stream().findAny().get();
		System.out.println(integer);
		System.out.println("-------------findFirst-------------");
		Integer integer2 = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10).stream().findFirst().get();
		System.out.println(integer2);
		
		/*AnyMatch,allMatch,noneMatch*/
		System.out.println("--------------allMatch------------");
		 System.out.println(Arrays.asList(2, 3, 4, 5, 6, 7, 8, 9, 10).stream().allMatch(x->x<2)); 
		 System.out.println(Arrays.asList("sw","swa","sa","sahoo").stream().allMatch(x->x.startsWith("s"))); 
		 System.out.println("--------------noneMatch------------");
		 System.out.println(Arrays.asList(2, 3, 4, 5, 6, 7, 8, 9, 10).stream().noneMatch(x->x<2)); 
		 System.out.println(Arrays.asList("sw","swa","sa","sahoo").stream().noneMatch(x->x.startsWith("s")));
		 System.out.println(Arrays.asList("sw","swa","sa","sahoo").stream().anyMatch(x->x.startsWith("s")));
		 
	}

}
