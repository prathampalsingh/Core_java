package collectionFramework;

import java.util.HashSet;

public class HashCode {

	public static void main(String[] args) {
		HashSet<Integer> even = new HashSet<>();//A
		even.add(null);
		even.add(2);
		even.add(4);
		even.add(2);
		even.add(12);
		even.add(8);
		even.add(6);
		even.add(10);
		even.add(12);
		
		System.out.println("hashset 1 "+even.hashCode());
		System.out.println("hashset 1 elements: "+even);
		
		HashSet<Integer> numbers = new HashSet<>();//B
		numbers.add(2);
		numbers.add(14);
		numbers.add(5);
		
		System.out.println("hashset 2 elements: "+even);
		
		//Union (A u B)
//		numbers.addAll(even);
//		System.out.println("union "+numbers);
		
		//Intersection (A ∩ B)
//		numbers.retainAll(even);
//		System.out.println("Intersection "+numbers);	
		
		//Minus (A-B)
//		numbers.remove(even);
//		System.out.println("difference "+numbers);

	}

}
