package CoreJavaEx;

class TwoWheller{  
void dis2wheel(){System.out.println("Bike");}  
}  
class ThreeWheller extends TwoWheller{  
void dis3wheel(){System.out.println("Auto");}  
}  
class FourWheller  extends ThreeWheller{  

void dis4wheel(){
	dis2wheel();
	dis3wheel();
	System.out.println("Car");}  
}  
public class Mul_inher_ex {

	public static void main(String[] args) {
		FourWheller m=new FourWheller();  
		m.dis4wheel();  

	}

}
