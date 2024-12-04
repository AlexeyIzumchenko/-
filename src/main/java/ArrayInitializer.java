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

