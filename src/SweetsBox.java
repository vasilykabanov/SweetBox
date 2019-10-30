import java.util.ArrayList;

/**
 * Created by yasup on 29.10.2019.
 */
public class SweetsBox implements Box {

    private int weightBox;
    private double costBox;
    private ArrayList<Sweets> sweetsArrayList = new ArrayList<>();

    public void addSweets(Sweets sweets) {
        sweetsArrayList.add(sweets);
        weightBox = weightBox + sweets.getWeight();
        costBox = costBox + sweets.getPrice();
    }

    @Override
    public void removeSweets(int index) {
        if (sweetsArrayList.size() > index) {
            Sweets sweets = sweetsArrayList.get(index);
            weightBox = weightBox - sweets.getWeight();
            costBox = costBox - sweets.getPrice();
            sweetsArrayList.remove(index);
        }else {
            System.out.println("Такого элемента не существует!");
        }
    }

    @Override
    public void removeLastElementSweets() {
        if (sweetsArrayList.size() > 0){
            removeSweets(sweetsArrayList.size() - 1);
        }
    }

    @Override
    public void printWeight() {
        System.out.println(weightBox + " грамм");
    }

    @Override
    public void printBoxCost() {
        System.out.println(costBox + " руб");
    }

    @Override
    public void printALLInfoSweets() {
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return "SweetsBox: " +
                "weightBox=" + weightBox +
                ", costBox=" + costBox + "\n" +
                "\n" + "sweetsArrayList=" + "\n" + sweetsArrayList;
    }
}
