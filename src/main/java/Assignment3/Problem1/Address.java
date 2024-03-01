package Assignment3.Problem1;

public class Address {
    private String country;
    private String state;
    private String city;
    private String street;
    private String zip;
    public String getCountry() {
        return country;
    }

    public String getState() {
        return state;
    }

    public String getCity() {
        return city;
    }

    public String getStreet() {
        return street;
    }

    public String getZip() {
        return zip;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setState(String state) {
        this.state = state;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    Address(String country, String state, String city, String street, String zip){
        this.country = country;
        this.state = state;
        this.city = city;
        this.street = street;
        this.zip = zip;
    }

    public String toString(){
        return  this.street + " " + this.city + " " + this.state + ", " + this.zip + ", " + this.country;
    }
}
