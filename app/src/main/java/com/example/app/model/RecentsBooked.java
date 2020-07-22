package com.example.app.model;

public class RecentsBooked {

    String placeName;
    String foodtypes;
    String price;
    Integer imageUrl;

    public Integer getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(Integer imageUrl) {
        this.imageUrl = imageUrl;
    }

    public RecentsBooked(String placeName, String foodtypes, String price, Integer imageUrl) {
        this.placeName = placeName;
        this.foodtypes = foodtypes;
        this.price = price;
        this.imageUrl = imageUrl;
    }

    public String getPlaceName() {
        return placeName;
    }

    public void setPlaceName(String placeName) {
        this.placeName = placeName;
    }

    public String getFoodtypes() {
        return foodtypes;
    }

    public void setFoodtypes(String foodtypes) {
        this.foodtypes = foodtypes;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }
}
