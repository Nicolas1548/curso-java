package application;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Program {

	public static void main(String[] args) {

		List<String> list = new ArrayList<>();

		list.add("Nicolas");
		list.add("Gabriel");
		list.add("Alias");
		list.add("Hugo");
		list.add("Thayla");
		list.add("Ana");

		System.out.println(list.size());
		for (String x : list) {
			System.out.println(x);
		}
		System.out.println("-------------------------");
		list.removeIf(x -> x.charAt(0) == 'N');
		for (String x : list) {
			System.out.println(x);
		}
		System.out.println("-------------------------");
		System.out.println("Index of Gabriel: " + list.indexOf("Gabriel"));
		System.out.println("Index of Nicolas: " + list.indexOf("Nicolas"));
		System.out.println("-------------------------");
		List<String> result = list.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList());
		for (String x : result) {
			System.out.println(x);

		}
		System.out.println("---------------------");
		String name = list.stream().filter(x -> x.charAt(0) == 'A').findFirst().orElse(null);
		System.out.println(name);
	}

}
