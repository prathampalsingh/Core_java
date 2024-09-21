package CoreJavaEx;

class parent{
	String ename="hello";
	void display() {
		System.out.println("greeting1: "+ename);
	}
}
class child extends parent{
	String cname="hi";
	void display() {
		super.display();
		System.out.println("greetings2: "+cname);
	}
}
public class RuntimePolymorphism {

	public static void main(String[] args) {
		child c=new child();
		c.display();
	}

}
