package org.launchcode.java.studios.restaurant;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class Menu {
    private static int nextMenuId = 1;
    private String name;
    private int menuId;
    private ArrayList<MenuItem> items = new ArrayList<>();
    private String date;
    private final SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");

    public Menu(String name, int menuId, ArrayList items) {
        this.name = name;
        this.menuId = menuId;
        this.items = items;
        this.date = simpleDateFormat.format(new Date());
    }

    public Menu(String name) {
        this(name, nextMenuId, new ArrayList<>());
        nextMenuId++;
    }

    public String getName() {
        return name;
    }

    public void setName (String aName) {
        name = aName;
    }

    public ArrayList getItems() {
        return items;
    }

    public void setItems(ArrayList aItems) {
        items = aItems;
    }
}
