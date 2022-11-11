package Classes;

public class Staff extends Person {
    private final int yos;
    public Staff(String name, String address, int yos){
        super(name,address);
        this.yos = yos;
    }

    @Override
    public String toString() {
        return "Staff{" +
                "yos=" + yos +
                '}' + super.toString();
    }
}
