package com.example.tastyfoods.cartDetail;

import android.media.Image;

import java.sql.Date;

public class cartDetail {


    private String namefood, address;
    private Date date;
    private int count,price, fee, total, voucher;
    private Image imgFood;

    public cartDetail(String namefood, String address,int count,int price,int fee,int total,int voucher,Date date, Image imgFood ) {
        this.namefood= namefood;
        this.address=address;
        this.count=count;
        this.price=price;
        this.fee=fee;
        this.total=total;
        this.voucher=voucher;
        this.date=date;
        this.imgFood=imgFood;
    }

    public int getVoucher() {
        return voucher;
    }

    public void setVoucher(int voucher) {
        this.voucher = voucher;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getNamefood() {
        return namefood;
    }

    public void setNamefood(String namefood) {
        this.namefood = namefood;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getFee() {
        return fee;
    }

    public void setFee(int fee) {
        this.fee = fee;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public Image getImgFood() {
        return imgFood;
    }

    public void setImgFood(Image imgFood) {
        this.imgFood = imgFood;
    }


}
