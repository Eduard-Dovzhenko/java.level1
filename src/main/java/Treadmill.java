public class Treadmill extends Obstacles {
    private int dist;

    public Treadmill(int dist) {
        this.dist = dist;
    }

    public int getDist() {
        return dist;
    }

    public void setDist(int dist) {
        this.dist = dist;
    }

    public boolean isOvercome(int distanceOfRun) {
        return distanceOfRun > dist;
    }

    @Override
    public void info(int distanceOfRun) {
        if (distanceOfRun > dist) {
            System.out.println("Пробежал дистанцию.");
        } else {
            System.out.println("Не смог пробежать дистанцию.");
        }
    }
}
