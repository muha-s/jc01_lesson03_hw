package com.gmail.muha.task5;

public class Main {
    public static void main(String[] args) {
        //Вычислить длину окружности и площадь круга одного и того же заданного радиуса R.

        printCircumferenceAndAre(4);

    }

    public static void printCircumferenceAndAre(double radius) {

        double circumference = 2 * Math.PI * radius;
        double area = Math.PI * radius * radius;

        System.out.println("Длинна окружности - " + circumference + ", её площадь - " + area);
    }
}
