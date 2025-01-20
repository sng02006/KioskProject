package com.example.kiosk.level06;

public class MenuItem {
    // 필드
    private String productName;
    private double productPrice;
    private String productExplain;

    // 생성자
    public MenuItem(String productName, double productPrice, String productExplain){
        this.productName = productName;
        this.productPrice = productPrice;
        this.productExplain = productExplain;
    }

    // 메소드
    // Getter Method
    String getProductName() {
        return productName;
    }

    double getProductPrice() {
        return productPrice;
    }

    String getProductExplain() {
        return productExplain;
    }

    // Setter Method
    void setProductName(String productName) {
        this.productName = productName;
    }

    void setProductPrice(double setProductPrice) {
        this.productPrice = setProductPrice;
    }

    void setProductExplain(String setProductExplain) {
        this.productExplain = setProductExplain;
    }
}