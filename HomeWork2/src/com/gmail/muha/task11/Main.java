package com.gmail.muha.task11;

public class Main {
    public static void main(String[] args) {
        //Известна длина окружности. Найти площадь круга, ограниченного этой окружностью.
        printArea(10);
    }

    public static void printArea(double circumference){

        double area = circumference * circumference / (4 * Math.PI);

        System.out.println("Площадь круга равна - " + area);
    }
}
