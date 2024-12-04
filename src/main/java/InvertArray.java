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
