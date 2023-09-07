package org.example;

public class MyMath {
    public static double cotangent(double angleInRadians) {
        return 1.0 / Math.tan(angleInRadians);
    }

    public static double arccotangent(double value) {
        return Math.atan(1.0 / value);
    }

    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void printPrimesInRange(int start, int end) {
        System.out.println("Простые числа в диапазоне от " + start + " до " + end + ":");
        for (int i = start; i <= end; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }
}
