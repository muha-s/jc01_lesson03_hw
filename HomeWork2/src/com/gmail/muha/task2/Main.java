package com.gmail.muha.task2;

public class Main {
    public static void main(String[] args) {
        //Вычислить периметр и площадь прямоугольного треугольника по длинам а и b двух катетов.

        printPerimeterAndArea(2.0, 3.0);
    }

    static void printPerimeterAndArea(double sideA, double sideB) {

        double perimeter = Math.sqrt(sideA * sideA + sideB * sideB) + sideA + sideB;
        double area = sideA * sideB / 2;
        System.out.println("Периметр - " + perimeter + ", площадь - " + area);
    }
}
