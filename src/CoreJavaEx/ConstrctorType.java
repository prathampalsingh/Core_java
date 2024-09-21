package CoreJavaEx;

public class ConstrctorType {
    // same as class name
    // it doesn't have any return type even void
    // 3 types->default,Paramertised,copy)
    int age=30;
    String name;
    ConstrctorType() {
        age=25;
        System.out.println("Default Constructor");
        System.out.println("Age : "+age);
    }
    ConstrctorType(int age,String nm){
        this.age=age;
        name=nm;
        System.out.println("Parameterized Constructor : ");
        System.out.println("Age: "+this.age+" Name: "+name);
    }
    //Copy Constructor
    ConstrctorType(ConstrctorType o){
        System.out.println("copy constructor : ");
        age=o.age;
        name=o.name;
        System.out.println("Age: "+age+" Name: "+name);
    }
    
    void display() {
        System.out.println("Display method");
    }
    public static void main(String[] args) {
        ConstrctorType c = new ConstrctorType();
        ConstrctorType c1=new ConstrctorType(20,"XYZ");
        ConstrctorType c2=new ConstrctorType(c1);
    }
}