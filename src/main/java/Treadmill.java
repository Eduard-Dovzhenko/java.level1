public class Treadmill implements Obstacle {
    private int length;

    public Treadmill(int length) {
        this.length = length;
    }

    @Override
    public void overCome(Participant participant) {
        participant.run(this);
    }

    public int getLength() {
        return length;
    }

    @Override
    public String toString() {
        return "Беговая дорожка длиной " + length + " метров.";
    }
}
