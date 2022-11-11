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
        return "Person{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
