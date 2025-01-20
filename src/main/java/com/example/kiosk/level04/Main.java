package com.example.kiosk.level04;

public class Main {
    public static void main(String[] args) {
        // Menu 객체 생성
        Menu menu = new Menu();
        menu.init();
        // Menu 객체 생성을 통해 이름 설정
        // Menu 클래스 내 있는 List<MenuItem> 에 MenuItem 객체 생성하면서 삽입

        // Kiosk 객체 생성
        Kiosk kiosk = new Kiosk(menu);
        kiosk.start();
    }
}