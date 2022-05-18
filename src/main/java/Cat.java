public class Cat {
    private final String name;
    private final int appetite;
    private boolean satiety;

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
        this.satiety = true;
    }

    public void eat(Plate p) {
        if (satiety) {
            boolean hunger = p.decreaseFood(appetite);
            satiety = !hunger;
        } else
            System.out.println(name + " сытый");

    }
}
