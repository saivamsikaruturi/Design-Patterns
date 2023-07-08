package com.example.designpatterns.behavioural.command.cartexample.model;

public class MenuItem {
    public MenuItem(String id, String itemName, MealType mealType, double price) {
        this.id = id;
        this.itemName = itemName;
        this.mealType = mealType;
        this.price = price;
    }

    private String id;
    private String itemName;
    private MealType mealType;
    private double price;

    public String getId() {
        return id;
    }

    public String getItemName() {
        return itemName;
    }

    public MealType getMealType() {
        return mealType;
    }

    public double getPrice() {
        return price;
    }
}