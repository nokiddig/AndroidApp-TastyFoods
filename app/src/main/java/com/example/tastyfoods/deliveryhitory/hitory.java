package com.example.tastyfoods.deliveryhitory;

import java.sql.Date;

public class hitory {
    private String name;
    private int count, totals;
    private Date date;

    public hitory(String name , int count,int  totals, Date date) {
        this.name = name;
        this.count = count;
        this.totals =totals;
        this.date = date;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getTotals() {
        return totals;
    }

    public void setTotals(int totals) {
        this.totals = totals;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
