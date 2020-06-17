package com.multiplatform;

public class Main {

    public static void main(String[] args){
        bark(true,1);
    }

    public static boolean bark(boolean barking, int hourOfDay){
        boolean result = false;
        if (hourOfDay < 0 || hourOfDay > 23){
            System.out.println("Since the hour off day parameter need to be in range 0-23");
            return false;
        }
        else if (hourOfDay >= 8 && hourOfDay <= 22){
            System.out.println("Should return false its not before 8");
            result = false;
        }

        else if (hourOfDay >= 1 || hourOfDay <=7 || hourOfDay >=23){
            if(barking == true){
                System.out.println("Show value");
                result = true;
            }
            else {
                System.out.println("Its not working");
                result = false;
            }
        }
        return result;
    }
}