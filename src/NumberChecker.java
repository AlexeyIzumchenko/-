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

