package pack2;

import pack1.Protectedexample1;

class Emp extends Protectedexample1{
	    Emp(){
	    }
	    void msg() {
	        display();
	    }
	}
	public class ProtectedExample2 {
	    public static void main(String[] args) {
	        //Employee e=new Employee();-->not visible in another package class
	        Emp e=new Emp();
	        e.msg();
	    }
	}