package com.example.tastyfoods.data.model;

public class CartDetail {
    private String cartDetaild;
    private int money, amount;

    public CartDetail(String cartDetaild, int money, int amount) {
        this.cartDetaild = cartDetaild;
        this.money = money;
        this.amount = amount;
    }

    public String getCartDetaild() {
        return cartDetaild;
    }

    public void setCartDetaild(String cartDetaild) {
        this.cartDetaild = cartDetaild;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }
}
