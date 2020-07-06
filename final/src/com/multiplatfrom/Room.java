package com.multiplatfrom;

public class Room {
    private Clothes theClothes;
    private Shoe theShoe;
    private Charger theCharger;
    private Bed theBed;

    public Room(Clothes theClothes, Shoe theShoe, Charger theCharger, Bed theBed) {
        this.theClothes = theClothes;
        this.theShoe = theShoe;
        this.theCharger = theCharger;
        this.theBed = theBed;
    }
    public void aboutRoom(String roomName){
        getTheBed().bedIsBed();
        getTheClothes().clothesIsClothes();
        getTheShoe().shoeIsShoe();
        getTheCharger().chargerIsCharger();
    }

    public Clothes getTheClothes() {
        return theClothes;
    }

    public Shoe getTheShoe() {
        return theShoe;
    }

    public Bed getTheBed() {
        return theBed;
    }

    public Charger getTheCharger() {
        return theCharger;
    }
}
