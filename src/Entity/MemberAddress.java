package Entity;

public class MemberAddress {

    private String street;
    private String city;
    private String postalCode;

    public MemberAddress(String street, String city, String postalCode) {
        this.street = street;
        this.city = city;
        this.postalCode = postalCode;
    }

    public String getFormattedAddress() {
        return street + ", " + city + ", " + postalCode;
    }

}
