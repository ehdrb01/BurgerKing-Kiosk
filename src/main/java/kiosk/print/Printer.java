package kiosk.print;

import kiosk.menu.base.Food;

import java.util.List;

public class Printer {
    public static void printHome() {
        System.out.println("=====홈=====");
        System.out.println();
        System.out.println("1. 햄버거");
        System.out.println("2. 사이드");
        System.out.println("3. 음료");
        System.out.println("4. 장바구니");
        System.out.println("5. 종료");
        System.out.println();
        System.out.print("메뉴선택: ");
    }

    public static void printBurger() {
        System.out.println("=====햄버거 메뉴=====");
        System.out.println();
        System.out.println("1. 와퍼 (6900원)");
        System.out.println("2. 큐브 스테이크 와퍼 (8900원)");
        System.out.println("3. 콰트로 치즈 와퍼 (7900원)");
        System.out.println("4. 몬스터 와퍼 (9300원)");
        System.out.println("5. 통새우 와퍼 (7900원)");
        System.out.println("6. 블랙바베큐 와퍼 (9300원)");
        System.out.println();
        System.out.print("메뉴선택 (0을 선택 시 홈으로): ");

    }

    public static void printSide() {
        System.out.println("=====사이드 메뉴=====");
        System.out.println();
        System.out.println("1. 너겟킹 (2500원)");
        System.out.println("2. 해쉬 브라운 (1800원)");
        System.out.println("3. 치즈스틱 (1200원)");
        System.out.println("4. 어니언링 (2400원)");
        System.out.println("5. 바삭킹 (3000원)");
        System.out.println("6. 감자튀김 (2000원)");
        System.out.println();
        System.out.print("메뉴선택 (0을 선택 시 홈으로): ");
    }

    public static void printBeverage() {
        System.out.println("=====음료 메뉴=====");
        System.out.println();
        System.out.println("1. 코카콜라 (2000원)");
        System.out.println("2. 코카콜라 제로 (2000원)");
        System.out.println("3. 펩시 (2000원)");
        System.out.println("4. 펩시 제로 (2000원)");
        System.out.println("5. 스프라이트 (2000원)");
        System.out.println("6. 스프라이트 제로 (2000원)");
        System.out.println();
        System.out.print("메뉴선택 (0을 선택 시 홈으로): ");
    }

    public static void printAdjustCount(List<Food> foodList) {
        System.out.println("===== 수량 조절하기 =====");
        System.out.println();
        System.out.println("현재 장바구니");
        System.out.println();

        for(int i = 0; i < foodList.size(); i++) {
            System.out.println(i + 1 + "." + foodList.get(i).toString());
        }

    }

    public static void printDeleteMenu(List<Food> foodList) {
        System.out.println("===== 삭제하기 =====");
        System.out.println();
        System.out.println("현재 장바구니");
        System.out.println();

        for(int i = 0; i < foodList.size(); i++) {
            System.out.println(i + 1 + "." + foodList.get(i).toString());
        }

    }

    public static void printBasket(List<Food> foodList) {
        int totalPrice = 0;

        System.out.println("===== 장바구니 =====");
        System.out.println();

        for(Food food : foodList) {
            totalPrice += food.getPrice() * food.getCount();
            System.out.println("- " + food);
        }

        System.out.println();
        System.out.println("====================");
        System.out.println("1. 주문하기");
        System.out.println("2. 수량 조절하기");
        System.out.println("3. 삭제하기");
        System.out.println();
        System.out.println("총 가격: " + totalPrice + "원");
        System.out.println();

        if(foodList.isEmpty()) {
            return;
        }

        System.out.print("메뉴선택 (0을 선택 시 홈으로): ");
    }


}
