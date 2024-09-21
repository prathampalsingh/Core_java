package CoreJavaEx;

import java.util.Scanner;

public class Week2_maximumNoOfChari {
	static char max_occuring_char(String str)
    {
        int arr[] = new int[250];
        int l = str.length();
        for (int i = 0; i < l; i++)
        {            
            arr[str.charAt(i)]++;
        }
        int max = -1;
        char res = ' ';
 
        for (int i = 0; i < l; i++)
        {
            if (max < arr[str.charAt(i)])
            {
                max = arr[str.charAt(i)];
                System.out.println("max: "+max);
                res = str.charAt(i);
                System.out.println("res: "+res);
            }
        }
 
        return res;
    }

	public static void main(String[] args) {
		char ch=max_occuring_char("JavaJava");
		System.out.println(ch);
		

	}

}
//