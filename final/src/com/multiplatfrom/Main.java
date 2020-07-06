package com.multiplatfrom;

public class Main {

    public static void main(String[] args) {

        Clothes brand = new Clothes("dimensi", "cv", "asdf", "toshiba");
        Shoe supreme = new Shoe("high", "sdf", "dff", "sofa");
        Charger Laptop = new Charger("high", "sfsg", "dfdf", "guling");
        Bed my = new Bed("king", "fdga", "sgssh", "zxcv");

        Room myDreamRoom = new Room(brand, supreme, Laptop, my);
        myDreamRoom.aboutRoom("Tampi's Room");
    }
}
