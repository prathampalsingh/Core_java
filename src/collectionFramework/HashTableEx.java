package collectionFramework;
import java.util.Hashtable;

public class HashTableEx {

	public static void main(String[] args) {
		Hashtable<String, String> ht=new Hashtable<>();
		ht.put("1","jan");
		ht.put("2","feb");
		ht.put("3","mar");
		ht.put("4","apr");
		ht.put("5","may");
		ht.putIfAbsent("6", "june");
		System.out.println("hash table " +ht);
		
		Hashtable<Integer, String> ht1=new Hashtable<>();
		ht1.put(1, "pink");
		ht1.put(2, "green");
		ht1.put(2, "grey");
		
		ht1.putIfAbsent(2, "black");
		System.out.println(ht1);
		System.out.println("Get ="+ht1.get(2));

	}

}
