public class Animals {
    private String name;
    private int run;
    private int swimming;

    public Animals(String name, int run, int swimming) {
        this.name = name;
        this.run = run;
        this.swimming = swimming;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRun() {
        return run;
    }

    public void setRun(int run) {
        this.run = run;
    }

    public int getSwimming() {
        return swimming;
    }

    public void setSwimming(int swimming) {
        this.swimming = swimming;
    }
}
