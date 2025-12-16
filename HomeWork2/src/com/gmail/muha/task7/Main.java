package com.gmail.muha.task7;

public class Main {
    public static void main(String[] args) {
        //Найти произведение цифр заданного четырехзначного числа.

        printProductOfDigits(4864);
    }

    public static void printProductOfDigits(int fourDigitNumber){

        int digitOne = fourDigitNumber / 1000;
        int digitTwo = (fourDigitNumber - digitOne * 1000) / 100;
        int digiThree = (fourDigitNumber - digitOne * 1000 - digitTwo * 100) / 10;
        int digitFour = fourDigitNumber - digitOne * 1000 - digitTwo * 100 - digiThree * 10;
        int productOfDigits = digitOne * digitTwo * digiThree * digitFour;

        System.out.println("Произведение цифр числа " + fourDigitNumber + " ровняется - " + productOfDigits);
    }
}
