package Introduction;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Streams {

	// count the number of names starting with alphabet A in list

	@Test
	public void regular() {

		ArrayList<String> name = new ArrayList<String>();
		name.add("Abhijeet");
		name.add("Don");
		name.add("Alekhya");
		name.add("Adam");
		name.add("Raj");

		int count = 0;

		for (int i = 0; i < name.size(); i++) {

			String actual = name.get(i);
			if (actual.startsWith("A")) {

				count++;

			}

		}

		System.out.println(count);

	}

	@Test
	public void streamFilter() {

		ArrayList<String> name = new ArrayList<String>();
		name.add("Abhijeet");
		name.add("Don");
		name.add("Alekhya");
		name.add("Adam");
		name.add("Raj"); //
		// there is no life for intermediate operation if there is no terminal operation
		// terminal operation will execute only if intermediate operation (filter)
		// //returns true // we can create stream // how to filter in Stream API Long c
		// =
		name.stream().filter(s -> s.startsWith("A")).count(); // Lambda ExpressionOperator -> System.out.println(c)); //
																// OR
		Long d = Stream.of("Abhijeet", "Don", "Alekhya", "Adam", "Raj").filter(s -> {
			s.startsWith("A"); // {} forlonger expression 
			return true;
		}).count();

		System.out.println(d);

		name.stream().filter(s -> s.length() > 4).forEach(s -> System.out.println(s));
		name.stream().filter(s -> s.length() > 4).limit(1).forEach(s -> System.out.println(s));

	}

	@Test
	public void streamMap() {

		ArrayList<String> name = new ArrayList<String>();
		name.add("Ram");
		name.add("Sita");
		name.add("Ravan");

		// print names which has last letter "a" with uppercase
		Stream.of("Abhijeet", "Don", "Alekhya", "Adam", "Raj").filter(s -> s.endsWith("a")).map(s -> s.toUpperCase())
				.forEach(s -> System.out.println(s));

		// print names which have first letter as a with uppercase and sorted
		List<String> names = Arrays.asList("Abhijeet", "Don", "Alekhya", "Adam", "Raj");
		names.stream().filter(s -> s.startsWith("A")).sorted().map(s -> s.toUpperCase())
				.forEach(s -> System.out.println(s));

		// merging 2 different lists
		Stream<String> newStream = Stream.concat(name.stream(), names.stream());
		// newStream.sorted().forEach(s->System.out.println(s));
		boolean flag = newStream.anyMatch(s -> s.equalsIgnoreCase("Adam"));
		System.out.println(flag);
		Assert.assertTrue(flag);

	}
	
	@Test
	public void streamCollect() {
		
		List<String> ls = Stream.of("Abhijeet", "Don", "Alekhya", "Adam", "Raj").filter(s->s.endsWith("a"))
		.map(s->s.toUpperCase()).collect(Collectors.toList());
		System.out.println(ls.get(0));
		
		//print unique numbers for this array
		List<Integer> values = Arrays.asList(3,2,2,7,5,1,9,7);
		values.stream().distinct().forEach(s->System.out.println(s));
		
		//sort the array - 3rd index -1,2,3,5,7,9
		List<Integer> li = values.stream().distinct().sorted().collect(Collectors.toList());
		System.out.println(li.get(2));

	}

}
