package com.multiplatfrom;

public class Shoe {
    private String dimension;
    private String height;
    private String high;
    private String model;

    public Shoe(String dimension, String height, String high, String model) {
        this.dimension = dimension;
        this.height = height;
        this.high = high;
        this.model = model;
    }

    public void shoeIsShoe(){
        System.out.println("Shoe is beautiful...");
    }

    public String getDimension() {
        return dimension;
    }

    public String getHeight() {
        return height;
    }

    public String getHigh() {
        return high;
    }

    public String getModel() {
        return model;
    }
}

