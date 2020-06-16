package com.multiplatform;

public class Main {

    public static void main(String[] args) {
        byte byteValue = 110;

        int intValue = 150;

        short shortValue = 120;


        long longTotal = 50000L + 10L * (byteValue + shortValue + intValue);
        System.out.println("longTotal = " + longTotal);
    }
}
