package ru.gb.dovzhenko;

public class HomeWork2 {
    public static void main(String[] args) {
        int a = 5, b = 7;
        summLimits2(a, b);

        int f = 5;
        positiveOrNegativeNumber(f);

        int d = 22;
        positiveOrNegativeNumber2(d);

        String g = "acer";
        int h = 5;
        linePrinting(g, h);

        int e = 1900;
        leapYear(e);
    }

    public static boolean summLimits2(int a, int b) {
        return (a + b >= 10 && a + b <= 20);
    }

    public static void positiveOrNegativeNumber(int f) {
        if (f >= 0) {
            System.out.println("Число положительное");
        } else {
            System.out.println("Число отрицательное");
        }
    }

    public static boolean positiveOrNegativeNumber2(int d) {
        if (d >= 0) {
            return false;
        } else {
            return true;
        }
    }

    public static void linePrinting(String g, int h) {
        for (int i = 0; i < h; i++) {
            System.out.println(g);
        }
    }

    public static boolean leapYear(int e) {
        if (e % 100 == 0 && e % 400 == 0) {
            return true;
        } else {
            return false;
        }
    }

}
