package com.example.kiosk.level04;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Kiosk {
    // 필드
    Scanner sc = new Scanner(System.in);
    boolean exit = true;
    int selectCategory = 0;
    int selectMenu = 0;
    Menu menu = new Menu();
    List<String> category = new ArrayList<>();

    // 생성자(기본 생성자)
    Kiosk (Menu menu) {
        this.menu = menu;
    }

    // 메소드
    void start() {
        while (exit) {
            // 카테고리 메뉴 출력
            category = menu.getCategory();
            menu.printCategory();

            // 카테고리 메뉴 입력
            selectCategory = sc.nextInt();

            // 상세 메뉴 출력
            switch (selectCategory) {
                case 1 :
                    menu.printMenuBurgers(menu, selectCategory);
                    // 상세 메뉴 입력
                    selectMenu = sc.nextInt();
                    if (selectMenu == 0) continue;
                    break;
                case 2 :
                    menu.printMenuDrinks(menu, selectCategory);
                    // 상세 메뉴 입력
                    selectMenu = sc.nextInt();
                    if (selectMenu == 0) continue;
                    break;
                case 3 :
                    menu.printMenuDesserts(menu, selectCategory);
                    // 상세 메뉴 입력
                    selectMenu = sc.nextInt();
                    if (selectMenu == 0) continue;
                    break;
                case 0 :
                    exit = false;
                    break;
                default :
                    System.out.println("다시 입력해주세요!");
                    break;
            }

            // 선택한 메뉴 출력
            switch (selectCategory) {
                case 1 :
                    System.out.println("선택한 메뉴 : " + menu.menuItemsBurgers.get(selectMenu - 1).productName + " | W " + menu.menuItemsBurgers.get(selectMenu - 1).productPrice + " | " + menu.menuItemsBurgers.get(selectMenu - 1).productExplain);
                    break;
                case 2 :
                    System.out.println("선택한 메뉴 : " + menu.menuItemsDrinks.get(selectMenu - 1).productName + " | W " + menu.menuItemsDrinks.get(selectMenu - 1).productPrice + " | " + menu.menuItemsDrinks.get(selectMenu - 1).productExplain);
                    break;
                case 3 :
                    System.out.println("선택한 메뉴 : " + menu.menuItemsDesserts.get(selectMenu - 1).productName + " | W " + menu.menuItemsDesserts.get(selectMenu - 1).productPrice + " | " + menu.menuItemsDesserts.get(selectMenu - 1).productExplain);
                    break;
                case 0 :
                    exit = false;
                    break;
                default :
                    System.out.println("다시 입력해주세요!");
                    break;
            }

        }
    }
}