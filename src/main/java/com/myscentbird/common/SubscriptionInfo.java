package com.myscentbird.common;

public class SubscriptionInfo {
    private String name;
    private String email;
    private String message;
    private String gender;
    private int sizeOfGift;
    private String price;
    private boolean active;

    public SubscriptionInfo(int sizeOfGift, String price, String gender, String name, String email, String message) {
        this.name = name;
        this.email = email;
        this.message = message;
        this.sizeOfGift = sizeOfGift;
        this.price = price;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getMessage() {
        return message;
    }

    public int getSizeOfGift() {
        return sizeOfGift;
    }

    public String getGender() {
        return gender;
    }

    public String getPrice() {
        return price;
    }
}
