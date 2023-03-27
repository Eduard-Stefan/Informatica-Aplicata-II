public class Tourist extends Person {
    private Hotel hotel;
    public Tourist(String name, Address address) {
        super(name, address);
    }
    public Hotel GetHotel() {
        return hotel;
    }
    public void SetHotel(Hotel hotel) {
        this.hotel = hotel;
    }
}