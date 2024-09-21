package collectionFramework;

import java.util.LinkedHashSet;

public class LinkedHashEx {

	public static void main(String[] args) {
		LinkedHashSet<Integer> even1 = new LinkedHashSet();//A
		//treeset doesnt allow null value
		//even.add(null);
		even1.add(2);
		even1.add(4);
		even1.add(12);
		even1.add(8);
		even1.add(6);
		even1.add(10);
		even1.add(12);
		
		System.out.println("hashset 1 "+even1.hashCode());
		System.out.println("hashset 1 elements: "+even1);
		
		LinkedHashSet<Integer> numbers = new LinkedHashSet();//B
		numbers.add(2);
		numbers.add(14);
		numbers.add(22);
		numbers.add(71);
		numbers.add(0);
		
		System.out.println("hashset 2 elements: "+numbers);
		
		//Union (A u B)
		//numbers.addAll(even1);
		//System.out.println("union "+numbers);
		
		//Intersection (A ∩ B)
//		numbers.retainAll(even1);
//		System.out.println("Intersection "+numbers);	
		
		//Minus (A-B)
//		numbers.removeAll(even1);
//		System.out.println("difference "+numbers);

	}

}
