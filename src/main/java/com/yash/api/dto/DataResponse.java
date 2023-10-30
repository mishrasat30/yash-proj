package com.yash.api.dto;

public class DataResponse {
    private String DelPtnr;
    private String restaurant;
    private String item;
    private String price;

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    private String image;

    public String getDelPtnr() {
        return DelPtnr;
    }

    public void setDelPtnr(String delPtnr) {
        DelPtnr = delPtnr;
    }

    public String getRestaurant() {
        return restaurant;
    }

    public void setRestaurant(String restaurant) {
        this.restaurant = restaurant;
    }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }
}
