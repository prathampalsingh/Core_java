package CoreJavaEx;

import java.util.Scanner;

class Emp{
    int sal=0;
    void companyName(){//Method
        System.out.println("Company name: TCS");
    }
}
class PermanentEmp extends Emp{
    int da=500,hra=5000,ta=2000;
    public PermanentEmp(int salary) {//Constructor
        sal=da+hra+ta+salary;
        System.out.println("Salary of Permannet: "+sal);
    }
}
class TempEmp extends Emp{
    public TempEmp(int fsal) {
        sal=fsal-2000;
        System.out.println("Salary of Temp: "+sal);
    }
}
class ContractEmp extends Emp{
    int fixrate=500;
    public ContractEmp(int hr) {
        sal=fixrate*hr;
        System.out.println("Salary of Contract based Emp: "+sal);
    }
}
public class Hiraricallevel_inheri {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Salary of permanent employee : ");
		int salary=sc.nextInt();
		System.out.print("Enter Salary of Temp employee : ");
		int fsal=sc.nextInt();
		System.out.print("Enter no of hours worked by an Contract employee : ");
		int hr=sc.nextInt();
		PermanentEmp P=new PermanentEmp(salary);
		TempEmp t=new TempEmp(fsal);
		ContractEmp c=new ContractEmp(hr);
		P.companyName();

	}

}
