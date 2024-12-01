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
    public static void main(String[] args) {
        Park amusementPark = new Park("Веселый парк", 5);

        amusementPark.addAttraction("Американские горки", "10:00 - 22:00", 300);
        amusementPark.addAttraction("Колесо обозрения", "09:00 - 21:00", 200);
        amusementPark.addAttraction("Поездка на поезде", "11:00 - 20:00", 150);
        amusementPark.addAttraction("Прыжки с парашютом", "12:00 - 18:00", 500);
        amusementPark.addAttraction("Водные горки", "10:00 - 19:00", 350);

        amusementPark.displayAttractions();
    }
}
