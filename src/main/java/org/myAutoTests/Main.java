package org.myAutoTests;

public class Main {
    public static void main(String[] args) {
        hello("Bogdan!");
        hello("Anna!");
        double len = 5;
        System.out.println("Площадь квадртата: " + area(len));

        double a = 4;
        double b = 6;
        System.out.println("Площадь прямоугольника: " + area(a,b));

    }

    public static void hello(String user) {

        System.out.println("Hello world!!!" + user);
    }

    public static double area(double l){
        return l * l;
    }

    public static double area(double a, double b) {
        return a * b;
    }
}