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
