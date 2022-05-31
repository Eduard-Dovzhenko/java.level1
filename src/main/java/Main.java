public class Main {
    public static void main(String[] args) {

        Participant[] participants = {
                new Cat("Пушок", 200, 7),
                new Robot("Робокоп", 1000, 1),
                new Human("Николай", 500, 2),
                new Human("Иван", 800, 3),
                new Cat("Барсик",250,5)
        };
        Obstacle[] obstacles ={
                new Treadmill(250),
                new Wall(3),
                new Treadmill(510)
        };
        for (Obstacle obstacle : obstacles) {
            for (Participant participant : participants) {
                obstacle.overCome(participant);
            }
        }
        System.out.println(" Финишировал !!! ");
        for (Participant participant : participants) {
            if (participant.isPlay()){
                System.out.println(participant);
            }
            
        }
    }
}
