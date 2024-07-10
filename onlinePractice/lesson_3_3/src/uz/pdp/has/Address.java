package uz.pdp.has;

public class Address {
    private String countrName;
    private String regionName;
    private String streetName;

    public Address(String countrName, String regionName, String streetName) {
        this.countrName = countrName;
        this.regionName = regionName;
        this.streetName = streetName;
    }

    public String getCountrName() {
        return countrName;
    }

    public void setCountrName(String countrName) {
        this.countrName = countrName;
    }

    public String getRegionName() {
        return regionName;
    }

    public void setRegionName(String regionName) {
        this.regionName = regionName;
    }

    public String getStreetName() {
        return streetName;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    @Override
    public String toString() {
        return "Address{" +
                "countrName='" + countrName + '\'' +
                ", regionName='" + regionName + '\'' +
                ", streetName='" + streetName + '\'' +
                '}';
    }
}
