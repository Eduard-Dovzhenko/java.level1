package ru.gb.dovzhenko;

public class HomeWork2 {
    public static void main(String[] args) {
        int a = 5, b = 7;
        summLimits2(a, b);
        positiveOrNegativeNumber();
        int d = 20;
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

}
