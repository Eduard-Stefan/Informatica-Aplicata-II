import java.util.ArrayList;

public class Hotel {
    private String name;
    private Address address;
    private City city;
    private ArrayList<Tourist> tourists;
    public Hotel(String name, Address address, City city) {
        this.name = name;
        this.address = address;
        this.city = city;
        this.tourists = new ArrayList<>();
    }
    public String GetName() {
        return name;
    }
    public Address GetAddress() {
        return address;
    }
    public void SetAddress(Address address) {
        this.address = address;
    }
    public City GetCity() {
        return city;
    }
    public ArrayList<Tourist> GetTourists() {
        return tourists;
    }
    public void AddTourist(Tourist tourist) {
        tourists.add(tourist);
    }
    public void RemoveTourist(Tourist tourist) {
        tourists.remove(tourist);
    }
}