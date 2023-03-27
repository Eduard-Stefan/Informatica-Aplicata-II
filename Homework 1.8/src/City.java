import java.util.ArrayList;

public class City {
    private String name;
    private ArrayList<Hotel> hotels;
    private ArrayList<Person> persons;
    private ArrayList<Tourist> tourists;
    public City(String name) {
        this.name = name;
        this.hotels = new ArrayList<>();
        this.persons = new ArrayList<>();
        this.tourists = new ArrayList<>();
    }
    public String GetName() {
        return name;
    }
    public void SetName(String name) {
        this.name = name;
    }
    public ArrayList<Hotel> GetHotels() {
        return hotels;
    }
    public ArrayList<Person> GetPersons() {
        return persons;
    }
    public ArrayList<Tourist> GetTourists() {
        return tourists;
    }
    public void AddHotel(Hotel hotel) {
        hotels.add(hotel);
    }
    public void RemoveHotel(Hotel hotel) {
        hotels.remove(hotel);
    }
    public void AddPerson(Person person) {
        persons.add(person);
    }
    public void RemovePerson(Person person) {
        persons.remove(person);
    }
    public void AddTourist(Tourist tourist) {
        tourists.add(tourist);
    }
    public void RemoveTourist(Tourist tourist) {
        tourists.remove(tourist);
    }
    public ArrayList<Tourist> GetTouristsInHotels() {
        ArrayList<Tourist> allTourists = new ArrayList<>();
        for (Hotel hotel : hotels) {
            allTourists.addAll(hotel.GetTourists());
        }
        return allTourists;
    }
    public boolean IsPersonInHotels(Person person) {
        for (Hotel hotel : hotels) {
            if (hotel.GetTourists().contains(person)) {
                return true;
            }
        }
        return false;
    }
}