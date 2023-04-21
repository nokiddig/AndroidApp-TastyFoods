package com.example.tastyfoods.data.model;

public class User {
    private  String name, userId, address;
    private int money;
    private String phoneNumber;
    private String password;
    private String image;
    private String birthday;

    public User(String name, String userId, String address, int money, String phoneNumber, String password, String image, String birthday) {
        this.name = name;
        this.userId = userId;
        this.address = address;
        this.money = money;
        this.phoneNumber = phoneNumber;
        this.password = password;
        this.image = image;
        this.birthday = birthday;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }
}
