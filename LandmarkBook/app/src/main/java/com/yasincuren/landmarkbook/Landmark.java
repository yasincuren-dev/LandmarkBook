package com.yasincuren.landmarkbook;

import java.io.Serializable;

public class Landmark implements Serializable { //Serializable implement yaptığımızda MainActivity kısmında intent.putExtra'da bir sorun olmucak.

    String name;
    String country;
    int image;

    public Landmark(String name,String country,int image){
        this.name = name;
        this.country = country;
        this.image = image;
    }
}