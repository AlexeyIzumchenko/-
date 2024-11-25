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

