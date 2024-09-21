package JAVA8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ExampleTest1 {

	public static void main(String[] args) {
		List<String> list1 = Arrays.asList("a", "b", "c");
		List<Integer> list2 = Arrays.asList(1, 2, 3);
		List<String> result = new ArrayList<>();
		for (int i=0; i < list1.size(); i++) {
		    result.add(list1.get(i) + list2.get(i));
		}
		System.out.println(result);
		System.out.println(list2);

	}

}
