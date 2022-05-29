public class Cat implements Skills {
    private String name;

    public Cat(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public void run(int length) {
        run(500);
        if (length <= 500) {
            System.out.println("Кот пробежал: " + length + " метров.");
        } else {
            System.out.println("Кот столько не пробежит!!!");
        }
    }

    @Override
    public void jump(int length) {
        jump(5);
        if (length <= 5) {
            System.out.println("Кот прыгнул на: " + length + " метров.");
        } else {
            System.out.println("Кот не может прыгнуть на такую высоту!!!");
        }
    }
}
