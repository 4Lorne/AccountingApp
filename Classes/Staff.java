package Classes;

public class Staff extends Person {
    private int yos;
    Staff(String name, String address, int yos){
        super(name,address);
        this.yos = yos;
    }
}
