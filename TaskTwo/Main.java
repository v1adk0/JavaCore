package TaskTwo;

import java.util.Arrays;


public class Main {

    public static void main(String[] args) {
//        int[] testArr = {3, 4, 2, 7};
//        sumOf(testArr, 10);
    }

       static void sumOf(int[] arr, int sum) {
           if (arr == null) arr = new int[0];

           int[] res = new int[2];

           for (int i : arr) {
               for (int j = arr.length - 1; j > 0; j--) {
                   if ((i + arr[j] == sum)) {
                       res = new int[]{i, arr[j]};
                   }
               }
           }
           System.out.println(Arrays.toString(res));
       }
}
