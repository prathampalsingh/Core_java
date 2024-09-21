package CoreJavaEx;

import java.io.File;

public class fileNotFoundEx {

	public static void main(String[] args) throws Exception {
		File f= new File("C:\\Users\\Pratham\\Documents/Accounts1.txt");
		if(f.exists()) {
			System.out.println("file found"+f);
		}
		else {
			System.out.println("file not found");
			throw new Exception("File not found: "+f);
		}
	}

}
