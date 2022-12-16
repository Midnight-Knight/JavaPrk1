package ru.mirea.prk32;

public class Address {
    private String cityName;
    private int zipCode;
    private String streetName;
    private int buildingNumber;
    private char buildingLetter;
    private int apartmentNumber;
    public final Address EMPTY_ADDRESS = null;

    public Address() {
        this.cityName = null;
        this.zipCode = -1;
        this.streetName = null;
        this.buildingNumber = -1;
        this.buildingLetter = 0;
        this.apartmentNumber = -1;
    }

    public Address(String streetName, int buildingNumber, char buildingLetter, int apartmentNumber) {
        this.streetName = streetName;
        this.buildingNumber = buildingNumber;
        this.buildingLetter = buildingLetter;
        this.apartmentNumber = apartmentNumber;
        this.cityName = "Samara";
        this.zipCode = -1;
    }

    public Address(String city, int code, String street, int buildingNumber, char buildingLetter, int apartment) {
        this.cityName = city;
        this.zipCode = code;
        this.streetName = street;
        this.buildingNumber = buildingNumber;
        this.buildingLetter = buildingLetter;
        this.apartmentNumber = apartment;
    }

    public String getCityName() {
        return this.cityName;
    }

    public int getZipCode() {
        return this.zipCode;
    }

    public String getStreetName() {
        return this.streetName;
    }

    public int getBuildingNumber() {
        return this.buildingNumber;
    }

    public char getBuildingLetter() {
        return this.buildingLetter;
    }

    public int getApartmentNumber() {
        return this.apartmentNumber;
    }

    public String toString() {
        return "Адрес: " + this.cityName + " " + this.zipCode + " , " + this.streetName + " д" + this.buildingNumber + " к" + this.buildingLetter + " кв" + this.apartmentNumber;
    }

    public String fileString()
    {
        return "'" + this.cityName + "' " + this.zipCode + " '" + this.streetName + "' " + this.buildingNumber + " " + this.buildingLetter + " " + this.apartmentNumber;
    }

    public boolean equals(Object object) {
        if (object != null && object.getClass() == this.getClass()) {
            return object == this;
        } else {
            return false;
        }
    }

    public int hashCode() {
        boolean prime = true;
        int result = 1;
        result = 31 * result + this.cityName.hashCode();
        result = 31 * result + this.zipCode;
        result = 31 * result + this.streetName.hashCode();
        result = 31 * result + this.buildingNumber;
        result = 31 * result + this.buildingLetter;
        result = 31 * result + this.apartmentNumber;
        return result;
    }
}
