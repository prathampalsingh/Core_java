package pack2;
import pack1.Student;
class Stud extends Student{
	public Stud() {
		
	}
	void dis() {
		sid=22;
		sname="pratham";
		coursename="JAVA";
		display();
		
	}
}

public class StudentEx {
	public static void main(String[] args) {
////		Student s=new Student();
//		
//		Student s1=new Student(112, "pratham");
//		s1.display();
//		s1.coursename="jfs";
//		s1.display();
        Stud s=new Stud();
        s.dis();
		
//		
	}

}
