package collectionFramework;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileReaderEx {
	    public static void main(String[] args) throws IOException {
	        File f=new File("file333.txt");
	        FileWriter fw=new FileWriter(f);//automatically file created
	        fw.write("Hello Everyone.Java Full Stack course sponsered by capegemini,SAP,EDUBRIDGGE...");
	        fw.close();
	        System.out.println("Content written successfully");
	        
	        FileReader fReader = new FileReader("file333.txt"); 
	        BufferedReader bReader = new BufferedReader(fReader); 
	        int records; 
	        while((records = bReader.read()) != -1) { 
	        System.out.print((char)records); 
	        }
//	        //bReader.close(); 
//	        fReader.close();
	    }}
