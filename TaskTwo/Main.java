package TaskTwo;

public class Main {

    public static void main(String[] args) {

        int[] arr = {5, 6, 3, 2, 5, 1, 4, 9};

        for (int i = 0; i < arr.length; i++) {
            int min = arr[i];
            int count = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < min) {
                    min = arr[j];
                    count = j;
                }
            }
            if (i != count) {
                int tmp = arr[i];
                arr[i] = arr[count];
                arr[count] = tmp;
            }
        }
    }
}
