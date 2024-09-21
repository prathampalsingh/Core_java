package collectionFramework;
import java.io.*;

public class FileEx{

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        File fileObj = new File("C:\\Users\\Pratham\\Desktop\\java\\ss\\week2");
        if (fileObj.exists()) {
            System.out.println("\nSpecified file path: " + fileObj.getAbsolutePath());
            System.out.println("\nIs the file Writable: " + fileObj.canWrite());
            // checking whether the file is Readable or not
            System.out.println("\nIs the file Readable " + fileObj.canRead());
            // retrieving file name
            System.out.println("\nFile name: " + fileObj.getName());
            // retrieving file size
            System.out.println("\nFile size (in bytes) " + fileObj.length());
            File fileDirObj = new File("C:\\Users\\Pratham\\Desktop\\java\\ss\\week2");
            String[] fileList = fileDirObj.list();
            System.out.println("Total no of files inside Directory" + fileList.length);
            System.out.println("list of files available in the directory");
            // displaying here the list of files available in the directory
            for (int i = 0; i < fileList.length; i++) {
                System.out.println(i+" : "+fileList[i]);
            }
        System.out.println("\n");
        } else {
            System.out.println("Specified file does not exist.");
        }
        }
    }

