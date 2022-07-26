package restaurant;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;

public class Menu {
    private Date currentDate;
    private Date lastUpdated;
    private ArrayList<MenuItem> menu;
    private ArrayList<MenuItem> newItems;

    public Menu(ArrayList<MenuItem> menu, lastUpdated) {
        this.currentDate = LocalDate.now();
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

    public ArrayList<MenuItem> createNewItems(ArrayList<MenuItem> menu) {
        // here I will make a method that looks for new menu items and populates newItems, then prints it
    }

    public ArrayList<MenuItem> createMenu(ArrayList<MenuItem> menu) {
        // here I will make a method that prints the whole menu by category
    }

    public void setLastUpdated() {
        //this should change lastUpdated to the current date, only to run after creating the menu
    }
}
