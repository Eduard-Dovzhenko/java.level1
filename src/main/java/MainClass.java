public class MainClass {
    public static void main(String[] args) {
        Cat[] cat = new Cat[5];
        cat[0] = new Cat("Barsik", 45);
        cat[1] = new Cat("Vantuz", 42);
        cat[2] = new Cat("Kotzila", 10);
        cat[3] = new Cat("Timofei", 17);
        cat[4] = new Cat("Murzik", 19);
        Plate plate = new Plate(100);
        plate.info();
        for (Cat value : cat) {
            value.eat(plate);
        }
        plate.addFood();
        plate.info();
        for (Cat value : cat) {
            value.eat(plate);
        }
        for (Cat value : cat) {
            value.eat(plate);
        }
        plate.info();
    }
}
