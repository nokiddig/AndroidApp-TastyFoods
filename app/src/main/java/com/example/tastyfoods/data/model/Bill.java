package com.example.tastyfoods.data.model;

public class Bill {
    private  String billID;
    private String status;

    private String dateTime;
    private double totalMoney;

    public String getBillID() {
        return billID;
    }

    public void setBillID(String billID) {
        this.billID = billID;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getDateTime() {
        return dateTime;
    }

    public void setDateTime(String dateTime) {
        this.dateTime = dateTime;
    }

    public double getTotalMoney() {
        return totalMoney;
    }

    public void setTotalMoney(double totalMoney) {
        this.totalMoney = totalMoney;
    }

    public Bill(String billID, String status, String dateTime, double totalMoney) {
        this.billID = billID;
        this.status = status;
        this.dateTime = dateTime;
        this.totalMoney = totalMoney;
    }


}
