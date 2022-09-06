package TaskTwo;

import java.util.Arrays;

public class Main {

       static void sumOf(int[] arr, int sum) {
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
