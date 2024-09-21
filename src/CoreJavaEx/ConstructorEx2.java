package CoreJavaEx;

class Product{
    int productId;
    String productName;
    int productPrice;
    public Product() {
        productId=1;
        productName="Mobile";
        productPrice=30000;
    }
    public Product(int pid, String productName, int productPrice) {
        
        productId = pid;
        this.productName = productName;
        this.productPrice = productPrice;
    }
    public Product(Product p) {
        productId=p.productId;
        productName=p.productName;
        productPrice=p.productPrice;
    }
    public void display() {
        System.out.println("ProductId=" + productId + ", productName=" + productName + ",productPrice="+productPrice );
    }
}
public class ConstructorEx2 {
    public static void main(String[] args) {
        Product p=new Product();
        p.display();
        Product p1=new Product(2,"Tablet",10000);
        p1.display();
        Product p2=new Product(p1);
        p2.display();
    }
}

