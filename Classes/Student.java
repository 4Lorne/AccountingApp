package Classes;

public class Student extends Person{
    private int year;

    Student(String name, String address, int year){
        super(name,address);
        this.year = year;
    }
}
