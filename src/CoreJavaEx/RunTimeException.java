package CoreJavaEx;

public class RunTimeException {

	public static void main(String[] args) {
		        try {
		            int a=10,b=0;
		            int c=a/b;
		            System.out.println("Value of c: "+c);
		            int ar[]= {1,2,3};
		            System.out.println("array element "+ar[1]);
		            String a1="1235";
		            System.out.println("String to int: "+a1);
		        }
		        catch(ArrayIndexOutOfBoundsException e) {
		        	System.out.println(e.getMessage());
		        	System.out.println(e);
		        	System.out.println("execption "+e);
		        	
		        }
		        catch(NullPointerException e1) {
		        	System.out.println(e1.getMessage());
		        	System.out.println(e1);
		        	System.out.println("execption "+e1);
		        }
		        
		        
		        catch (ArithmeticException e) {
		            System.out.println(e.getMessage());
		            System.out.println(e);
		        }
		        catch(NumberFormatException e3) {
		            System.out.println(e3);
		            System.out.println("Exception :"+e3.getMessage());
		        }
		        finally {
		            System.out.println("End of the code");
		        }
		    
		}


	}


