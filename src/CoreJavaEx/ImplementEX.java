package CoreJavaEx;

interface Paren1{
	 void disparent1();
}
interface Paren2{
	void disparent2();
}
interface Paren3{
	void disparent3();
}
class ChildEx1 implements Paren1,Paren2,Paren3 {
	@Override
	public void disparent1() {
		System.out.println("paren1");
	}
	@Override
	public void disparent2() {
		System.out.println("paren2");
	}
	@Override
	public void disparent3() {
		System.out.println("paren3");
	}	
	
}
public class ImplementEX {

	public static void main(String[] args) {
		ChildEx1 c=new ChildEx1();
		c.disparent1();
		c.disparent2();
		c.disparent3();
	}
}
