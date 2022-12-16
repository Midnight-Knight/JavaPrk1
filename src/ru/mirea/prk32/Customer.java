package ru.mirea.prk32;

public class Customer {
    private String firstName;
    private String secondName;
    private int age;
    private Address address;
    private final Customer MATURE_UNKNOWN_CUSTOMER = null;
    private final Customer NOT_MATURE_UNKNOWN_CUSTOMER = null;

    public Customer() {
        this.firstName = null;
        this.secondName = null;
        this.age = -1;
    }

    public Customer(int age) {
        this.firstName = null;
        this.secondName = null;
        this.age = age;
    }

    public Customer(String firstName, String secondName, int age, Address address) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.age = age;
        this.address = address;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public String getSecondName() {
        return this.secondName;
    }

    public int getAge() {
        return this.age;
    }

    public Address getAddress() {
        return this.address;
    }

    public String toString() {
        String var10000 = this.secondName;
        return var10000 + " " + this.firstName + " , " + this.age + " ; " + String.valueOf(this.address);
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
        result = 31 * result + this.firstName.hashCode();
        result = 31 * result + this.secondName.hashCode();
        result = 31 * result + this.age;
        result = 31 * result + this.address.hashCode();
        return result;
    }
}