public class Cat extends Animals {
    public Cat(String name, int run, int swimming) {
        super(name, run, swimming);
    }

    @Override
    public void setRun(int run) {
        super.setRun(run);
        if (run <= 200) {
            System.out.println("Мурзик пробежал: " + run + " метров.");
        } else {
            System.out.println("Мурзик столько не пробежит!!!");
        }
    }

    @Override
    public void setSwimming(int swimming) {
        super.setSwimming(swimming);
        if (swimming >= 0) {
            System.out.println("Мурзик плавать не умеет!");
        }
    }
}

