/**
 * Created by yasup on 28.10.2019.
 */

abstract public class Sweets {

    private String name;
    private int weight;
    private double price;

    Sweets(String name, int weight, double price) {
        this.name = name;
        this.weight = weight;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Sweets{"
                + "name='" + name +
                '\'' + ", weight=" + weight +
                ", price="
                + price +
                '}';
    }
}
