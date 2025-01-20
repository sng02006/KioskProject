package com.example.kiosk.level04;

import java.util.ArrayList;
import java.util.List;

public class Menu {
    // 필드
    List<String> category = new ArrayList<>();
    List<MenuItem> menuItemsBurgers = new ArrayList<>();
    List<MenuItem> menuItemsDrinks = new ArrayList<>();
    List<MenuItem> menuItemsDesserts = new ArrayList<>();

    // 생성자

    // 메소드
    // 메뉴판 초기 설정
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
    List<String> getCategory() {
        return category;
    }

    // 카테고리 메뉴 출력 함수 (로 변경하기)
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
            System.out.println(i + 1 + ". " + menu.menuItemsBurgers.get(i).productName + " | W " + menu.menuItemsBurgers.get(i).productPrice + " | " + menu.menuItemsBurgers.get(i).productExplain);
        }
        System.out.println("0. 뒤로가기               | 뒤로가기");
    }

    void printMenuDrinks(Menu menu, int selectCategory) {
        System.out.println("[" + category.get(selectCategory - 1).toUpperCase() + " MENU]");
        for (int i = 0; i < menu.menuItemsDrinks.size(); i++) {
            System.out.println(i + 1 + ". " + menu.menuItemsDrinks.get(i).productName + " | W " + menu.menuItemsDrinks.get(i).productPrice + " | " + menu.menuItemsDrinks.get(i).productExplain);
        }
        System.out.println("0. 뒤로가기               | 뒤로가기");
    }

    void printMenuDesserts(Menu menu, int selectCategory) {
        System.out.println("[" + category.get(selectCategory - 1).toUpperCase() + " MENU]");
        for (int i = 0; i < menu.menuItemsDesserts.size(); i++) {
            System.out.println(i + 1 + ". " + menu.menuItemsDesserts.get(i).productName + " | W " + menu.menuItemsDesserts.get(i).productPrice + " | " + menu.menuItemsDesserts.get(i).productExplain);
        }
        System.out.println("0. 뒤로가기               | 뒤로가기");
    }
}
// List에 들어있는 MenuItem을 순차적으로 보여주는 함수
// List를 리턴하는 함수