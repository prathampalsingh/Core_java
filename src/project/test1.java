package project;
import project.SeatBookingSystem;

import java.util.Scanner;

import java.lang.Thread;
public class test1 {

	public static void main(String[] args) throws InterruptedException {
		System.out.println("Welcome to Flight booking system");
		System.out.println("                       __|__\r\n"
				+ "------------------@--@--(_)--@--@------------------");
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter your name");
		String name=sc.next();
		System.out.println("1.Book Seat");
		System.out.println("2.Cancellation");
		System.out.println("3.Customer Support");
		System.out.println("4.Exit");
		int input=sc.nextInt();
		switch (input) {
		case 1: {
			
			System.out.println("Book tickets now? yes=1, No=2" );
			int option=sc.nextInt();
			if(option==1) {

				System.out.println("                          /\\\r\n"
						+ "                         |  |\r\n"
						+ "                        |    | '.\r\n"
						+ "                       |      |\r\n"
						+ "                      |        |\r\n"
						+ "                      |        |\r\n"
						+ "                 _ - |          | - _\r\n"
						+ "            _ -     1|ABC    DFG|     - _\r\n"
						+ "        _ -          |          |         - _\r\n"
						+ "    _ -             2|ABC    DFG|             - _\r\n"
						+ " _-                 3|ABC    DFG|                 - _\r\n"
						+ "|__________....------\\        //--------....________|\r\n"
						+ "                     |          |\r\n"
						+ "                      |        |\r\n"
						+ "                       |      |\r\n"
						+ "                        |    |\r\n"
						+ "                        |    |");
				System.out.println("PLease enter the seat number!");
				String seatNo = sc.next();
				System.out.println("Please wait while we check if seat is available");
				Thread.sleep(4000);
				System.out.println("thank you for choosing Verstappen airlines "+name);
			}
				else {
					System.out.println("Thank you");
				}	
		}
		}	
	}
}
//this seat is already booked!!!