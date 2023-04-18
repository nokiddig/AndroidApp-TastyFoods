package com.example.tastyfoods.cartDetail;

import android.media.Image;

import androidx.databinding.BaseObservable;
import androidx.databinding.Bindable;


import com.example.tastyfoods.BR;

import java.sql.Date;

public class cartViewModel extends BaseObservable {
    private String namefood, address;
    private Date date;
    private int count,price, fee, total, voucher;
    private Image imgFood;
    @Bindable
    public String getNamefood() {
        return namefood;
    }

    public void setNamefood(String namefood) {
        this.namefood = namefood;
        notifyPropertyChanged(BR.namefood);

    }
    @Bindable
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
        notifyPropertyChanged(BR.address);
    }
    @Bindable
    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
        notifyPropertyChanged(BR.date);
    }
    @Bindable
    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
        notifyPropertyChanged(BR.count);
    }
    @Bindable
    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
        notifyPropertyChanged(BR.price);
    }
    @Bindable
    public int getFee() {
        return fee;
    }

    public void setFee(int fee) {
        this.fee = fee;
        notifyPropertyChanged(BR.fee);
    }
    @Bindable
    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
        notifyPropertyChanged(BR.total);
    }
    @Bindable
    public int getVoucher() {
        return voucher;
    }

    public void setVoucher(int voucher) {
        this.voucher = voucher;
        notifyPropertyChanged(BR.voucher);
    }
    @Bindable
    public Image getImgFood() {
        return imgFood;
    }

    public void setImgFood(Image imgFood) {
        this.imgFood = imgFood;
        notifyPropertyChanged(BR.imgFood);
    }
}
