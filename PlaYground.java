
import java.util.*;


public class PlaYground {
    private String location;
    private String name;
    private double area;
    private float pricePerHour;
    private double cancellationPeriod;
    private int start;
    private int end;
    private ArrayList<PlaYground> grounds;

    public PlaYground() {
    }
    public PlaYground(String location, String name, double area, float pricePerHour, double cancellationPeriod, int start, int end, ArrayList<PlaYground> grounds) {
        this.location = location;
        this.name = name;
        this.area = area;
        this.pricePerHour = pricePerHour;
        this.cancellationPeriod = cancellationPeriod;
        this.start = start;
        this.end = end;
        this.grounds = grounds;
        grounds = new ArrayList<>();
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public void setPricePerHour(float pricePerHour) {
        this.pricePerHour = pricePerHour;
    }

    public void setCancellationPeriod(double cancellationPeriod) {
        this.cancellationPeriod = cancellationPeriod;
    }

    public void setStart(int start) {
        this.start = start;
    }

    public void setEnd(int end) {
        this.end = end;
    }

    public void setGround(ArrayList<PlaYground> grounds) {
        this.grounds = grounds;
    }
    

    public String getLocation() {
        return location;
    }

    public String getName() {
        return name;
    }

    public double getArea() {
        return area;
    }

    public float getPricePerHoure() {
        return pricePerHour;
    }

    public double getCancellationPeriod() {
        return cancellationPeriod;
    }

    public int getStart() {
        return start;
    }

    public int getEnd() {
        return end;
    }

    public ArrayList<PlaYground> getGround() {
        return grounds;
    }
    public void displayPlayground()
    {
        System.out.println("Name"+ getName());
        System.out.println("price per hour"+ getPricePerHoure());
        System.out.println("cancellation period"+getCancellationPeriod());
        System.out.println("Area:" + getArea());
    }
    public float bookAplayGround(int slots)
    {
        return slots*pricePerHour;
    }
}