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

