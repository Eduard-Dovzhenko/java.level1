public interface Participant {
    boolean isPlay();
    void setPlay(boolean play);
    int getJumpMax();
    int getRunMax();
    default void jump(Wall wall){
        if (isPlay()) {
            if (getJumpMax() >= wall.getHeight()) {
                System.out.println(this + " успешно преодолел препятствие " + wall);
            } else {
                System.out.println(this + " не преодолел препятствие " + wall);
                setPlay(false);
            }
        }
    }

    default void run(Treadmill treadmill){
        if (isPlay()) {
            if (getRunMax() >= treadmill.getLength()) {
                System.out.println(this + " успешно преодолел препятствие " + treadmill);
            } else {
                System.out.println(this + " не преодолел препятствие " + treadmill);
                setPlay(false);
            }
        }
    }
}
