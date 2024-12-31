package kiosk.menu;

import kiosk.menu.base.Food;

public class Side extends Food {
    public Side(String name, int price, int count) {
        super(name, "사이드메뉴", price, count);
    }
}
