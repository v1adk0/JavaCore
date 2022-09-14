package TaskTwo;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] testArr = {3, 4, 2, 7};
        sumOf(testArr, 10);
    }

static void sumOf(int[] arr, int sum) {
    if (arr == null) {
        arr = new int[0];
    }
        int first =0;
        int last = arr.length - 1;

       while (first != last) {

           int[] res;
           int sumCount = arr[first] + arr[last];

           if (sumCount < sum) {
               first++;
           } else if (sumCount > sum) {
               last--;
           } else {
               res = new int[]{arr[first], arr[last]};
               System.out.println(Arrays.toString(res));
               break;
           }
        }

}
}



