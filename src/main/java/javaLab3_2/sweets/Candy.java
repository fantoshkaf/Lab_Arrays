package javaLab3_2.sweets;

public class Candy extends Sweets {
    private String taste;

    public Candy(String name, double weight, double price, String taste) {
        super(name, weight, price);
        this.taste = taste;
    }

    @Override
    public String toString() {
        return super.toString() + ", вкус: " + taste;
    }
}
