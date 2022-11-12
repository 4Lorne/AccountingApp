package Classes;

public class Student extends Person{
    private final int year;

    public Student(String name, String address, int year){
        super(name,address);
        this.year = year;
    }

    @Override
    public String toString() {
        return super.toString() + ", Year: "+year;
    }

    public int getYear() {
        return year;
    }

}
