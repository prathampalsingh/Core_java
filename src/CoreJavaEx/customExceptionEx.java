package CoreJavaEx;

import java.util.Scanner;

class InvalidAgeExcept extends Exception {
	public InvalidAgeExcept(String msg) {
		super(msg);
	}
}

public class customExceptionEx {
	static void checkAge (int age) throws InvalidAgeExcept {
		if(age<18) {
			throw new InvalidAgeExcept("Under 18 not allowed");
		}
		else {
			System.out.println("you are eligble to Vote");
		}
	}

	public static void main(String[] args) {
		System.out.print("Please Enter your age: ");
		Scanner sc=new Scanner(System.in);
		int age=sc.nextInt();
		try {
			checkAge(age);
		}
		catch (InvalidAgeExcept e) {
			System.out.println(e.getMessage());
		}
	}

}
