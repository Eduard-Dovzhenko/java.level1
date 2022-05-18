public class Cat {
    private String name;
    private int appetite;
    private boolean satiety;

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
        this.satiety = true;
    }

    public void eat(Plate p) {
        if (satiety) {
            boolean hunger = p.decreaseFood(appetite);
            if (hunger) satiety = false;
            else satiety = true;
        } else
            System.out.println(name + " сытый");

    }
}
