package collectionFramework;
import java.util.*;
class Productt implements Comparable<Productt>{
	int price;
	String name;
	public Productt(int price,String name) {
		super();
		this.price=price;
		this.name=name;
	}
//	public int getPrice() {
//		return price;
//	}
//	public void setPrice(int price) {
//		this.price = price;
//	}
//	public String getName() {
//		return name;
//	}
//	public void setName(String name) {
//		this.name = name;
//	}
	@Override
	public String toString() {
		return "Productt [price=" + price + ", name=" + name + "]";
	}
//	@Override
//	public int compareTo(Productt o) {
//		return this.name.compareTo(o.name);	
//	}
	@Override
	public int compareTo(Productt o) {
		if(this.price>o.price) {
			return 1;
		}
		else if(this.price<o.price)
		{
			return -1;
		}
		else {
			return 0;
		}
	}
}


public class ProducttCompareable {

	public static void main(String[] args) {
		List<Productt> pl=new ArrayList<>();
		pl.add(new Productt(10, "Cadbury"));
		pl.add(new Productt(20, "Kitkat"));
		pl.add(new Productt(30, "sneakers"));
		pl.add(new Productt(100, "Ferrero_rocher"));
		
		Collections.sort(pl);
		for(Productt list:pl) {
			System.out.println(list);
		}
	}
}
