package collectionFramework;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListEx {

	public static void main(String[] args) {
		ArrayList<String> al=new ArrayList<>();
		al.add("pratham");
		al.add("pal");
		al.add("singh");
		System.out.println("My array : "+al);
		al.remove(2);
		System.out.println("get method: "+al.get(1));
		System.out.println("is empty? "+al.isEmpty());
		ArrayList<String> al1=new ArrayList<>();
		al1.add("Mr.");
		al1.addAll(0, al);
		System.out.println("My array 2nd array : "+al1);
		Collections.reverse(al1);
		System.out.println("My rev 2nd array : "+al1);

	}

}
