package com.example.tastyfoods.data.model;

public class Category {
    private String name;
    private String image;
    private String description;

    private String categotyId;

    public Category(String name, String image, String description, String categotyId) {
        this.name = name;
        this.image = image;
        this.description = description;
        this.categotyId = categotyId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCategotyId() {
        return categotyId;
    }

    public void setCategotyId(String categotyId) {
        this.categotyId = categotyId;
    }
}
