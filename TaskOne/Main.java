package TaskOne;

public class Main {

    public static void main(String[] args) {

        int[][] arr = new int[9][9];
        int max = 0;
        int min = 0;
        int sum = 0;

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                int count = (int) (Math.random() * 100);
                arr[i][j] = count;
            }
        }

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (max < arr[i][j]) max = arr[i][j];
            }
        }

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (min > arr[i][j]) min = arr[i][j];
            }
        }

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {

                sum += arr[i][j];
            }
        }

        int avg = sum / 100;


        System.out.println("Максимальное значение: " + max);
        System.out.println("Минимальное значение: " + min);
        System.out.println("Среднее значение: " + avg);
    }
}