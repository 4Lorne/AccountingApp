package Classes;

public class Student extends Person{
    private int year;

    public Student(String name, String address, int year){
        super(name,address);
        this.year = year;
    }

    @Override
    public String toString() {
        return "Student{" +
                "year=" + year +
                '}' + super.toString();
    }
}
