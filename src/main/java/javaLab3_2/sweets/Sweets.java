package javaLab3_2.sweets;

public abstract class Sweets {

    private String name;
    private double weight;
    private double price;

    public Sweets(String name, double weight, double price) {
        this.name = name;
        this.weight = weight;
        this.price = price;
    }
    public String getName() {return name;}
    public double getWeight() {return weight;}
    public double getPrice() {return price;}

    @Override
    public String toString() {
        return "Название: " + name +
                ", вес: " + weight +
                " г, цена: " + price + " руб.";
    }
}
