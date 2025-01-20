package com.example.kiosk.level03;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Kiosk {
    // 필드
    List<MenuItem> menuItems = new ArrayList<>();
    Scanner sc = new Scanner(System.in);
    boolean exit = true;
    int select = 0;

    // 생성자(기본 생성자)

    // 메소드
    void start() {
        menuItems.add(new MenuItem("ShakeBurger", 6.9, "토마토, 양상추, 쉑소스가 토핑된 치즈버거"));
        menuItems.add(new MenuItem("SmokeShack", 8.9, "베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거"));
        menuItems.add(new MenuItem("CheeseBurger", 6.9, "포테이토 번과 비프패티, 치즈가 토핑된 치즈버거"));
        menuItems.add(new MenuItem("Hamburger", 5.4, "비프패티를 기반으로 야채가 들어간 기본버거"));

        while (exit) {
            System.out.println("[SHAKESHACK MENU]");
            for (int i = 0; i < menuItems.size(); i++) {
                System.out.println(i + 1 + ". " + menuItems.get(i).productName + " | W " + menuItems.get(i).productPrice + " | " + menuItems.get(i).productExplain);
            }
            System.out.println("0. 종료               | 종료");

            select = sc.nextInt();

            switch (select) {
                case 1 :
                    System.out.println("1번을 선택하셨습니다.");
                    break;
                case 2 :
                    System.out.println("2번을 선택하셨습니다.");
                    break;
                case 3 :
                    System.out.println("3번을 선택하셨습니다.");
                    break;
                case 4 :
                    System.out.println("4번을 선택하셨습니다.");
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
