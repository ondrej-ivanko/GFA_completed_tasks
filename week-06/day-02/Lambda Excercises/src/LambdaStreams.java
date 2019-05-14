import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.stream.Collectors.*;


public class LambdaStreams {

	static List<Integer> numbers = Arrays.asList(1, 3, -2, -4, -7, -3, -8, 12, 19, 6, 9, 10, 14);
	static List<Integer> numbers2 = Arrays.asList(3, 9, 2, 8, 6, 5);
	static List<Integer> numbers3 = Arrays.asList(5, 9, 1, 2, 3, 7, 5, 6, 7, 3, 7, 6, 8, 5, 4, 9, 6, 2);
	static List<String> cities = Arrays.asList("ROME", "LONDON", "NAIROBI", "CALIFORNIA", "ZURICH", "NEW DELHI",
			"AMSTERDAM", "ABU DHABI", "PARIS");
	static String word = "UhlIOnd";

	public static void main(String[] args) {


		/*numbers.stream()
				.filter(num -> num % 2 == 0)
				.forEachOrdered(System.out::println);

		numbers.stream()
				.filter(num -> num % 2 == 0)
				.filter(num -> num > 0)
				.map(num -> (int)(Math.pow(num, 2)))
				.forEach(System.out::println);
*/
		/*numbers2.stream()
				.map(num -> (int)(Math.pow(num, 2)))
				.filter(num -> num > 20)
				.forEach(System.out::println);*/

		/*double average = numbers.stream()
				                .filter(num -> num % 2 != 0)
				                .mapToDouble(num -> num).average().getAsDouble();
		System.out.println(average);*/

		/*System.out.println(numbers3.stream()
				.mapToInt(num -> num).sum());*/

		/*List<String> lesscities = cities.stream()
								 .filter(city -> city.startsWith("Z"))
								 .collect(toList());
		System.out.println(lesscities);*/

		/*word.chars()
				.filter(Character::isUpperCase);

		word.chars()
				.filter(Character::isUpperCase)
				.mapToObj(character -> String.valueOf(character))
				.collect(joining());

		Map<String, Long> frequentChars = word.chars()
				.mapToObj(c -> String.valueOf((char) c))
				.collect(Collectors.groupingBy(c -> c, Collectors.counting()));

		for (Map.Entry<String, Long> letters : frequentChars.entrySet()) {
			System.out.print(letters.getKey() + "=" + letters.getValue() + ", ");
		}*/

		List<Fox> container = new ArrayList<>();
		container.add(new Fox("Denny", "green", 4));
		container.add(new Fox("slkjfsdf", "pink", 23));
		container.add(new Fox("fd", "green", 17));
		container.add(new Fox("jjk", "brown", 19));
		container.add(new Fox("nvb", "cyan", 35));

		List<String> greenfoxes = container.stream()
				.filter(fox -> fox.getColor() == "green")
				.map(fox -> fox.getName())
				.collect(toList());


		System.out.println(greenfoxes);

		List<String> greenfoxes2 = container.stream()
				                          .filter(fox -> fox.getColor() == "green" && fox.getAge() < 5)
				                          .map(fox -> fox.getName())
				                          .collect(toList());
		System.out.println(greenfoxes2);

		Map<String, Long> foxesByColour = container.stream()
					.map(fox -> fox.getColor())
				    .collect(Collectors.groupingBy(fox -> fox, Collectors.counting()));
		System.out.println(foxesByColour);



	}

}
