package CoreJavaEx;
abstract class F1_drivers{
	abstract void drivers();
	static void display() {
		System.out.println("Driver standings");
	}
}
class Max extends F1_drivers{
	@Override
	void drivers() {
		System.out.print("Max verstappen");
	}
	void position(){
		System.out.println(" 1st with 303 points");
	}
}
class Norris extends F1_drivers{
	@Override
	void drivers() {
		System.out.print("Lando norris");
	}
	void position() {
		System.out.print(" 2nd with 241 points");
	}
}
public class AbstractExample {
	public static void main(String[] args) {
		F1_drivers.display();
		Max m=new Max();
		m.drivers();		//Method 1
		m.position();
		
		//we cannot create obj of abstract class 
		//but we can create reference of abstract class
		Norris n=new Norris();
		F1_drivers aref; 
		//Method 2 using reference 
		aref=n;
		aref.drivers();
		n.position();
	}
}
