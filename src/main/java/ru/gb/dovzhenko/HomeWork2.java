package ru.gb.dovzhenko;

public class HomeWork2 {
    public static void main(String[] args) {
        int a = 5, b = 7;
        summLimits2(a, b);
        positiveOrNegativeNumber();
        int d = 22;
        positiveOrNegativeNumber2(d);
        linePrinting();
        int e = 1990;
        leapYear(e);
    }

    public static boolean summLimits2(int a, int b) {
        return (a + b >= 10 && a + b <= 20);
    }

    public static void positiveOrNegativeNumber() {
        int a = 0;
        if (a % 2 == 0) {
            System.out.println("Число чётное");
        } else {
            System.out.println("Число нечётное");
        }
    }

    public static boolean positiveOrNegativeNumber2(int d) {
        if (d % 2 != 0) {
            return true;
        } else {
            return false;
        }
    }

    public static void linePrinting() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Число 15");

        }
    }

    public static boolean leapYear(int e) {
        if (e % 4 == 0) {
            return true;
        }
        else {
            return false;
        }
    }

}
