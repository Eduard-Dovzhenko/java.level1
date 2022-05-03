public class Dog extends Animals {
    public Dog(String name, int run, int swimming) {
        super(name, run, swimming);
    }

    @Override
    public void setRun(int run) {
        super.setRun(run);
        if (run <= 500) {
            System.out.println("Бобик пробежал: " + run + " метров.");
        } else {
            System.out.println("Бобик столько не пробежит!!!");
        }
    }

    @Override
    public void setSwimming(int swimming) {
        super.setSwimming(swimming);
        if (swimming <= 10) {
            System.out.println("Бобик проплыл: " + swimming + " метров.");
        } else {
            System.out.println("Бобик столько не проплывёт!!!");
        }
    }
}
