package CoreJavaEx;

import java.util.Scanner;

class Road{
	private int width;
	private int kilometer;
	public Road() {
		width=0;
		kilometer=0;
		
	}
	public Road(int width, int kilometer) {
		this.width=width;
		this.kilometer=kilometer;
	}
	public int getwidth() {
		return width;
	}
	public void setwidth(int width) {
		this.width = width;
	}
	public int getkilometer() {
		return kilometer;
	}
	public void setkilometer(int kilometer) {
		this.kilometer = 10000*kilometer;
	}
	public int Total_amount_of_Rocks() {
		return kilometer*width;
	}
}
class Cost_of_Road extends Road{
	int quality;
	public Cost_of_Road() {
		super();
		quality=3;//3 rs per meter
	}
	public Cost_of_Road (int width, int kilometer,int quality) {
		super(width,kilometer);
		this.quality=quality;
	}
	public int volume() {
		return quality*Total_amount_of_Rocks();
	}
}
public class SuperConstructor {
	public static void main(String[] args) {
		Cost_of_Road b=new Cost_of_Road();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter width of road: ");
		int a=sc.nextInt();
		System.out.println("enter length of road in kilometers: ");
		int c=sc.nextInt();
		b.setkilometer(a);
		b.setwidth(c*1000);
		System.out.println("construction worker cost per kilometer is 10000rs");
		System.out.println("total cost of road if quality of rocks is 3rs per meter "+b.volume());
		//Cost_of_Road b1=new Cost_of_Road(a, c, 5);
		//System.out.println("volume "+b1.volume());
	}
}
