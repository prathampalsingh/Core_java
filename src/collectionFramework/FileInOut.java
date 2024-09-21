package collectionFramework;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileInOut {

	public static void main(String[] args) throws IOException {
		File f=new File("C:\\Users\\Pratham\\Desktop\\java\\ss\\week2\\day10/demo12.txt");
		FileOutputStream fos=new FileOutputStream(f);
		String s="Formula 1 is a team sport. It needs to be to change all 4 tyres on a car in under 2 seconds! F1 teams design and build their cars and get them ready to race. Each has their own history. Each has their own unique approach. All want to be the fastest. But who should you root for?";
		byte b[]= s.getBytes();
		fos.write(97);
		fos.write(66);
		fos.write(67);
		fos.write(b);
		System.out.println("Content written successful");
		
		FileInputStream fis=new FileInputStream("C:\\Users\\Pratham\\Desktop\\java\\ss\\week2\\day10/demo12.txt");
		System.out.println("File Content");
		int i = fis.read();
		while (i != -1) {
			System.out.print((char)i);
			i=fis.read();
		}
		fis.close();	}
}
