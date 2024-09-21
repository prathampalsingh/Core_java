	package JAVA8;
import java.util.*;
import java.util.stream.Collectors;
class Item1 {
    private String iName;
    private double iPrice;

    public Item1(String iName, double iPrice) {
        super();
        this.iName = iName;
        this.iPrice = iPrice;
    }
    public String getiName() {
        return iName;
    }
    public void setiName(String iName) {
        this.iName = iName;
    }
    public double getiPrice() {
        return iPrice; 
    }
public void setiPrice(double iPrice) {
    this.iPrice = iPrice;
}}
public class StreamApi {
    public static void main(String[] args) {
        List<Item1> list = List.of(
                new Item1("Office Chair", 1000.0),
                new Item1("Plastic Chair", 800.0),
                new Item1("Small Chair", 500.0),
                new Item1("Rotating Chair", 1500.0),
                new Item1("Rotating Chair", 2500.0),
                new Item1("Gaming Chair", 10000.0)
                );
        System.out.println("Types of Chair");
        list.forEach(It -> System.out.println(It.getiName() + " $ " + It.getiPrice()));
        List<String> itemsSelected = list.stream()	
        		.filter(It -> It.getiPrice() > 1000.)
        		.map(Item1::getiName)
        		.distinct()
        		.collect(Collectors.toList());
        System.out.println("Item name > 50000 " +itemsSelected);
    }
}
