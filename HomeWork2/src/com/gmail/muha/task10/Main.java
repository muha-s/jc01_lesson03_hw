package com.gmail.muha.task10;

public class Main {
    public static void main(String[] args) {
        //Дана сторона равностороннего треугольника. Найти площадь этого треугольника, его высоту, радиусы
        //вписанной и описанной окружностей.
        printTriangleData(4.0);
    }

    public static void printTriangleData(double sideTriangle) {

        double height = sideTriangle * Math.sqrt(3) / 2;
        double area = sideTriangle * sideTriangle * Math.sqrt(3) / 4;
        double radiusOfInscribedCircle = sideTriangle * Math.sqrt(3) / 6;
        double radiusOfCircumscribedCircle = sideTriangle * Math.sqrt(3) / 3;

        System.out.println("Площадь треугольника - " + area);
        System.out.println("Высота треугольника - " + height);
        System.out.println("Радиус вписанной окружности - " + radiusOfInscribedCircle);
        System.out.println("Радиус описанной окружности- " + radiusOfCircumscribedCircle);
    }
}
