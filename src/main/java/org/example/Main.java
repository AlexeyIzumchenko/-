public class Main {
    public class Park {
        private String name; // название парка
        private Attraction[] attractions; // массив аттракционов
        private int attractionCount; // текущее количество аттракционов

        // Конструктор для инициализации парка
        public Park(String name, int maxAttractions) {
            this.name = name;
            this.attractions = new Attraction[maxAttractions];
            this.attractionCount = 0;
        }

        // Метод для добавления аттракциона
        public void addAttraction(String name, String workingHours, double price) {
            if (attractionCount < attractions.length) {
                attractions[attractionCount++] = new Attraction(name, workingHours, price);
            } else {
                System.out.println("Достигнуто максимальное количество аттракционов в парке.");
            }
        }

        // Метод для вывода информации об аттракционах
        public void displayAttractions() {
            System.out.println("Аттракционы в парке " + name + ":");
            for (int i = 0; i < attractionCount; i++) {
                attractions[i].displayInfo();
            }
        }

        // Внутренний класс Attraction
        private class Attraction {
            private String name; // название аттракциона
            private String workingHours; // время работы аттракциона
            private double price; // стоимость аттракциона

            // Конструктор для инициализации аттракциона
            public Attraction(String name, String workingHours, double price) {
                this.name = name;
                this.workingHours = workingHours;
                this.price = price;
            }

            // Метод для вывода информации об аттракционе
            public void displayInfo() {
                System.out.println("Название: " + name);
                System.out.println("Время работы: " + workingHours);
                System.out.println("Стоимость: " + price + " руб.");
                System.out.println(); // Пустая строка для удобства чтения
            }
        }

        // Пример использования класса Park
//        public static void main(String[] args) {
//            Park amusementPark = new Park("Веселый парк", 5);
//
//            amusementPark.addAttraction("Американские горки", "10:00 - 22:00", 300);
//            amusementPark.addAttraction("Колесо обозрения", "09:00 - 21:00", 200);
//            amusementPark.addAttraction("Поездка на поезде", "11:00 - 20:00", 150);
//            amusementPark.addAttraction("Прыжки с парашютом", "12:00 - 18:00", 500);
//            amusementPark.addAttraction("Водные горки", "10:00 - 19:00", 350);
//
//            amusementPark.displayAttractions();
//        }
    }

    public class printColor {
        public static void main(String[] args) {
            int value= 1;
            if (value<=0){
                System.out.printf("Красный");
            } else if (100>=value || value>0) {
                System.out.printf("Желтый");
            } else if (value>100) {
                System.out.printf("Зеленый");
            }
        }
    }

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
//        public static void main(String[] args) {
//            // Объявляем массив объектов Employee
//            Employee[]empArray = new_Employee[5];
//
//            // Заполняем массив объектами Employee
//            empArray[0] = new.Employee("Иванов Иван", "Инженер", "ivivan@mailbox.com", "892312312", 30000, 30);
//            empArray[1] = new.Employee("Петров Петр", "Менеджер", "petrov@mailbox.com", "892312313", 40000, 35);
//            empArray[2] = new.Employee("Сидоров Сидор", "Дизайнер", "sidorov@mailbox.com", "892312314", 45000, 28);
//            empArray[3] = new.Employee("Кузнецов Николай", "Разработчик", "kuznetsov@mailbox.com", "892312315", 60000, 25);
//            empArray[4] = new.Employee("Семенова Анна", "Аналитик", "semenova@mailbox.com", "892312316", 50000, 32);
//
//            // Выводим информацию о каждом сотруднике
//            for (Employee.emp : empArray) {
//                emp.displayInfo();
//            }
//
//            employee1.displayInfo();
//        }
    }

}
