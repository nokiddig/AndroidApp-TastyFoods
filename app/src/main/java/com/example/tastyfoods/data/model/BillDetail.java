package com.example.tastyfoods.data.model;

public class BillDetail {
    private  String billDetaild;
    private int money, amount;

    public String getBillDetaild() {
        return billDetaild;
    }

    public void setBillDetaild(String billDetaild) {
        this.billDetaild = billDetaild;
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

    public BillDetail(String billDetaild, int money, int amount) {
        this.billDetaild = billDetaild;
        this.money = money;
        this.amount = amount;
    }
}
