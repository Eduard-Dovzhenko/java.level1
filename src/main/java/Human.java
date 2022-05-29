public class Human implements Skills {

    private String name;

    public Human(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public void run(int length) {
        run(1000);
        if (length <= 1000) {
            System.out.println("Человек пробежал: " + length + " метров.");
        } else {
            System.out.println("Человек столько не пробежит!!!");
        }

    }

    @Override
    public void jump(int length) {
        jump(2);
        if (length <= 2) {
            System.out.println("Человек прыгнул на: " + length + " метров.");
        } else {
            System.out.println("Человек не может прыгнуть на такую высоту!!!");
        }
    }

}
