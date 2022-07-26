package restaurant;

import java.time.LocalDate;
import java.util.Date;

public class MenuItem {
    private String name;
    private double price;
    private String description;
    private String category;
    private Date dateAdded;

    public MenuItem(String name, double price, String description, String category) {
        this.name = name;
        this.price = price;
        this.description = description;
        this.category = category;
        this.dateAdded = LocalDate.now();
    }

    public void setName(String aName) {
        name = aName;
    }
    public void setPrice(double aPrice) {
        price = aPrice;
    }
    public void setDescription(String aDescription) {
        description = aDescription;
    }
    public void setCategory(String aCategory) {
        category = aCategory;
    }

    public String getName() {
        return name;
    }
    public double getPrice() {
        return price;
    }
    public String getDescription() {
        return description;
    }
    public String getCategory() {
        return category;
    }
    public Date getDateAdded() {
        return dateAdded;
    }
}
