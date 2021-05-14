package com.example.recipesthairestaurant.Model;

public class Constant {
    int image;
    String title;
    String ingredients;
    String instructions;

    public Constant(int image, String title, String ingredients, String instructions) {
        this.image = image;
        this.title = title;
        this.ingredients = ingredients;
        this.instructions = instructions;
    }

    public int getImage() {
        return image;
    }

    public String getTitle() {
        return title;
    }

    public String getIngredients() {
        return ingredients;
    }

    public String getInstructions() {
        return instructions;
    }
}
