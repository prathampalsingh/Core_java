package collectionFramework;

public class INTargs {
	    public static void main(int[] args) { 
	        if (args.length > 0) { 
	            int sum = 0; 
	            for (int i = 0; i < args.length; i++) { 
	                sum += args[i]; 
	            } 
	            System.out.println("The sum of the arguments is: " + sum); 
	        } else { 
	            System.out.println("No command-line arguments were provided."); 
	        } 
	    } 
	} 
