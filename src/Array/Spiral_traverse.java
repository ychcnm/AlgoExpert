package Array;

import java.util.List;
import java.util.*;

public class Spiral_traverse {
    public static List<Integer> spiralTraverse(int[][] array) {
        // Write your code here.
        int startRow = 0;
        int startCol = 0;
        int endRow = array.length - 1;
        int endCol = array[0].length - 1;

        List<Integer> result = new ArrayList<Integer>();

        while (startRow <= endRow && startCol <= endCol) {
            for (int col = startCol; col <= endCol; col++) {
                result.add(array[startRow][col]);
            }

            for (int row = startRow + 1; row <= endRow; row++) {
                result.add(array[row][endCol]);
            }

            for (int col = endCol - 1; col >= startCol; col--) {
                if (startRow == endRow) break;
                result.add(array[endRow][col]);
            }

            for (int row = endRow - 1; row > startRow; row--) {
                if (startCol == endCol) break;
                result.add(array[row][startCol]);
            }
            startRow++;
            startCol++;
            endCol--;
            endRow--;
        }
        return result;
    }
}
