package collectionFramework;
class Printer 
{ 
    int noOfPaper = 100; 
    synchronized void printingPages(int pages) 
    { 
        System.out.println("Printing the Pages"); 
        if (this.noOfPaper < pages) { 

            System.out.println("Number of Papers in printer are less"); 
            try 
            { 
                System.out.println("Waiting");
                wait(); 
            } 
            catch (Exception e) 
            {   
            } } 
        System.out.println("Number of Paper after called notify() method : " +    this.noOfPaper); 
        System.out.println("Printing complete");
    } 
    synchronized void addPages(int noOfPages) 
    { 
        this.noOfPaper += noOfPages; 
        notify(); 
    } 
    } 
class Threadprint extends Thread{
	Printer p;
	public Threadprint(Printer p) {
		this.p=p;
	}
	public void run(){
		p.printingPages(150);
	}
}
public class Pages { 
    public static void main(String args[]) 
    { 
        Printer printer = new Printer(); 
        Threadprint t=new Threadprint(printer);
        t.start();
        new Thread() { 
            @Override
            public void run() 
            { 
                printer.addPages(60); 
            } 
        }
        .start(); 
    } } 