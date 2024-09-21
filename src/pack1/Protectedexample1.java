package pack1;

public class Protectedexample1  { 
	    protected int eid;
	    protected String ename;
	    protected Protectedexample1() {
	        eid=1;
	        ename="fdnjfn";
	    }
	    protected void display() {
	        System.out.println("Eid :"+eid);
	        System.out.println("Ename :"+ename);
	    }
	}