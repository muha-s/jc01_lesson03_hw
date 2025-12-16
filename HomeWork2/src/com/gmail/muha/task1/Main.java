package com.gmail.muha.task1;

public class Main {
    public static void main(String[] args) {

        double angleOne = 30.0;
        double angleTwo = 2.0;
        solveFormula(angleOne, angleTwo);
    }

    public static void solveFormula(double angleOne, double angleTwo) {

        double angleOneInRadians = Math.toRadians(angleOne);
        double angleTwoInRadians = Math.toRadians(angleTwo);
        double angleProductInRadians = Math.toRadians(angleOne * angleTwo);

        double result = (Math.sin(angleOneInRadians) + Math.cos(angleTwoInRadians)) /
                (Math.cos(angleOneInRadians) - Math.sin(angleTwoInRadians)) *
                Math.tan(angleProductInRadians);

        System.out.println("Результат - " + result);
    }
}