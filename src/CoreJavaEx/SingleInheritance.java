package CoreJavaEx;

class Vehicle11{
    //if constructor,method,variable accessspecifier default->we can access in sub c   
    String type="fouwheeler";
    Vehicle11(){
        System.out.println("Vehicle");
    }
   void disVehicle() {
        System.out.println("Vehicle method");
    }
    
}
class Car11 extends Vehicle11{
    String cname="BMW";
     void display() {
        disVehicle();
        System.out.println("Type : "+type +" Name : "+cname);
    }
}
public class SingleInheritance {
    public static void main(String[] args) {
        Car11 c=new Car11();
        c.display();
    }
}