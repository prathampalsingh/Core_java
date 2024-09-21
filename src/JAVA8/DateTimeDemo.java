package JAVA8;

import java.time.*;
public class DateTimeDemo {
    public static void main(String[] args) {
        DateTimeDemo d= new DateTimeDemo();
        System.out.println("Date is:" + d);
        LocalDate currentDate = LocalDate.now();
        System.out.println("CurrentDate is:" + currentDate);
        
        LocalTime currentTime = LocalTime.now();
        System.out.println("CurrentTime is:" + currentTime);
        
        LocalDateTime currentDateTime = LocalDateTime.now();
        System.out.println("CurrentDateTime is:" + currentTime);
        
    
        ZoneId currentZone = ZoneId.systemDefault();
        System.out.println("CurrentZone is:" + currentZone);
        
        System.out.println("CurrentDate is leap  year or not:" + currentDate.isLeapYear());
        System.out.println("Plus Days is:" + currentDate.plusDays(1));
        System.out.println("Plus Month is:" + currentDate.plusMonths(1));
        System.out.println("Plus Week is:" + currentDate.plusWeeks(1));
        System.out.println("Plus Year is:" + currentDate.plusYears(1));
    }
}