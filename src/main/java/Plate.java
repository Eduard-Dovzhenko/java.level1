public class Plate {
    private int food;

    public Plate(int food) {
        this.food = food;
    }

    public boolean decreaseFood(int n) {
        if ((food - n) < 0) {
            System.out.println("В миске не достаточно еды, кот остался голодным !!!");
            return false;
        } else {
            food -= n;
            System.out.println("Кот съел " + n + " грамм, в миске осталось " + food + " грамм");
            return true;
        }
    }

    public void info() {
        System.out.println("В миске: " + food + " грамм");
    }
    void addFood(int food) {
        this.food += food;
        System.out.println("Добавил в миску корм");
    }

}
