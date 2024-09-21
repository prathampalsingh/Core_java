package CoreJavaEx;
class parent{
	String cname="Parent";
	void disPar() {
		System.out.println("parent name: "+cname);
	}
}
class Child extends parent{
	String cname="child";
	void dischild() {
		//super keyword can only be used in child class
		System.out.println("parent name "+super.cname);
		System.out.println("Child name: "+cname);
	}
}
public class SuperVariable {

	public static void main(String[] args) {
		Child c=new Child();
		c.dischild();
	}

}
