package JAVA8;
@FunctionalInterface
interface C {
    public Employeee getEmployee();
    //C c1 = () -> new Employeee();
}
@FunctionalInterface
interface D {
    public Employeee getEmployee(String name, int age);
}
class Employeee {
    String eName="pooja";
    int eAge=30;
    
    public Employeee(){} 
    
    public Employeee(String eName, int eAge) {
        this.eName = eName;
        this.eAge = eAge;
    }
    
    public void getInfo() {
        System.out.println("Employee NAme :"+this.eName);
        System.out.println("Employee Age :"+this.eAge);
    }
}
public class ConstructorReference {
    public static void main(String[] args) {    
        
        System.out.println("Using Lambda");
        C c1 = () -> new Employeee();
        c1.getEmployee().getInfo();
        D d1 = (name,age) -> new Employeee(name,age);
        d1.getEmployee("Priya", 30).getInfo();
        System.out.println("Using Constructor refrence");
        //Constructor Refernce-->ClassName::new
        C c2 = Employeee::new; //default
        c2.getEmployee().getInfo();
        D d2 = Employeee::new;
        d2.getEmployee("Priyanka", 24).getInfo();//
    }
}
