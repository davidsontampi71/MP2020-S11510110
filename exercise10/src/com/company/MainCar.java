package com.company;

import java.util.Scanner;

public class MainCar {

    public static <Car> void main(String[] args) {

        Car car ;
        System.out.println("Functions of a Car: ");
        (new Car()).startEngine();
        (new Car()).accelerate();
        (new Car()).brake();
        System.out.println();

        Scanner scanner = new Scanner(System.in);
        System.out.println("1-Hyundai Avega\n2-Innova GT\n3-Honda Jazz");
        System.out.println("Enter your choice: ");
        int ch = scanner.nextInt();

        switch(ch) {

            case 1: car = new Hyundai("Avega", 4);
                System.out.println(car.getName() + " has " + car.getCylinders() + " cylinders.");
                car.startEngine();
                car.accelerate();
                car.brake();
                break;

            case 2: car = new Innova("GT", 2);
                System.out.println(car.getName() + " has " + car.getCylinders() + " cylinders.");
                car.startEngine();
                car.accelerate();
                car.brake();
                break;

            case 3: car = new Honda("Jazz", 6);
                System.out.println(car.getName() + " has " + car.getCylinders() + " cylinders.");
                car.startEngine();
                car.accelerate();
                car.brake();
                break;

            default:
                System.out.println("Enter Valid Choice.");

        }

    }

}
