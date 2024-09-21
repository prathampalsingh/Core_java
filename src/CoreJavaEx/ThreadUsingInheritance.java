package CoreJavaEx;
class Thread1 extends Thread{
	public void run() {//Running
		System.out.println("My thread : ");
		for(int i=1;i<=5;i++) {
			System.out.println(i);
		}//Thread terminate
	}
}
class Thread3 extends Thread{
	public void run() {//Running
		System.out.println("Mul : ");
		for(int i=1;i<=10;i++) {
			System.out.println("1 * "+i +" = "+ i);
		}//Thread terminate
	}
}
//
//class Thread2 extends Thread{
//	public void run() {//Running
//		System.out.println("My thread : ");
//		for(int i=10;i<=15;i++) {
//			try {
////				Thread.sleep(3000);
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//			System.out.println(i);
//		}//Thread terminate
//	}
//}
public class ThreadUsingInheritance {
	public static void main(String[] args) {
		Thread1 t1=new Thread1();//Thread born
		//t1.setName("My Thread1");
		System.out.println("My thread name: "+t1.getName());
		t1.start();//Runnable
//		Thread2 t2=new Thread2();
//		System.out.println("My thread name: "+t2.getName());
//		t2.start();
//		System.out.println("Thread Min prority:"+t2.MIN_PRIORITY);
//		System.out.println("Thread Max prority:"+t2.MAX_PRIORITY);
//		System.out.println("Thread default(Normal) prority:"+t2.NORM_PRIORITY);
		Thread3 t3=new Thread3();
		t3.start();
		t3.run();
		t3.run();
		t3.run();
	}
}
