public class Dog extends Animals {
    public Dog(String name, int run, int swimming) {
        super(name, run, swimming);
    }

    @Override
    public void setRun(int run) {
        if (run <= 500) {
            super.setRun(run);
        }else {
            System.out.println("Собака столько не пробежит!!!");
        }
    }

    @Override
    public void setSwimming(int swimming) {
        if (swimming <= 10) {
            super.setSwimming(swimming);
        }else {
            System.out.println("Собака столько не проплывёт!!!");
        }
    }
}
