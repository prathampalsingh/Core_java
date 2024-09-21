package CoreJavaEx;
import java.util.*;
public class BestLoop{
    public static void main(String args[]) 
    { 
        int a =1;
        int b =100;
        int c =0;
//        System.out.println("The even numbers between "+a+" and "+b+" are the following: ");
        for (int i = a; i <= b; i++)
        {
        if(i % 2 == 0)
        {
        System.out.println(i);
        }
        }
    }
}