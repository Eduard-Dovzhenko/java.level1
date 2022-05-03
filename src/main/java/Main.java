public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog("Бобик: ", 400, 5);
        dog.setRun(400);
        dog.setSwimming(5);
        System.out.println();
        Cat cat = new Cat("Мурзик: ",100,2);
        cat.setRun(100);
        cat.setSwimming(2);
        System.out.println();
    }
}
