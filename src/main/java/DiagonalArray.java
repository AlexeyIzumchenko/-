public class DiagonalArray {
    public static void main(String[] args) {
        int n = 5; // Размерность массива (количество строк и столбцов)
        int[][] array = new int[n][n]; // Создаем квадратный массив

        // Заполняем главную диагональ единицами
        for (int i = 0; i < n; i++) {
            array[i][i] = 1; // Устанавливаем значение 1 на главной диагонали
        }

        // Выводим массив
        printArray(array);
    }

    // Метод для вывода двумерного массива
    public static void printArray(int[][] array) {
        for (int[] row : array) {
            for (int num : row) {
                System.out.print(num + " ");
            }
            System.out.println(); // Переход на новую строку после каждой строки массива
        }
    }
}

