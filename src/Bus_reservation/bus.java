package Bus_reservation;

public class bus 
{
    private  int bus_no;
    private  int capacity;
    private  boolean ac;
    public bus(int bus_no, int capacity, boolean ac) 
    {
        this.bus_no = bus_no;
        this.capacity = capacity;
        this.ac = ac;
    }
    public int getBus_no() {
        return bus_no;
    }
    // public void setBus_no(int bus_no) {
    //     this.bus_no = bus_no;
    // }
    public int getCapacity() {
        return capacity;
    }
    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
    public boolean isAc() {
        return ac;
    }
    // public void setAc(boolean ac) {
    //     this.ac = ac;
    // }    
    public void displaybusinfo() 
    {
        System.out.println("Bus No: " + bus_no + " Ac: " + ac + " Total Capacity: " + capacity);
    } 
    
}
