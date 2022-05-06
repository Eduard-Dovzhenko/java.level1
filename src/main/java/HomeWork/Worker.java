package HomeWork;

public class Worker {
    public static void main(String[] args) {
        Employee worker = new Employee("Иванов Иван Иванович", "Начальник отдела", "a@a.com", 891255545,
                70056.50, 56);
        worker.print();

        Employee[] workerArray = new Employee[5];
        workerArray[0] = new Employee("Петров Петр Петрович", "Начальник ", "b@b.com", 891255534,
                60056.50, 46);
        workerArray[1] = new Employee("Комаров Виктор Анатольевич", "Слесарь", "с@c.com", 891245545,
                32456.80, 58);
        workerArray[2] = new Employee("Смирнов Борис Инакентиевич", "Наладчик", "d@d.com", 890658754,
                36666.30, 32);
        workerArray[3] = new Employee("Жабин Константин Романович", "Слесарь КИПиА", "e@e.com", 890545878,
                33000.47, 36);
        workerArray[4] = new Employee("Андронов Арсений Александрович", "Инженер", "f@f.com", 892835366,
                41550.63, 38);
        for (int i = 0; i < workerArray.length; i++) {
            if (workerArray[i].getAge() > 40) {
                workerArray[i].print();
            }
        }
    }
}