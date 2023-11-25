package Bus_reservation;
import java.util.*;
import java.util.Scanner;

public class Busdemo 
{
    public static void main(String[] args) 
    {
        ArrayList<bus> buses = new ArrayList<bus>();
        ArrayList<booking> booklist = new ArrayList<>();
        buses.add(new bus(1, 2, true));
        buses.add(new bus(2, 50, true));
        buses.add(new bus(3, 50, false));
        // else We using DB
        Scanner scan = new Scanner(System.in);
        for (bus bus : buses) 
        {
            bus.displaybusinfo();            
        }
        int usr_int = 1;
        while (usr_int == 1) 
        {
            System.out.println("Enter 1 to Book and 2 to Exit");
            usr_int = scan.nextInt();
            if (usr_int == 1) 
            {
                booking foo = new booking();
                if(foo.isAvailable(booklist,buses))
                {
                    booklist.add(foo);
                    System.out.println("Your booking is confirmed");
                }
                else
                {
                    System.out.println("Sorry Booking Full!");
                }                
            }
        }
    }
}
