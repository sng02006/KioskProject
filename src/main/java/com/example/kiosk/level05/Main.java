package com.example.kiosk.level05;

public class Main {
    public static void main(String[] args) {
        // Menu 객체 생성
        Menu menu = new Menu();
        menu.init();

        // Kiosk 객체 생성
        Kiosk kiosk = new Kiosk(menu);
        kiosk.start();
    }
}