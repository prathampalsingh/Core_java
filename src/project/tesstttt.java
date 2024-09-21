package project;

import java.util.Scanner;

public class tesstttt {

	public static void main(String[] args) {
        int[] seats = new int[10]; // Assuming 10 seats
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Available Seats:");
            for (int i = 0; i < seats.length; i++) {
                System.out.print(seats[i] == 0 ? i + 1 : " X ");
            }
            System.out.println();

            System.out.print("Enter the seat number to book (0 to exit): ");
            int seatNumber = scanner.nextInt();

            if (seatNumber == 0) {
                break;
            }

            if (seatNumber > 0 && seatNumber <= seats.length) {
                if (seats[seatNumber - 1] == 0) {
                    seats[seatNumber - 1] = 1; // Mark as booked
                    System.out.println("Seat booked successfully!");
                } else {
                    System.out.println("Seat is already booked.");
                }
            } else {
                System.out.println("Invalid seatnumber.");
            }
        }
    }


	}


