public class Cat extends Animals {
    public Cat(String name, int run, int swimming) {
        super(name, run, swimming);
    }

    @Override
    public void setRun(int run) {
        if (run <= 200) {
            super.setRun(run);
        }else {
            System.out.println("Кот столько не пробежит!!!");
        }
    }

    @Override
    public void setSwimming(int swimming) {
            if (swimming <= 0) {
            super.setSwimming(swimming);
        } else {
            System.out.println("Кот столько не проплывёт!!!");
        }
    }
}

