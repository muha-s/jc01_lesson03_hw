package com.gmail.muha.task3;

public class Main {
    public static void main(String[] args) {

        //Вычислить расстояние между двумя точками с данными координатами (х1, у1)и (x2, у2).
        printDistance(-4, 6, 2, -4);
    }

    public static void printDistance(double x1, double y1, double x2, double y2) {

        double legX = Math.abs(x1 - x2);
        double legY = Math.abs(y1 - y2);
        double distance = Math.sqrt(legX * legX + legY * legY);

        System.out.println("Расстояние между точкой (" + x1 + "; " + y1 + ") и точкой (" + x2 + "; " + y2 + ") равна" +
                " - " + distance);
    }
}
