public class Cat implements Participant {
    private String name;
    private int runMax;
    private int jumpMax;
    private boolean play;


    public Cat(String name, int runMax, int jumpMax) {
        this.name = name;
        this.runMax = runMax;
        this.jumpMax = jumpMax;
        this.play = true;
    }

    @Override
    public boolean isPlay() {
        return play;
    }

    @Override
    public int getRunMax() {
        return runMax;
    }

    @Override
    public int getJumpMax() {
        return jumpMax;
    }

    @Override
    public void setPlay(boolean play) {
        this.play = play;
    }

    @Override
    public String toString() {
        return "Кот по имени " + name;
    }
}
