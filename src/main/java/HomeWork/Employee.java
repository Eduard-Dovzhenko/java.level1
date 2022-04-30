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
}
