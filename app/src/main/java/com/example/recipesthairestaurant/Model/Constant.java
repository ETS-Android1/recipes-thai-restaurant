package com.example.recipesthairestaurant.Model;

public class Constant {
    int image;
    String Title;
    String Ingredients;
    String Directions;

    public Constant(int image, String title, String ingredients, String directions) {
        this.image = image;
        Title = title;
        Ingredients = ingredients;
        Directions = directions;
    }

    public int getImage() {
        return image;
    }

    public String getTitle() {
        return Title;
    }

    public String getIngredients() {
        return Ingredients;
    }

    public String getDirections() {
        return Directions;
    }
}
