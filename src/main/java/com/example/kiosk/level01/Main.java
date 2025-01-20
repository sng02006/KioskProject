package com.example.kiosk.level01;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean exit = true;
        int select = 0;

        while (exit) {
            System.out.println("[SHAKESHACK MENU]");
            System.out.println("1. ShakeBurger  | W 6.9  | 토마토, 양상추, 쉑소스가 토핑된 치즈버거");
            System.out.println("2. SmokeShack   | W 8.9   | 베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거");
            System.out.println("3. CheeseBurger | W 6.9 | 포테이토 번과 비프패티, 치즈가 토핑된 치즈버거");
            System.out.println("4. Hamburger    | W 5.4    | 비프패티를 기반으로 야채가 들어간 기본버거");
            System.out.println("0. 종료         | 종료");

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