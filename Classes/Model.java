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

    public ArrayList<Student> toStringStudent() {
        return studentArrayList;
    }

    double calculateFee(Student student){
        double fee = 3000;
        if (student.getYear() == 1) {
            return fee;
        }
        if (student.getYear() == 2){
            fee = 3100;
            return fee;
        }
        if (student.getYear() == 3){
            fee = 3200;
            return fee;
        }
        if (student.getYear() == 4){
            fee = 3300;
            return fee;
        }
        return fee;
    }

}
