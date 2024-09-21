package CoreJavaEx;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class buffer_Reader_ex {

	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("enter your name:");
        String name=br.readLine();
        
        System.out.println("enter your age:");
        int age=Integer.parseInt(br.readLine());
        
        System.out.println("enter your percentage:");
        float percentage=Float.parseFloat(br.readLine());
        
        System.out.println("My name: "+name);
        System.out.println("My age: "+age);
        System.out.println("My percentage: "+percentage);
	}

}
