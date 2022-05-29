public class Robot implements Skills {
    private String name;

    public Robot(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public void run(int length) {
        run(5000);
        if (length <= 5000) {
            System.out.println("Робот пробежал: " + length + " метров.");
        } else {
            System.out.println("Робот столько не пробежит!!!");
        }
    }

    @Override
    public void jump(int length) {
        jump(1);
        if (length <= 1) {
            System.out.println("Робот прыгнул на: " + length + " метров.");
        } else {
            System.out.println("Робот не может прыгнуть на такую высоту!!!");
        }
    }
}
