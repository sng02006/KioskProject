package com.example.kiosk.level06;

import java.util.ArrayList;
import java.util.List;

public class Menu {
    // 필드
    private List<String> category = new ArrayList<>();
    private List<MenuItem> menuItemsBurgers = new ArrayList<>();
    private List<MenuItem> menuItemsDrinks = new ArrayList<>();
    private List<MenuItem> menuItemsDesserts = new ArrayList<>();

    // 생성자

    // 메소드
    // 메뉴 초기 설정
    void init() {
        // 카테고리
        category.add("Burgers");
        category.add("Drinks");
        category.add("Desserts");

        // 메뉴
        // 햄버거
        menuItemsBurgers.add(new MenuItem("ShakeBurger", 6.9, "토마토, 양상추, 쉑소스가 토핑된 치즈버거"));
        menuItemsBurgers.add(new MenuItem("SmokeShack", 8.9, "베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거"));
        menuItemsBurgers.add(new MenuItem("CheeseBurger", 6.9, "포테이토 번과 비프패티, 치즈가 토핑된 치즈버거"));
        menuItemsBurgers.add(new MenuItem("Hamburger", 5.4, "비프패티를 기반으로 야채가 들어간 기본버거"));

        // 음료수
        menuItemsDrinks.add(new MenuItem("Coca-Cola", 2.0, "코카콜라"));
        menuItemsDrinks.add(new MenuItem("Sprit", 2.0, "스프라이트"));
        menuItemsDrinks.add(new MenuItem("Americano", 1.5, "아메리카노"));

        // 디저트
        menuItemsDesserts.add(new MenuItem("FrenchFries", 2.0, "감자튀김"));
        menuItemsDesserts.add(new MenuItem("CheeseFrenchFries", 3.0, "치즈 감자튀김"));
        menuItemsDesserts.add(new MenuItem("SoftIceCream", 1.5, "소프트 아이스크림"));
        menuItemsDesserts.add(new MenuItem("ChickenNugget", 4.0, "치킨 너겟"));
        menuItemsDesserts.add(new MenuItem("CheeseSticks", 2.0, "치즈 스틱"));

    }

    // 카테고리 메뉴 리스트 반환
    // Getter Method
    List<String> getCategory() {
        return category;
    }

    List<MenuItem> getmenuItemsBurgers() {
        return menuItemsBurgers;
    }

    List<MenuItem> getmenuItemsDrinks() {
        return menuItemsDrinks;
    }

    List<MenuItem> getmenuItemsDesserts() {
        return menuItemsDesserts;
    }

    // Setter Method
    void setCategory(List<String> category) {
        this.category = category;
    }

    void setmenuItemsBurgers(List<MenuItem> menuItemsBurgers) {
        this.menuItemsBurgers = menuItemsBurgers;
    }

    void setmenuItemsDrinks(List<MenuItem> menuItemsDrinks) {
        this.menuItemsDrinks = menuItemsDrinks;
    }

    void setmenuItemsDesserts(List<MenuItem> menuItemsDesserts) {
        this.menuItemsDesserts = menuItemsDesserts;
    }

    // 카테고리 메뉴 출력 함수
    void printCategory() {
        System.out.println("[MAIN MENU]");
        for (int i = 0; i < category.size(); i++) {
            System.out.println(i + 1 + ". " + category.get(i));
        }
        System.out.println("0. 종료               | 종료");
    }

    // 상세 메뉴 출력 함수
    void printMenuBurgers(Menu menu, int selectCategory) {
        System.out.println("[" + category.get(selectCategory - 1).toUpperCase() + " MENU]");
        for (int i = 0; i < menu.menuItemsBurgers.size(); i++) {
            System.out.println(i + 1 + ". " + menu.menuItemsBurgers.get(i).getProductName() + " | W " + menu.menuItemsBurgers.get(i).getProductPrice() + " | " + menu.menuItemsBurgers.get(i).getProductExplain());
        }
        System.out.println("0. 뒤로가기               | 뒤로가기");
    }

    void printMenuDrinks(Menu menu, int selectCategory) {
        System.out.println("[" + category.get(selectCategory - 1).toUpperCase() + " MENU]");
        for (int i = 0; i < menu.menuItemsDrinks.size(); i++) {
            System.out.println(i + 1 + ". " + menu.menuItemsDrinks.get(i).getProductName() + " | W " + menu.menuItemsDrinks.get(i).getProductPrice() + " | " + menu.menuItemsDrinks.get(i).getProductExplain());
        }
        System.out.println("0. 뒤로가기               | 뒤로가기");
    }

    void printMenuDesserts(Menu menu, int selectCategory) {
        System.out.println("[" + category.get(selectCategory - 1).toUpperCase() + " MENU]");
        for (int i = 0; i < menu.menuItemsDesserts.size(); i++) {
            System.out.println(i + 1 + ". " + menu.menuItemsDesserts.get(i).getProductName() + " | W " + menu.menuItemsDesserts.get(i).getProductPrice() + " | " + menu.menuItemsDesserts.get(i).getProductExplain());
        }
        System.out.println("0. 뒤로가기               | 뒤로가기");
    }
}