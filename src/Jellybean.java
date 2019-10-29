/**
 * Created by yasup on 28.10.2019.
 */
public class Jellybean extends Sweets {

    private String color;

    Jellybean(String name, int weight, double price, String color) {
        super(name, weight, price);
        this.color = color;
    }

    @Override
    public String toString() {
        return "Jellybean{" +
                "color='" + color +
                '\'' +
                '}';
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
