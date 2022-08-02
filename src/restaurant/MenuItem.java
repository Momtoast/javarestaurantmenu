package restaurant;

import java.time.LocalDate;
import java.util.Date;
import java.util.Objects;

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
        this.dateAdded = new Date();
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

    public boolean isItemNew(Date lastUpdate) {
        boolean test = dateAdded.before(lastUpdate);
        if (test) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        return this.name + ": " +
                this.description +
                "\n" + this.price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MenuItem menuItem = (MenuItem) o;
        return getName().equals(menuItem.getName()) && getDescription().equals(menuItem.getDescription());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getDescription());
    }
}
