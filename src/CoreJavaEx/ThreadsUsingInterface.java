package CoreJavaEx;
class ThreadT1 implements Runnable {

	@Override
	public void run() {
		//System.out.println("hello");
		int n=50;
		for(int i=0;i<=5;i++) {
			if(i%2==0) {
				System.out.println(i +" is even");
			}
		}
		
	}
		
}

public class ThreadsUsingInterface {

	public static void main(String[] args) {
		ThreadT1 t1=new ThreadT1();
		Thread t2=new Thread(t1);
		t2.run();
		t2.start();
		t2.run();
		
		
		t2.run();
		
	}
}
