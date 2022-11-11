package Classes;

import java.util.ArrayList;

public class Model {
    private static final ArrayList<Student> studentArrayList = new ArrayList<>();
    private static final ArrayList<Staff> staffArrayList = new ArrayList<>();

    private String name;
    private String address;
    private int year;

    public void addStudent(String name, String address, int year) {
        this.name = name;
        this.address = address;
        this.year = year;
        studentArrayList.add(new Student(this.name, this.address, this.year));
    }

    public void addStaff(String name, String address, int year) {
        this.name = name;
        this.address = address;
        this.year = year;
        staffArrayList.add(new Staff(this.name, this.address, this.year));
    }

    @Override
    public String toString() {
        return "Model{" +
                "studentArrayList=" + studentArrayList +
                '}';
    }
}
