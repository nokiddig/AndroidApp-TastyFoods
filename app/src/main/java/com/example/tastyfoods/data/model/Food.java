package com.example.tastyfoods.data.model;

public class Food {
    private String name;
    private String description;
    private String image;
    private double ratePoint;
    private int price;
    private String categoryId;

    public Food(String name, String description, String image, double ratePoint, int price, String categoryId) {
        this.name = name;
        this.description = description;
        this.image = image;
        this.ratePoint = ratePoint;
        this.price = price;
        this.categoryId = categoryId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public double getRatePoint() {
        return ratePoint;
    }

    public void setRatePoint(double ratePoint) {
        this.ratePoint = ratePoint;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(String categoryId) {
        this.categoryId = categoryId;
    }
}
