package org.example;

import static org.example.MyMath.arccotangent;
import static org.example.MyMath.cotangent;

public class Main {
    public static void main(String[] args) {
        double angleInRadians = Math.PI / 4; // Угол в радианах
        double cotangentValue = cotangent(angleInRadians);
        double arccotangentValue = arccotangent(2.0);
        int startRange = 1;
        int endRange = 20;

        System.out.println("Котангенс угла " + angleInRadians + ": " + cotangentValue);
        System.out.println("Арккотангенс угла: " + arccotangentValue);
        printPrimesInRange(startRange, endRange);
    }

    private static void printPrimesInRange(int startRange, int endRange) {
    }
}