package CoreJavaEx;

import java.util.Scanner;

class BankAccount {
	  private double balance; 
	  private int accountNumber; 
	  private String ownerName; 
	  //1.Create paramerterized constructor
	  //2.Generate getter method
public BankAccount(double balance, int accountNumber, String ownerName) {
		this.balance = balance;
		this.accountNumber = accountNumber;
		this.ownerName = ownerName;
	}
	  public void deposit(double amount) {
	    //balance += amount;
		  balance=balance+amount;
	  }  
	  public double withdraw(double amount) {
	    // check if the balance is sufficient for the withdrawal
	    if (balance < amount) {
	    	System.out.println("In sufficient balance");
	      return 0; // return 0 if not sufficient
	    }
	    balance -= amount;
	    return amount; // return the amount withdrawn
	  }
	public double getBalance() {
		return balance;
	}
	public int getAccountNumber() {
		return accountNumber;
	}
	public String getOwnerName() {
		return ownerName;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}  
	}
public class EncapsulationExBank {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		BankAccount ba=new BankAccount(5000, 101, "Pooja");
		ba.deposit(7000);
		System.out.println("Current Balance: "+ba.getBalance());//12000
		System.out.print("enter amount to be Withdrawl: ");
		double amm=sc.nextDouble();
		ba.withdraw(amm);
		System.out.println("After Withdraw :" +ba.getBalance());//8000
//		ba.withdraw(8500);
//		System.out.println("After Withdraw :" +ba.getBalance());
	}
}