public class Address {
    private String street;
    private String city;
    public Address(String street, String city) {
        this.street = street;
        this.city = city;
    }
    public String GetStreet() {
        return street;
    }
    public void SetStreet(String street) {
        this.street = street;
    }
    public String GetCity() {
        return city;
    }
    public void SetCity(String city) {
        this.city = city;
    }
}