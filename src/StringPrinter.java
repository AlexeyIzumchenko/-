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
