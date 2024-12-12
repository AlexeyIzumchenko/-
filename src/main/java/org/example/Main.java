public class Main {
    public class printThreeWords {
        public static void main(String[] args) {


            System.out.printf("Orange\nBanana\nApple");


        }
    }
    public class ArrayInitializer {
        public static void main(String[] args) {
            int len = 5; // Длина массива
            int initialValue = 10; // Начальное значение для каждой ячейки

            int[] array = createArray(len, initialValue); // Создаем массив

            // Выводим массив
            printArray(array);
        }

        // Метод для создания массива
        public static int[] createArray(int len, int initialValue) {
            int[] array = new int[len]; // Создаем массив заданной длины

            // Заполняем массив значением initialValue
            for (int i = 0; i < len; i++) {
                array[i] = initialValue;
            }

            return array; // Возвращаем заполненный массив
        }

        // Метод для вывода одномерного массива
        public static void printArray(int[] array) {
            for (int num : array) {
                System.out.print(num + " ");
            }
            System.out.println(); // Переход на новую строку после вывода массива
        }
    }

    public class checkSumSign {
        public static void main(String[] args) {
            int a=0;
            int b=1;

            if (a+b>=0) {
                System.out.printf("Сумма положительная");
            }
            else {
                System.out.printf("Сумма отрицательная");
            }
        }
    }

    public class compareBetween {
        public static boolean isSumInRange(int a, int b) {
            int sum = a + b;
            return sum >= 10 && sum <= 20;
        }

        public static void main(String[] args) {
            // Примеры использования метода
            System.out.println(isSumInRange(5, 5)); // true
            System.out.println(isSumInRange(10, 5)); // true
            System.out.println(isSumInRange(15, 10)); // false
            System.out.println(isSumInRange(0, 9)); // false
        }
    }

    public class compareNumbers {
        public static void main(String[] args) {
            int a=1;
            int b=2;

            if (a>=b){
                System.out.printf("a>=b");
            } else {
                System.out.printf("a<b");
            }
        }
    }

    public class DiagonalArray {
        public static void main(String[] args) {
            int n = 5; // Размерность массива (количество строк и столбцов)
            int[][] array = new int[n][n]; // Создаем квадратный массив

            // Заполняем главную диагональ единицами
            for (int i = 0; i < n; i++) {
                array[i][i] = 1; // Устанавливаем значение 1 на главной диагонали
            }

            // Выводим массив
            printArray(array);
        }

        // Метод для вывода двумерного массива
        public static void printArray(int[][] array) {
            for (int[] row : array) {
                for (int num : row) {
                    System.out.print(num + " ");
                }
                System.out.println(); // Переход на новую строку после каждой строки массива
            }
        }
    }

    public class FillArray {
        public static void main(String[] args) {
            // Создаем пустой массив длиной 100
            int[] array = new int[100];

            // Заполняем массив значениями от 1 до 100
            for (int i = 0; i < array.length; i++) {
                array[i] = i + 1; // Заполняем массив значениями от 1 до 100
            }

            // Выводим заполненный массив
            System.out.print("Заполненный массив: ");
            printArray(array);
        }

        // Метод для вывода массива
        public static void printArray(int[] array) {
            for (int num : array) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }

    public class InvertArray {
        public static void main(String[] args) {
            // Инициализируем массив с элементами 0 и 1
            int[] array = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};

            // Выводим исходный массив
            System.out.print("Исходный массив: ");
            printArray(array);

            // Заменяем 0 на 1 и 1 на 0
            for (int i = 0; i < array.length; i++) {
                if (array[i] == 0) {
                    array[i] = 1;
                } else {
                    array[i] = 0;
                }
            }

            // Выводим измененный массив
            System.out.print("Измененный массив: ");
            printArray(array);
        }

        // Метод для вывода массива
        public static void printArray(int[] array) {
            for (int num : array) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }

    public class LeapYearChecker {
        public static boolean isLeapYear(int year) {
            // Проверяем условия для високосного года
            if (year % 4 == 0) {
                if (year % 100 == 0) {
                    // Если год делится на 100, проверяем делимость на 400
                    return year % 400 == 0;
                }
                return true; // Год делится на 4, но не на 100
            }
            return false; // Год не делится на 4
        }

        public static void main(String[] args) {
            // Примеры использования метода
            System.out.println(isLeapYear(2020)); // true
            System.out.println(isLeapYear(1900)); // false
            System.out.println(isLeapYear(2000)); // true
            System.out.println(isLeapYear(2023)); // false
        }
    }

    public class ModifyArray {
        public static void main(String[] args) {
            // Исходный массив
            int[] array = {1, 5, 3, 2, 11, 4, 5, 2, 5, 8, 9, 1};

            // Проходим по массиву и умножаем числа меньше 6 на 2
            for (int i = 0; i < array.length; i++) {
                if (array[i] < 6) {
                    array[i] *= 2; // Умножаем на 2
                }
            }

            // Выводим измененный массив
            System.out.print("Измененный массив: ");
            printArray(array);
        }

        // Метод для вывода массива
        public static void printArray(int[] array) {
            for (int num : array) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }

    public class NumberChecker {
        public static void checkNumber(int number) {
            if (number >= 0) {
                System.out.println(number + " — положительное число.");
            } else {
                System.out.println(number + " — отрицательное число.");
            }
        }

        public static void main(String[] args) {
            // Примеры использования метода
            checkNumber(5);   // Положительное число
            checkNumber(-3);  // Отрицательное число
            checkNumber(0);   // Положительное число
        }
    }

    public class NumberChecker2 {
        public static boolean isNegative(int number) {
            return number < 0; // Возвращает true, если число отрицательное
        }

        public static void main(String[] args) {
            // Примеры использования метода
            System.out.println(isNegative(-5));  // true
            System.out.println(isNegative(3));   // false
            System.out.println(isNegative(0));   // false
        }
    }

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

    public class StringPrinter {
        public static void printStringMultipleTimes(String str, int times) {
            for (int i = 0; i < times; i++) {
                System.out.println(str); // Печатает строку
            }
        }

        public static void main(String[] args) {
            // Пример использования метода
            printStringMultipleTimes("Hello, World!", 5); // Печатает строку 5 раз
        }
    }

}
