package CoreJavaEx;
class Mul {
 static int Multiply(int a, int b)
 {
     return a * b;
 }
 static double Multiply(double a, double b)
 {
     return a * b;
 }
 void add(int a,int b) {
	 System.out.println("addition: "+(a+b));
 }
}
class Methodoverloading {
 public static void main(String[] args)
 {
	 Mul m=new Mul();
     System.out.println(Mul.Multiply(2, 4));
     System.out.println(Mul.Multiply(5.5, 6.3));
     m.add(5, 10);
 }
}
