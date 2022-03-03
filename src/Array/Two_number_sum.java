package Array;

import java.util.Arrays;

public class Two_number_sum {
    public static int[] twoNumberSum(int[] array, int targetSum) {
        // Write your code here.
        Arrays.sort(array);
        int s = 0;
        int e = array.length - 1;

        while (s < e) {
            int sum = array[s] + array[e];
            if (sum < targetSum) {
                s++;
            } else if (sum > targetSum) {
                e--;
            } else {
                return new int[]{array[s], array[e]};
            }
        }
        return new int[0];
    }
}

