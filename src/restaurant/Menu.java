package restaurant;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;

public class Menu {
    private Date currentDate;
    private Date lastUpdated;
    private ArrayList<MenuItem> menu = new ArrayList<>();
    private ArrayList<MenuItem> newItems = new ArrayList<>();

    public Menu(Date lastUpdated) {
        this.currentDate = new Date();
        this.lastUpdated = lastUpdated;
        this.menu = menu;
    }

    public void setMenu(ArrayList<MenuItem> menu) {
        this.menu = menu;
    }
    public void setNewItems(ArrayList<MenuItem> newItems) {
        this.newItems = newItems;
    }

    public Date getCurrentDate() {
        return currentDate;
    }
    public Date getLastUpdated() {
        return lastUpdated;
    }
    public ArrayList<MenuItem> getMenu() {
        return menu;
    }
    public ArrayList<MenuItem> getNewItems() {
        return newItems;
    }

    public void addItem(MenuItem item) {
        menu.add(item);
    }
    public void removeItem(ArrayList<MenuItem> menu, String name) {
        int item = this.menu.indexOf(name);
        this.menu.remove(item);
    }

    public void setLastUpdated(Date lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

    public void printMenu(ArrayList<MenuItem> menu) {
        for (MenuItem item : menu) {
            System.out.println(item);
        }
    }
}
