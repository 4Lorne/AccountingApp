package Classes;

public class Person {
    private final String name;
    private final String address;

    Person(String name, String address){
        this.name = name;
        this.address = address;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Address: " + address;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }
}
