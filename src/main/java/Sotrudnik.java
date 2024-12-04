public class Sotrudnik {
    private String fullName;
    private String position;
    private String email;
    private String phone;
    private double salary;
    private int age;

    // Конструктор для инициализации полей
    public Sotrudnik(String fullName, String position, String email, String phone, double salary, int age) {
        this.fullName = fullName;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }

    // Метод для вывода информации об объекте
    public void displayInfo() {
        System.out.println("ФИО: " + fullName);
        System.out.println("Должность: " + position);
        System.out.println("Email: " + email);
        System.out.println("Телефон: " + phone);
        System.out.println("Зарплата: " + salary);
        System.out.println("Возраст: " + age);
    }
// Задание 2
    // Пример использования класса
    public static void main(String[] args) {
        // Объявляем массив объектов Employee
        Employee[] empArray = new Employee[5];

        // Заполняем массив объектами Employee
        empArray[0] = new Employee("Иванов Иван", "Инженер", "ivivan@mailbox.com", "892312312", 30000, 30);
        empArray[1] = new Employee("Петров Петр", "Менеджер", "petrov@mailbox.com", "892312313", 40000, 35);
        empArray[2] = new Employee("Сидоров Сидор", "Дизайнер", "sidorov@mailbox.com", "892312314", 45000, 28);
        empArray[3] = new Employee("Кузнецов Николай", "Разработчик", "kuznetsov@mailbox.com", "892312315", 60000, 25);
        empArray[4] = new Employee("Семенова Анна", "Аналитик", "semenova@mailbox.com", "892312316", 50000, 32);

        // Выводим информацию о каждом сотруднике
        for (Employee emp : empArray) {
            emp.displayInfo();
        }

        employee1.displayInfo();
    }
}
