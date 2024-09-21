package collectionFramework;
import java.util.*;
class Customer {
    String name;
    int numberOfRooms;

    public Customer(String name, int numberOfRooms) {
        this.name = name;
        this.numberOfRooms = numberOfRooms;
    }
}
class Hotel {
    List<String> customerName = new ArrayList<>();
    int roomsBooked = 0;

    public String checkIn(Customer customer) {
        if (customer.numberOfRooms <= 10) { 
          //  customerName.add(customer.name);
            roomsBooked += customer.numberOfRooms;
            return "Checked-in";
        } else {
            return "No rooms available.";
        }
    }
    public String checkRooms(Customer customer) {
        if (customerName.contains(customer.name)) {
            return "Customer is already checked in.";
        } else {
            return "Customer is not checked in.";
        }
    }
    public static void Customerhotel(String[] args) {
        Hotel hotel = new Hotel();
        Customer customer1 = new Customer("Doselect", 4);
        System.out.println(hotel.checkIn(customer1));
        System.out.println(hotel.checkRooms(customer1));
        
    }
}
