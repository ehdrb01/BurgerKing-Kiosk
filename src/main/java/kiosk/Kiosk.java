package kiosk;

import kiosk.menu.Beverage;
import kiosk.menu.Burger;
import kiosk.menu.Side;
import kiosk.menu.base.Food;
import kiosk.print.Printer;

import java.util.ArrayList;
import java.util.Scanner;

public class Kiosk {
    private ArrayList<Food> basket;
    private final Scanner scanner;

    public void run() {
        while(true) {
            int selectedNumber;

            Printer.printHome();
            selectedNumber = scanner.nextInt();

            switch (selectedNumber) {
                case 1:
                    addBurger();
                    break;
                case 2:
                    addSide();
                    break;
                case 3:
                    addBeverage();
                    break;
                case 4:
                    handleBasket();
                    break;
                case 5:
                    break;
                default:
                    System.out.println("잘못된 숫자를 입력하셨습니다.");
            }

            if(selectedNumber == 5) break;
        }
    }

    public void addBurger() {
        int selectedNumber;

        Printer.printBurger();
        selectedNumber = scanner.nextInt();
        Burger newBurger;
        int checkedOffset;

        switch (selectedNumber) {
            case 0:
                System.out.println("홈으로 돌아갑니다!");
                break;
            case 1:
                newBurger = new Burger("와퍼", 6900, 1);
                checkedOffset = checkDuplicate(newBurger);

                if(checkedOffset == -1) {
                    basket.add(newBurger);
                } else {
                    basket.get(checkedOffset).setCount(basket.get(checkedOffset).getCount() + 1);
                }

                break;
            case 2:
                newBurger = new Burger("큐브 스테이크 와퍼", 8900, 1);
                checkedOffset = checkDuplicate(newBurger);

                if(checkedOffset == -1) {
                    basket.add(newBurger);
                } else {
                    basket.get(checkedOffset).setCount(basket.get(checkedOffset).getCount() + 1);
                }

                break;
            case 3:
                newBurger = new Burger("콰트로 치즈 와퍼", 7900, 1);
                checkedOffset = checkDuplicate(newBurger);

                if(checkedOffset == -1) {
                    basket.add(newBurger);
                } else {
                    basket.get(checkedOffset).setCount(basket.get(checkedOffset).getCount() + 1);
                }

                break;
            case 4:
                newBurger = new Burger("몬스터 와퍼", 9300, 1);
                checkedOffset = checkDuplicate(newBurger);

                if(checkedOffset == -1) {
                    basket.add(newBurger);
                } else {
                    basket.get(checkedOffset).setCount(basket.get(checkedOffset).getCount() + 1);
                }
                break;
            case 5:
                newBurger = new Burger("통새우 와퍼", 7900, 1);
                checkedOffset = checkDuplicate(newBurger);

                if(checkedOffset == -1) {
                    basket.add(newBurger);
                } else {
                    basket.get(checkedOffset).setCount(basket.get(checkedOffset).getCount() + 1);
                }
                break;
            case 6:
                newBurger = new Burger("블랙바베큐 와퍼", 9300, 1);
                checkedOffset = checkDuplicate(newBurger);

                if(checkedOffset == -1) {
                    basket.add(newBurger);
                } else {
                    basket.get(checkedOffset).setCount(basket.get(checkedOffset).getCount() + 1);
                }
                break;
            default:
                System.out.println("잘못된 번호를 입력하셨습니다.");
        }

    }

    public void addSide() {
        int selectedNumber;

        Printer.printSide();
        selectedNumber = scanner.nextInt();

        Side newSide;
        int checkedOffset;

        switch (selectedNumber) {
            case 0:
                System.out.println("홈으로 돌아갑니다!");
                break;
            case 1:
                newSide = new Side("너겟킹", 2500, 1);
                checkedOffset = checkDuplicate(newSide);

                if(checkedOffset == -1) {
                    basket.add(newSide);
                } else {
                    basket.get(checkedOffset).setCount(basket.get(checkedOffset).getCount() + 1);
                }

                break;
            case 2:
                newSide = new Side("해쉬 브라운", 1800, 1);
                checkedOffset = checkDuplicate(newSide);

                if(checkedOffset == -1) {
                    basket.add(newSide);
                } else {
                    basket.get(checkedOffset).setCount(basket.get(checkedOffset).getCount() + 1);
                }

                break;
            case 3:
                newSide = new Side("치즈스틱", 1200, 1);
                checkedOffset = checkDuplicate(newSide);

                if(checkedOffset == -1) {
                    basket.add(newSide);
                } else {
                    basket.get(checkedOffset).setCount(basket.get(checkedOffset).getCount() + 1);
                }

                break;
            case 4:
                newSide = new Side("어니언링", 2400, 1);
                checkedOffset = checkDuplicate(newSide);

                if(checkedOffset == -1) {
                    basket.add(newSide);
                } else {
                    basket.get(checkedOffset).setCount(basket.get(checkedOffset).getCount() + 1);
                }

                break;
            case 5:
                newSide = new Side("바삭킹", 3000, 1);
                checkedOffset = checkDuplicate(newSide);

                if(checkedOffset == -1) {
                    basket.add(newSide);
                } else {
                    basket.get(checkedOffset).setCount(basket.get(checkedOffset).getCount() + 1);
                }

                break;
            case 6:
                newSide = new Side("감자튀김", 2500, 1);
                checkedOffset = checkDuplicate(newSide);

                if(checkedOffset == -1) {
                    basket.add(newSide);
                } else {
                    basket.get(checkedOffset).setCount(basket.get(checkedOffset).getCount() + 1);
                }

                break;
            default:
                System.out.println("잘못된 번호를 입력하셨습니다.");
        }
    }

    public void addBeverage() {
        int selectedNumber;

        Printer.printBeverage();
        selectedNumber = scanner.nextInt();

        Beverage newBeverage;
        int checkedOffset;

        switch (selectedNumber) {
            case 0:
                System.out.println("홈으로 돌아갑니다!");
                break;
            case 1:
                newBeverage = new Beverage("코카콜라", 2000, 1);
                checkedOffset = checkDuplicate(newBeverage);

                if(checkedOffset == -1) {
                    basket.add(newBeverage);
                } else {
                    basket.get(checkedOffset).setCount(basket.get(checkedOffset).getCount() + 1);
                }

                break;
            case 2:
                newBeverage = new Beverage("코카콜라 제로", 2000, 1);
                checkedOffset = checkDuplicate(newBeverage);

                if(checkedOffset == -1) {
                    basket.add(newBeverage);
                } else {
                    basket.get(checkedOffset).setCount(basket.get(checkedOffset).getCount() + 1);
                }

                break;
            case 3:
                newBeverage = new Beverage("펩시", 2000, 1);
                checkedOffset = checkDuplicate(newBeverage);

                if(checkedOffset == -1) {
                    basket.add(newBeverage);
                } else {
                    basket.get(checkedOffset).setCount(basket.get(checkedOffset).getCount() + 1);
                }

                break;
            case 4:
                newBeverage = new Beverage("펩시 제로", 2000, 1);
                checkedOffset = checkDuplicate(newBeverage);

                if(checkedOffset == -1) {
                    basket.add(newBeverage);
                } else {
                    basket.get(checkedOffset).setCount(basket.get(checkedOffset).getCount() + 1);
                }

                break;
            case 5:
                newBeverage = new Beverage("스프라이트", 2000, 1);
                checkedOffset = checkDuplicate(newBeverage);

                if(checkedOffset == -1) {
                    basket.add(newBeverage);
                } else {
                    basket.get(checkedOffset).setCount(basket.get(checkedOffset).getCount() + 1);
                }

                break;
            case 6:
                newBeverage = new Beverage("스프라이트 제로", 2000, 1);
                checkedOffset = checkDuplicate(newBeverage);

                if(checkedOffset == -1) {
                    basket.add(newBeverage);
                } else {
                    basket.get(checkedOffset).setCount(basket.get(checkedOffset).getCount() + 1);
                }

                break;
            default:
                System.out.println("잘못된 번호를 입력하셨습니다.");
        }
    }

    public void handleBasket() {
        int selectedNumber;

        Printer.printBasket(basket);

        if(basket.isEmpty()) {
            System.out.println("장바구니에 아무 것도 들어있지 않아 홈으로 이동합니다!");
            return;
        }

        selectedNumber = scanner.nextInt();

        switch (selectedNumber) {
            case 0:
                System.out.println("홈으로 돌아갑니다!");
                break;
            case 1:
                System.out.println("주문이 정상적으로 접수 되었습니다!");
                basket = new ArrayList<>();
                break;
            case 2:
                int selectedMenuNumber;
                int adjustCount;

                Printer.printAdjustCount(basket);
                System.out.print("수량을 조절할 메뉴 번호를 선택하세요 (0을 선택 시 홈으로): ");
                selectedMenuNumber = scanner.nextInt();

                if(selectedMenuNumber <= 0 || selectedMenuNumber > basket.size()) break;

                System.out.print("변경할 수량을 입력하세요: ");
                adjustCount = scanner.nextInt();

                basket.get(selectedMenuNumber - 1).setCount(adjustCount);
                break;
            case 3:
                int selectedDeleteNumber;
                int isDelete;

                Printer.printDeleteMenu(basket);
                System.out.print("삭제할 메뉴 번호를 선택하세요 (0을 선택 시 홈으로): ");
                selectedDeleteNumber = scanner.nextInt();

                if(selectedDeleteNumber <= 0 || selectedDeleteNumber > basket.size()) break;

                System.out.print("정말 삭제 하시겠습니까? (0: 취소 및 홈으로 1: 삭제): ");
                isDelete = scanner.nextInt();

                if(isDelete == 0) {
                    break;
                } else if(isDelete == 1) {
                    basket.remove(selectedDeleteNumber - 1);
                    break;
                } else {
                    System.out.println("잘못된 번호를 입력하셨습니다.");
                    break;
                }
            default:
                System.out.println("잘못된 번호를 입력하셨습니다.");
        }
    }

    public int checkDuplicate(Food newFood) {
        for(int i = 0; i < basket.size(); i++) {
            if(basket.get(i).getName().equals(newFood.getName())) {
                return i;
            }
        }

        return -1;
    }

    public Kiosk() {
        basket = new ArrayList<>();
        scanner = new Scanner(System.in);
    }
}
