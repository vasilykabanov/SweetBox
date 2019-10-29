/**
 * Created by yasup on 29.10.2019.
 */
public class Cake extends Sweets {

    private boolean cream;


    Cake(String name, int weight, double price, boolean cream) {
        super(name, weight, price);
        this.cream = cream;
    }

    public boolean isCream() {
        return cream;
    }

    public void setCream(boolean cream) {
        this.cream = cream;
    }

    @Override
    public String toString() {
        return "Cake{" +
                "cream=" + cream +
                '}';
    }
}
