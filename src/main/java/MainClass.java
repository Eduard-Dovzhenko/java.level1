public class MainClass {
    public static void main(String[] args) {
        Cat[] cat = new Cat[5];
        cat[0] = new Cat("Barsik", 15);
        cat[1] = new Cat("Vantuz", 12);
        cat[2] = new Cat("Kotzila", 10);
        cat[3] = new Cat("Timofei", 17);
        cat[4] = new Cat("Murzik", 19);
        Plate plate = new Plate(100);
        plate.info();
        for (int i = 0; i < cat.length; i++) {
            cat[i].eat(plate);
        }plate.info();
    }
}
