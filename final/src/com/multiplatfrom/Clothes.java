package com.multiplatfrom;

public class Clothes {
    private String dimension;
    private String height;
    private String high;
    private String model;

    public Clothes(String dimension, String height, String high, String model) {
        this.dimension = dimension;
        this.height = height;
        this.high = high;
        this.model = model;
    }

    public void clothesIsClothes(){
        System.out.println("Bed is beautiful...");
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

