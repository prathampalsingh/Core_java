package CoreJavaEx;

public class deep_copy {

	public static void main(String[] args) {
        int a[]= {1,2,3,4,5};
        int cloneArray[]=a.clone();
        System.out.println("Mememry address not same: "+(a==cloneArray));
        for(int i=0;i<cloneArray.length;i++) {
            System.out.print(cloneArray[i]+" ");
        }
    }
	}
