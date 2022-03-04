package Array;

public class Monotonic_Array {
    public static boolean isMonotonic(int[] array) {
        // Write your code here.
        if (array.length <= 2) {
            return true;
        }
        int direction = array[1] - array[0];
        for (int i = 2; i < array.length; i++) {
            if (direction == 0) {
                direction = array[i] - array[i - 1];
                continue;
            }
            if (breadDirection(direction, array[i - 1], array[i])) {
                return false;
            }
        }
        return true;
    }

    public static boolean breadDirection(int direction, int first, int second) {
        if (direction < 0) {
            return first < second;
        } else {
            return first > second;
        }
    }
}
