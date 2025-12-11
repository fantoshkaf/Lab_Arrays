package javaLab3_2.sweets;

public class Jellybean extends Sweets {
    private String colour;

    public Jellybean(String name, double weight, double price, String colour) {
        super(name, weight, price);
        this.colour = colour;
    }

    @Override
    public String toString() {
        return super.toString() + ", цвет: " + colour;
    }
}
