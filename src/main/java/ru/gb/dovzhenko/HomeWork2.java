package ru.gb.dovzhenko;

public class HomeWork2 {
    public static void main(String[] args) {
        summLimits();
    }

    public static void summLimits() {
        int a = 5, b = 7;
        if (a + b >= 10 && a + b <= 20) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}
