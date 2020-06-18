package com.company;

class SimpleCalculator {
    //Field
    private double firstNumber, secondNumber;
    //method
    //01
    public double getFirstNumber (){
        return this.firstNumber;
    }
    //02
    public double getSecondNumber(){
        return this.secondNumber;
    }
    //03
    public double setFirstNumber(double firstNumber){
        this.firstNumber = firstNumber;
        return firstNumber;
    }
    //04
    public double setSecondNumber(double secondNumber){
        this.secondNumber = secondNumber;
        return secondNumber;
    }
    //05
    public double getAdditionResult(){
        double total1 = firstNumber + secondNumber;
        return total1;
    }
    //06
    public double getSubtractionResult(){
        double total2 = firstNumber - secondNumber;
        return total2;
    }
    //07
    public double getMultiplicationResult(){
        double total3 = firstNumber * secondNumber;
        return total3;
    }
    //08
    public double getDivisionResult(){
        if(secondNumber == 0){
            return 0;
        }
        else {
            double total4 = firstNumber / secondNumber;
            return total4;
        }
    }

    public static class Main {

        public static void main(String[] args) {
            // write your code here
            SimpleCalculator calci = new SimpleCalculator();
            calci.setFirstNumber(5.0);
            calci.setSecondNumber(4);
            System.out.println("Add = "+calci.getAdditionResult());
            System.out.println("Substrack = "+calci.getSubtractionResult());
            calci.setFirstNumber(5.25);
            calci.setSecondNumber(0);
            System.out.println("multi = "+calci.getMultiplicationResult());
            System.out.println("devide = "+calci.getDivisionResult());
        }
    }

}
