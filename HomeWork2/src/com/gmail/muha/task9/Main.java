package com.gmail.muha.task9;

public class Main {
    public static void main(String[] args) {
        //Дана длина ребра куба. Найти площадь грани, площадь полной поверхности и объем этого куба.

        printCubeData(4.0);
    }

    public static void printCubeData(double edgeCube) {

        double areaFace = edgeCube * edgeCube;
        double areaAllFace = areaFace * 6;
        double volume = Math.pow(edgeCube, 3);

        System.out.println("Площадь грани куба- " + areaFace);
        System.out.println("Площадь всей поверхности куба - " + areaAllFace);
        System.out.println("Объем куба - " + volume);
    }
}
