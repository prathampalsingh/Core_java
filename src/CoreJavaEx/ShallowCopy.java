package CoreJavaEx;

public class ShallowCopy {

	public static void main(String[] args) {
		int intArray1[][] = {{1,2,3,4,5},{6,7,8,9,10}}; 
        
        int cloneArray1[][] = intArray1.clone(); 
        System.out.println(intArray1[0][3]);
        System.out.println(cloneArray1[0][3]); 
        // shallow copy is created following print statement will print true 
        System.out.println(intArray1[0][0] == cloneArray1[0][0]); 
	}

}
