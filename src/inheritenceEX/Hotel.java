package inheritenceEX;
import java.util.*;
class Customer {
    String name;
    int numberOfRooms;
public Customer(String name, int numberOfRooms) {
        this.name = name;
        this.numberOfRooms = numberOfRooms;
    }}
class Hotel {
    List<String> customerName = new ArrayList<>();
    int roomsBooked = 0;
    public String checkIn(Customer c) {
        if (roomsBooked +c.numberOfRooms <= 10) { 
        	for(int i=0;i<c.numberOfRooms;i++) {
        		customerName.add(c.name);		
        	}//System.out.println(customerName); to print customer name
            roomsBooked = c.numberOfRooms+roomsBooked; //System.out.println(roomsBooked); to print number of rooms booked
            return "Checked in";
        } else {
            return "No rooms available.";
        }}
    public String checkRooms(Customer c) {
    	if (roomsBooked +c.numberOfRooms <= 10) {
            return "Yes";
        } else {
            return "No";
        }}
public class Customerhotel{	
    }
    public static void main(String[] args) {
    	Customer customer1 = new Customer("Doselect", 14);
    	Hotel hotel = new Hotel();  
        System.out.println(hotel.checkIn(customer1));  
    }
}

