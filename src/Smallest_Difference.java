import java.util.*;

public class Smallest_Difference {
    public static int[] smallestDifference(int[] arrayOne, int[] arrayTwo) {
        // Write your code here.
        Arrays.sort(arrayOne);
        Arrays.sort(arrayTwo);
        int fidx = 0;
        int sidx = 0;

        int smallest = Integer.MAX_VALUE;
        int current = Integer.MAX_VALUE;
        int[] result = new int[2];

        while (fidx < arrayOne.length && sidx < arrayTwo.length) {
            int firstNum = arrayOne[fidx];
            int secondNum = arrayTwo[sidx];
            if (firstNum > secondNum) {
                current = firstNum - secondNum;
                sidx++;
            } else if (firstNum < secondNum) {
                current = secondNum - firstNum;
                fidx++;
            } else {
                return new int[]{firstNum, secondNum};
            }
            if (smallest > current) {
                smallest = current;
                result = new int[]{firstNum, secondNum};
            }
        }

        return result;
    }
}
