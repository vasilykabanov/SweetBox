/**
 * Created by yasup on 29.10.2019.
 */

public class Main {
    public static void main(String[] args) {
        Sweets candy1 = new Candy("Ласточка", 20, 70, "Шоколадная");
        Sweets candy2 = new Candy("Шипучка", 40, 80, "Карамель");
        Sweets jelly1 = new Jellybean("Желешка", 25, 120, "Красный");
        Sweets jelly2 = new Jellybean("Мармедад Тульский", 45, 150, "Синий");
        Sweets cake1 = new Cake("Чизкейк", 400, 300, false);
        Sweets cake2 = new Cake("Трюфельный", 300, 150, true);
        SweetsBox sweetsBox = new SweetsBox();

        //add
        sweetsBox.addSweets(candy1);
        sweetsBox.addSweets(candy2);
        sweetsBox.addSweets(cake1);
        sweetsBox.addSweets(cake2);
        sweetsBox.addSweets(jelly1);
        sweetsBox.addSweets(jelly2);

        System.out.println();

        //printALLInfoSweets
        sweetsBox.printALLInfoSweets();

        System.out.println();

        //remove by index
        sweetsBox.removeSweets(2);
        sweetsBox.printALLInfoSweets();

        //remove last element
        sweetsBox.removeLastElementSweets();
        sweetsBox.printALLInfoSweets();

        System.out.println();

        //print printWeigh, printBoxCost again
        sweetsBox.printWeight();
        sweetsBox.printBoxCost();
    }
}