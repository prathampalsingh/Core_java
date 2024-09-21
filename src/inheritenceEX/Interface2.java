package inheritenceEX;

public interface Interface2 {
	void dis2();
	 public void hostelDetail(); 
	    default void studentData()
	    {
	        System.out.println("Student selected on based : Percentage, Financial condition");
	    }

}
