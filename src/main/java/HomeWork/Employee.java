package HomeWork;

public class Employee {
    private String fullName;
    private String position;
    private String email;
    private int phoneNumber;
    private double theSalary;
    private int age;

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public double getTheSalary() {
        return theSalary;
    }

    public void setTheSalary(double theSalary) {
        this.theSalary = theSalary;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age >= 0 && age < 150) {
            this.age = age;
        }
    }

    public Employee(String fullName, String position, String email, int phoneNumber, double theSalary, int age) {
        this.fullName = fullName;
        this.position = position;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.theSalary = theSalary;
        setAge(age);
    }

    public static void main(String[] args) {
        Employee worker = new Employee("Иванов Иван Иванович", "Начальник отдела", "a@a.com", 891255545,
                70056.50, 56);
        String info = "ФИО: " + worker.fullName + "\nДолжность: " + worker.position + "\nПочта: " + worker.email + "\nНомер телефона: "
                + worker.phoneNumber + "\nЗарплата: " + worker.theSalary + "\nВозраст: " + worker.age;
        System.out.println(info);
        System.out.println();

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
            if (workerArray[i].age > 40) {
                String info1 = "ФИО: " + workerArray[i].fullName + "\nДолжность: " + workerArray[i].position + "\nПочта: "
                        + workerArray[i].email + "\nНомер телефона: " + workerArray[i].phoneNumber + "\nЗарплата: " +
                        workerArray[i].theSalary + "\nВозраст: " + workerArray[i].age;
                System.out.println(info1);
                System.out.println();
            }


        }
    }
}
