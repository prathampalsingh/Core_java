package pack1;

public class Student {
	public String coursename;
	public int sid;
	public String sname;
	public Student() {
	}
	public Student(int sid,String sname) {
		this.sid=sid;
		this.sname=sname;
		System.out.println("student class construtor");
		
	}
	public void display() {
		System.out.println("student method: "+coursename);
		System.out.println("student name: "+this.sname+" Student id: "+this.sid);
	}
	
	

	public static void main(String[] args) {
		System.out.println("hello");
	}

	

}
