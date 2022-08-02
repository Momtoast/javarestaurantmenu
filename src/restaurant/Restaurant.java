package restaurant;

import java.util.Date;
import java.util.ArrayList;

public class Restaurant {
    public static void main(String[] args) {
        MenuItem burger = new MenuItem("Royal Burger", 10.99, "A burger fit for a king, with cheese and our secret sauce.", "main course");
        MenuItem pizza = new MenuItem("Queen Pizza", 12.99, "This queenly pizza has royal amounts of pepperoni and sausage.", "main course");
        MenuItem nachos = new MenuItem("King Nachos", 8.99, "Giant nachos piled high with all your favorites.", "appetizer");
        Date lastUpdate = new Date(2021, 7,31);

        System.out.println(burger.isItemNew(lastUpdate));
        System.out.println(burger.toString());

        Menu royalty = new Menu(lastUpdate);

        royalty.addItem(burger);
        royalty.addItem(pizza);
        royalty.addItem(nachos);

        royalty.printMenu(royalty.getMenu());

        ArrayList<MenuItem> royaltyMenu = royalty.getMenu();

        royalty.removeItem(royaltyMenu, 2);

        royalty.printMenu(royalty.getMenu());

    }
}
