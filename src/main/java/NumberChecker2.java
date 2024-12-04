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

