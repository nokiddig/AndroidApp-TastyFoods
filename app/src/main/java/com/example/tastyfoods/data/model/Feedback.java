package com.example.tastyfoods.data.model;

public class Feedback {
    private  String Id, content;
    private double ratePoint;

    public String getId() {
        return Id;
    }

    public void setId(String id) {
        Id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public double getRatePoint() {
        return ratePoint;
    }

    public void setRatePoint(double ratePoint) {
        this.ratePoint = ratePoint;
    }

    public Feedback(String id, String content, double ratePoint) {
        Id = id;
        this.content = content;
        this.ratePoint = ratePoint;
    }
}
