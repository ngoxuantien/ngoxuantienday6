package com.example.recyclerview;

import java.io.Serializable;

public class Contact implements Serializable {
    private String day, numberphone, adress;
    private int icon,mauchu;

    public Contact(String day, String numberphone, String adress, int icon, int mauchu) {
        this.day = day;
        this.numberphone = numberphone;
        this.adress = adress;
        this.icon = icon;
        this.mauchu = mauchu;
    }

    public Contact() {
    }

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public String getNumberphone() {
        return numberphone;
    }

    public void setNumberphone(String numberphone) {
        this.numberphone = numberphone;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public int getMauchu() {
        return mauchu;
    }

    public void setMauchu(int mauchu) {
        this.mauchu = mauchu;
    }

    public int getIcon() {
        return icon;
    }

    public void setIcon(int icon) {
        this.icon = icon;
    }



}