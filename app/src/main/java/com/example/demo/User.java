package com.example.demo;

import com.google.firebase.database.IgnoreExtraProperties;

/**
 * Created by Ravi Tamada on 07/10/16.
 * www.androidhive.info
 */

@IgnoreExtraProperties
public class User {

    public String name;
    public String phone;
    public String address;
    public String location;
    public String Image;


    // Default constructor required for calls to
    // DataSnapshot.getValue(User.class)
    public User() {
    }

    public User(String name, String phone, String address, String location, String image) {
        this.name = name;
        this.phone = phone;
        this.address = address;
        this.location = location;
        Image = image;
    }
}
