package CoreJavaEx;

interface Parentt1{
	 void disParenttt1();
}
interface Parentt2{
	void disParenttt2();
}
interface Parentt3 extends Parentt1,Parentt2{
	void disParenttt3();
}
class ChildEXX implements Parentt3 {
	@Override
	public void disParenttt1() {
		System.out.println("Parentt1");
	}
	@Override
	public void disParenttt2() {
		System.out.println("Parentt2");
	}
	@Override
	public void disParenttt3() {
		System.out.println("Parentt3");
	}	
	
}
public class Multi_Implements {

	public static void main(String[] args) {
		ChildEXX c=new ChildEXX();
		c.disParenttt1();
		c.disParenttt2();
		c.disParenttt3();
	}
}
