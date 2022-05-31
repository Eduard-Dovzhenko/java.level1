public class Wall implements Obstacle {
    private int height;

    public Wall(int height) {
        this.height = height;
    }

    @Override
    public void overCome(Participant participant) {
        participant.jump(this);
    }

    public int getHeight() {
        return height;
    }

    @Override
    public String toString() {
        return "Стена высотой " + height + " метров.";
    }
}
