package Lesson_4;

public class Employee {
    private String FIO;
    private String position;
    private String email;
    private String phone;
    private double salary;
    private int age;

    public Employee(String FIO, String position, String email, String phone, double salary, int age) {
        this.FIO = FIO;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }

    public void printInfo() {
        System.out.println("ФИО: " + FIO);
        System.out.println("Должность: " + position);
        System.out.println("Email: " + email);
        System.out.println("Телефон: " + phone);
        System.out.println("Зарплата: " + salary);
        System.out.println("Возраст: " + age);
    }

    public static void main(String[] args) {
        Employee employee = new Employee("Суворова Дарья Андреена", "Стажер", "suvorova@mail.com", "+79261234567", 10000, 29);
        employee.printInfo();
        System.out.println("--------------------------");
        Employee[] employeeArray = new Employee[5];
        employeeArray[0] = new Employee("Андреев Андрей Андреевич", "Аналитик", "andreev@mail.com", "+79251234567", 90000, 33);
        employeeArray[1] = new Employee("Иванов Иван Иванович", "Дизайнер", "ivanov@mail.com", "+79851234567", 80000, 38);
        employeeArray[2] = new Employee("Петров Петр Петрович", "Разработчик", "petrov@mail.com", "+79857654321", 100000, 44);
        employeeArray[3] = new Employee("Романов Роман Романович", "Тестировщик", "romanov@mail.com", "+79257654321", 70000, 28);
        employeeArray[4] = new Employee("Суворов Никита Евгеньевич", "Директор", "suvorov@mail.com", "+79267654321", 1000000, 5);
        for (Employee employee1 : employeeArray) {
            employee1.printInfo();
        }
    }
}
