package org.launchcode.java.studios.restaurant;

import java.util.ArrayList;
import java.util.Date;

public class Menu {
    private static int nextMenuId = 1;

    private final ArrayList<MenuItem> items;
    private Date lastUpdated;
    private int menuId;


    public Menu() {
        this.menuId = menuId;
        this.items = new ArrayList<>();
        this.lastUpdated = new Date();
        nextMenuId++;
    }

    public void addItem(MenuItem item) {
        if (items.contains(item)) {
            return;
        }

        items.add(item);
        lastUpdated = new Date();
    }

    public boolean removeItem(MenuItem item) {
        boolean removed = items.remove(item);
        if (removed) {
            lastUpdated = new Date();
        }
        return removed;
    }


    public ArrayList getItems() {
        return items;
    }

    public Date getLastUpdated() {
        return lastUpdated;
    }

    public String toString() {
        String menuStr = "=== Menu ===\n";
        for (MenuItem item : items) {
            menuStr += item + "\n";
        }
        return menuStr;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;

        if (o == null || getClass() != o.getClass()) return false;

        Menu theMenu = (Menu) o;
        return menuId == theMenu.menuId;
    }

    @Override
    public int hashCode() {
        return menuId;
    }
}
