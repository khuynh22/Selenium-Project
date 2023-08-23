package JavaStream;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import org.testng.annotations.Test;

public class test1 {
	@Test
	public void regular() {
		ArrayList<String> names = new ArrayList<String>();
		int count = 0;
		names.add("Adams");
		names.add("Alvin");
		names.add("Tim");
		names.add("Hayley");
		names.add("Chip");
		for (int i = 0; i < names.size(); i++) {
			String actual = names.get(i);
			if (actual.startsWith("A")) {
				count++;
			}
		}
		System.out.println(count);
	}

	@Test
	public void streamFilter() {
		ArrayList<String> names = new ArrayList<String>();
		names.add("Adams");
		names.add("Alvin");
		names.add("Tim");
		names.add("Hayley");
		names.add("Chip");

		Long c = names.stream().filter(s -> s.startsWith("A")).count();

		System.out.println(c);
		long d = Stream.of("Adams", "Alvin", "Tim", "Hayley", "Chip").filter(s -> {
			s.startsWith("A");
			return false;
		}).count();

		System.out.println(d);

		// output all the names of ArrayList
		names.stream().filter(s -> s.length() > 4).forEach(s -> System.out.println(s));
		names.stream().filter(s -> s.length() > 4).limit(1).forEach(s -> System.out.println(s));
	}

	@Test
	public void streamMap() {
//		Stream.of("Adams", "Alvin", "Tim", "Hayley", "Chip").filter(s -> s.endsWith("a")).map(s -> s.toUpperCase())
//				.forEach(s -> System.out.println(s));
		// print names which have first letter as a with uppercase and sorted
		
		List<String> names = Arrays.asList("Adams", "Alvin", "Tim", "Hayley", "Chip");
		names.stream().filter(s -> s.startsWith("A")).sorted().map(s -> s.toUpperCase()).forEach(s -> System.out.println(s));
//		names.stream().filter(s -> s.startsWith("A")).sorted().map(s -> s.toUpperCase()).forEach(s -> System.out.println(s));
		
	}
}
