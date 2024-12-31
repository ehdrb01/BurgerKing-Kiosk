package kiosk.menu;

import kiosk.menu.base.Food;

public class Beverage extends Food {
    public Beverage(String name, int price, int count) {
        super(name, "음료", price, count);
    }
}
