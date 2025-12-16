package com.gmail.muha.task8;

public class main {
    public static void main(String[] args) {
        //Даны два числа. Найти среднее арифметическое кубов этих чисел и среднее геометрическое модулей этих
        //чисел.

        printResult(2, 3);

    }

    public static void printResult(double x, double y) {

        double arithmeticMeanOfCubesOfNumbers = (Math.pow(x, 3) + Math.pow(y, 3)) / 2;

        double moduleX = Math.abs(x);
        double moduleY = Math.abs(y);

        double geometricMeanOfModulesNumbers = Math.sqrt(moduleX * moduleY);

        System.out.println("Среднее арифметическое кубов - " + arithmeticMeanOfCubesOfNumbers);
        System.out.println("Среднее геометрическое модулей - " + geometricMeanOfModulesNumbers);
    }
}
