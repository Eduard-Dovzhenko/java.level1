package ru.gb.dovzhenko.HomeWork1;

public class HomeWorkApp {
    public static void main(String[] args) {
        printThreeWords();
        checkSumSign();
        printColor();
    }
    public static void printThreeWords(){
        System.out.println("Orange\nBanana\nApple");
    }
    public static void checkSumSign(){
        int a = 5 , b = 6 ;
        if ( a + b >= 0 ){
            System.out.println("Сумма положительная");
        }
        else {
            System.out.println("Сумма отрицательная");
        }
    }
    public static void printColor(){
        int value = 40;
        if (value <= 0){
            System.out.println("Красный");
        }
        else if (value > 0 && value <= 100){
            System.out.println("Жёлтый");
        }
        else if (value > 100 && value != 100){
            System.out.println("Зелёный");
        }
    }
}
