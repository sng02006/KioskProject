package com.example.kiosk.level05;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Kiosk {
    // 필드
    Scanner sc = new Scanner(System.in);
    private boolean exit = true;
    private int selectCategory = 0;
    private int selectMenu = 0;
    private Menu menu = new Menu();
    private List<String> category = new ArrayList<>();

    // 생성자(기본 생성자)
    Kiosk (Menu menu) {
        this.menu = menu;
    }

    // 메소드
    void start() {
        category = menu.getCategory();

        while (exit) {
            // 카테고리 메뉴 출력
            menu.printCategory();

            // 카테고리 메뉴 입력
            selectCategory = sc.nextInt();

            // 상세 메뉴 출력
            switch (selectCategory) {
                case 1 :
                    menu.printMenuBurgers(menu, selectCategory);
                    // 상세 메뉴 입력
                    selectMenu = sc.nextInt();
                    // 뒤로가기
                    if (selectMenu == 0) continue;
                    break;
                case 2 :
                    menu.printMenuDrinks(menu, selectCategory);
                    // 상세 메뉴 입력
                    selectMenu = sc.nextInt();
                    // 뒤로가기
                    if (selectMenu == 0) continue;
                    break;
                case 3 :
                    menu.printMenuDesserts(menu, selectCategory);
                    // 상세 메뉴 입력
                    selectMenu = sc.nextInt();
                    // 뒤로가기
                    if (selectMenu == 0) continue;
                    break;
                case 0 :
                    // 종료
                    exit = false;
                    break;
                default :
                    System.out.println("다시 입력해주세요!");
                    continue;
            }

            // 선택한 메뉴 출력
            switch (selectCategory) {
                case 1 :
                    System.out.println("선택한 메뉴 : " + menu.getmenuItemsBurgers().get(selectMenu - 1).getProductName() + " | W " + menu.getmenuItemsBurgers().get(selectMenu - 1).getProductPrice() + " | " + menu.getmenuItemsBurgers().get(selectMenu - 1).getProductExplain());
                    break;
                case 2 :
                    System.out.println("선택한 메뉴 : " + menu.getmenuItemsDrinks().get(selectMenu - 1).getProductName() + " | W " + menu.getmenuItemsDrinks().get(selectMenu - 1).getProductPrice() + " | " + menu.getmenuItemsDrinks().get(selectMenu - 1).getProductExplain());
                    break;
                case 3 :
                    System.out.println("선택한 메뉴 : " + menu.getmenuItemsDesserts().get(selectMenu - 1).getProductName() + " | W " + menu.getmenuItemsDesserts().get(selectMenu - 1).getProductPrice() + " | " + menu.getmenuItemsDesserts().get(selectMenu - 1).getProductExplain());
                    break;
                default :
                    System.out.println("다시 입력해주세요!");
            }
        }
    }
}