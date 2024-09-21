package CoreJavaEx;

class  Stud1 {
	private String name;
    private int age;
    public String getName() { 
    	return name; 
    	}
    public int getAge() { 
    	return age; 
    	}

    public void setAge(int age) { 
    	this.age = age; 
    	}
    public void setName(String name) { 
    	this.name = name; 
    	}

    Stud1(int age,String name){
    	System.out.println("hello");
    	this.age = age;
    	this.name = name; 
    }
	public Stud1() {
		super();
		
	}
    
}
public class Student {
    public static void main(String[] args)
    {
    	Stud1 s = new Stud1();
        s.setName("Pratham");
        s.setAge(22);
        System.out.println("Name " + s.getName());
        System.out.println("Age " + s.getAge());
        Stud1 s1=new Stud1(26, "jilin");
        System.out.println("name "+s1.getName()+" age "+s1.getAge());
    }
}
