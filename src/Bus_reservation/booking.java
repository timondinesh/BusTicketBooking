package Bus_reservation;
import java.util.*;
import java.text.SimpleDateFormat;

public class booking 
{
    private String Passenger_name;
    private Date traveldate;
    private int bus_no;

    public booking() 
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter name of Passenger: ");
        Passenger_name = scan.next();
        System.out.println("Enter bus no: ");
        bus_no = scan.nextInt();
        System.out.println("Enter Date of Journey: dd-mm-yyyy");
        String date = scan.next();
        SimpleDateFormat dateFor = new SimpleDateFormat("dd-MM-yyyy");
        try 
        {
            traveldate = dateFor.parse(date);            
        } 
        catch (Exception e) 
        {
            // TODO: handle exception
        }
    }

    public String getPassenger_name() {
        return Passenger_name;
    }

    public void setPassenger_name(String passenger_name) {
        Passenger_name = passenger_name;
    }

    public Date getTraveldate() {
        return traveldate;
    }

    public void setTraveldate(Date traveldate) {
        this.traveldate = traveldate;
    }

    public int getBus_no() {
        return bus_no;
    }

    public void setBus_no(int bus_no) {
        this.bus_no = bus_no;
    }

    public boolean isAvailable(ArrayList<booking> book,ArrayList<bus> bus) 
    {
        int cnt = 0;
        for (bus bus2 : bus) 
        {
            if (bus2.getBus_no() == bus_no) 
            {
                cnt = bus2.getCapacity();
            }
        }
        int booked = 0;
        for (booking bookeach : book) 
        {
            if (bookeach.bus_no == bus_no && bookeach.traveldate.equals(traveldate)) 
            {
                booked++;
            }            
        }
        System.out.print(cnt + " " + booked);
        return booked < cnt ? true:false ;
    }
    
}
