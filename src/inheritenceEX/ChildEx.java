package inheritenceEX;

public class ChildEx implements Interface1, Interface2  {
	@Override
	public void dis1() {
		System.out.println("dis1 display");
	}
	@Override
	public void dis2() {
		System.out.println("dis2 display");
	}
	@Override
    public void hostelDetail() 
    {
        System.out.println("Hostel Name : RAMA");
        System.out.println("Hostel location : KUK");
    }
    @Override
    public void collegeDetail() 
    {
        System.out.println("College Name : DCSA");
        System.out.println("College Grade : A");
        System.out.println("University of College : KUK");
    }
    @Override
    public void studentData() 
    {
        Interface1.super.studentData();
        Interface2.super.studentData();
    }


}
