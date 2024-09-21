package pack2;

import java.util.Scanner;

public class DistanceCalculator {
	public static double distance(int n) {
		double u = 36*1000/3600;
		double a=5.0;
		return u*n+((a*n*n)/2);
	}
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int n1=sc.nextInt(); 
        System.out.println(distance(n));
        System.out.println(distance(n1));
    }}       
