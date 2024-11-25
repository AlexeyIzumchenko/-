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

