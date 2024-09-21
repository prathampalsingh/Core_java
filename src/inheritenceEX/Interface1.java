package inheritenceEX;

public interface Interface1 {
	void dis1();
	static void disStatic() {
		System.out.println("disStatic display");
	}
	public void collegeDetail(); 
    default void studentData() 
    {
        System.out.println("courses of Student : MCA, MTECH, MBA, BCA");
    }
}
