package com.gmail.muha.task4;


public class Main {
    public static void main(String[] args) {
        //Заданы координаты трех вершин треугольника (х1 у2),(х2, у2) ),(х3, у3). Найти его периметр и площадь.

        printPerimeterAndAreaTriangle(0, 4, 0, 0, 3, 0);
    }

    public static void printPerimeterAndAreaTriangle(double x1, double y1, double x2, double y2, double x3, double y3) {

        double sideA = getLengthSide(x1, y1, x2, y2);
        double sideB = getLengthSide(x1, y1, x3, y3);
        double sideC = getLengthSide(x2, y2, x3, y3);

        double perimeter = sideA + sideB + sideC;
        double semiPerimeter = perimeter / 2;

        double area;
        area = Math.sqrt(semiPerimeter * (semiPerimeter - sideA) * (semiPerimeter - sideB) * (semiPerimeter - sideC));

        System.out.println("Периметр заданного треугольника - " + perimeter + ", его площадь - " + area);
    }

    public static double getLengthSide(double x1, double y1, double x2, double y2) {

        double legX = Math.abs(x1 - x2);
        double legY = Math.abs(y1 - y2);
        return Math.sqrt(legX * legX + legY * legY);
    }
}
