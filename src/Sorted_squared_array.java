import java.util.Arrays;
import java.util.LinkedList;

public class Sorted_squared_array {
    public int[] sortedSquaredArray(int[] array) {
        // Write your code here.
        int fidx = 0;
        int lidx = array.length - 1;
        int[] result = new int[array.length];
        int idx = array.length - 1;

        while (fidx <= lidx) {
            int fnum = array[fidx];
            int lnum = array[lidx];
            if (fnum * fnum <= lnum * lnum) {
                result[idx--] = lnum * lnum;
                lidx--;
            } else {
                result[idx--] = fnum * fnum;
                fidx++;
            }
        }
        return result;
    }
}
