public class printColor {
    public static void main(String[] args) {
        int value= 1;
        if (value<=0){
            System.out.printf("Красный");
        } else if (100>=value || value>0) {
            System.out.printf("Желтый");
        } else if (value>100) {
            System.out.printf("Зеленый");
        }
    }
}
