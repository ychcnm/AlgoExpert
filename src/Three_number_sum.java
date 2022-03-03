import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Three_number_sum {
    public static List<Integer[]> threeNumberSum(int[] array, int targetSum) {
        // Write your code here.
        Arrays.sort(array);
        List<Integer[]> result = new ArrayList<Integer[]>();
        for (int i = 0; i < array.length - 2; i++) {
            int l = i + 1;
            int r = array.length - 1;
            while (l < r) {
                int target = array[i] + array[l] + array[r];
                if (target == targetSum) {
                    result.add(new Integer[]{array[i], array[l], array[r]});
                    l++;
                    r--;
                } else if (target < targetSum) {
                    l++;
                } else {
                    r-- ;
                }
            }
        }
        return result;
    }
}
