public class Wall extends Obstacles {
    private int height;

    public Wall(int height) {
        this.height = height;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public boolean isOvercome(int jumpHeight) {
        return jumpHeight > height;
    }

    @Override
    public void info(int jumpHeight) {
        if (jumpHeight > height) {
            System.out.println("Преодолел препятствие.");
        } else {
            System.out.println("Не смог преодолеть препятствие.");
        }
    }
}
