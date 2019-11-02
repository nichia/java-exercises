package org.launchcode.java.studios.restaurant;

import java.util.Date;

public class MenuItem {

    private static final int NEW_TERM_DURATION_IN_DAYS = 7;
    private String name;
    private String description;
    private double price;
    private String category;
    private final Date added;

    public MenuItem(String name, String description, double price, String category) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.category = category;
        this.added = new Date();
    }

    public MenuItem(String name, double price, String category) {
        this(name, "", price, category);
    }

    public MenuItem(String name, double price) {
        this(name, "", price, "entree");
    }

    public boolean  isNew() {
        long nowInMs = new Date().getTime();
        long newItemDurationInMs = NEW_TERM_DURATION_IN_DAYS*24*60*1000;
        return nowInMs - added.getTime() < newItemDurationInMs;
    }


    public String toString() {
        String itemStr = name + " - $" + String.format("%1$,.2f", price) + " (" + category + ")" + " : " + description ;
        if (isNew()) {
            itemStr += " (NEW)";
        }
        return itemStr;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        MenuItem theMenuItem = (MenuItem) o;

        if (Double.compare(theMenuItem.price, price) != 0) return false;
        if (name != null ? !name.equals(theMenuItem.name) : theMenuItem.name != null) return false;

        return added != null ? added.equals(theMenuItem.added) : theMenuItem.added == null;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = name != null ? name.hashCode() : 0;
        temp = Double.doubleToLongBits(price);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + (added != null ? added.hashCode() : 0);
        return result;
    }
}
