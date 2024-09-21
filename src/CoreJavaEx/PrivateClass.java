package CoreJavaEx;

class PrivateEx{
    private int b=20;//Only within a class
    private String name;
    int c;
     void displayB() {//default-->scope-->it's accessible within a package
        System.out.println("Value of B: "+b);
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
}
public class PrivateClass  {
    private int a;
    private PrivateClass(int a) {
        this.a=a;
    }
    private void display() {
        System.out.println("Value of a:"+a);  
}
    public static void main(String[] args) {
        PrivateClass p=new PrivateClass(10);
        System.out.println("Value of a using variable : "+p.a);
    
        p.display();
        PrivateEx p1=new PrivateEx();
        
        p1.displayB();
        p1.setName("EduBridge");
        System.out.println("Name : "+p1.getName());
    }
}