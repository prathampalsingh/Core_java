package CoreJavaEx;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {
    public static boolean anagramsChecker(String s1, String s2)
    {
        char[] Arr1 = s1.toCharArray();
        char[] Arr2 = s2.toCharArray();
        Arrays.sort(Arr1);
        Arrays.sort(Arr2);
        return Arrays.equals(Arr1, Arr2);
    }

    public static void main(String[] args)
    {
    	Scanner sc=new Scanner(System.in);
    	String str1 =sc.next().toLowerCase();
    	String str2 =sc.next().toLowerCase();
    	if (str1.length()==str2.length()) {	
        if (anagramsChecker(str1, str2)) {
            System.out.println("Anagram");
        }else {
        	System.out.println("not anagram");
        }
        }
        else {
        	System.out.println("not anagram");
        }

	}
    }

