package com.example.designpatterns.behavioural.command.cartexample;

import com.example.designpatterns.behavioural.command.cartexample.data.FoodMenuData;
import com.example.designpatterns.behavioural.command.cartexample.model.FoodMenu;

public class FoodMenuService {
    private FoodMenuData foodMenuData;


    public FoodMenuService(FoodMenuData foodMenuData) {
        this.foodMenuData = foodMenuData;
    }

    public FoodMenu getMenuById(final String menuId) {
        if (!foodMenuData.getFoodMenuById().containsKey(menuId)) {
            throw new FoodDeliveryException("Food Menu not exists");
        }
        return foodMenuData.getFoodMenuById().get(menuId);
    }

    public FoodMenu getMenuByRestaurantId(final String restaurantId) {
        if (!foodMenuData.getFoodMenuIdByRestaurantId().containsKey(restaurantId)) {
            throw new FoodDeliveryException("No Data");
        }
        return getMenuById(foodMenuData.getFoodMenuIdByRestaurantId().get(restaurantId));
    }
}