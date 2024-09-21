package CoreJavaEx;

import java.util.Scanner;

class Shapes {
	 static int Rectangle(int l, int b)
	 {
	     return l * b;
	 }
	 static double Square(int a)
	 {
	     return a*4;
	 }
	 void triangle(int x,int y,int z) {
		 System.out.println("Area of triangle is: "+(x*y*z));
	 }
	}
	class ML_shapes {
	 public static void main(String[] args)
	 {
		 Shapes s=new Shapes();
		 Scanner sc=new Scanner(System.in);
		 System.out.println("enter length and breath of rectangle: ");
		 int l=sc.nextInt();
		 int b=sc.nextInt();
	     //System.out.println(Mul.Multiply(5.5, 6.3));
	     System.out.println("enter one side of square: ");
		 int a=sc.nextInt();
		 System.out.println("enter all three side of rectangle: ");
		 int x=sc.nextInt();
		 int y=sc.nextInt();
		 int z=sc.nextInt();
		 s.triangle(x, y, z);
		 System.out.println("Area of rectangle is "+Shapes.Rectangle(l,b));
		 System.out.println("Area of rectangle is "+Shapes.Square(a));
	     //m.add(5, 10);
	 }
	}