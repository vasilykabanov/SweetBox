/**
 * Created by yasup on 28.10.2019.
 */
public class Candy extends Sweets {

    private String type;

    public Candy(String name, int weight, double price, String type) {
        super(name, weight, price);
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Candy{" +
                "type='" + type +
                '\'' +
                ", name=" + getName() +
                ", weight=" + getWeight() +
                ", price=" + getPrice() +
                '}' +
                "\n";
    }
}
