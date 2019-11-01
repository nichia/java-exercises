package org.launchcode.java.studios.restaurant;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class MenuItem {
    private static int nextItemId = 1;
    private String name;
    private final int itemId;
    private double price;
    private String description;
    private String category;
    private String date;
    private final SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");

    public MenuItem(String name, int itemId, double price, String description, String category) {
        this.name = name;
        this.itemId = itemId;
        this.price = price;
        this.description = description;
        this.category = category;
        this.date = simpleDateFormat.format(new Date());
    }

    public MenuItem(String name) {
        this(name, nextItemId, 0.0, "", "");
        nextItemId++;
    }

    public String getName() {
        return name;
    }

    public void setName (String aName) {
        name = aName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription (String aDescription) {
        description = aDescription;
    }


    public double getPrice() {
        return price;
    }

    public void setPrice (double aPrice) {
        price = aPrice;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String aCategory) {
        category = aCategory;
    }
}
