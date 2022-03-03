package Array;

import java.util.*;

public class Move_element_to_end {
    public static List<Integer> moveElementToEnd(List<Integer> array, int toMove) {
        // Write your code here.
        int fidx = 0;
        int lidx = array.size() - 1;

        while (fidx < lidx) {
            while (fidx < lidx && array.get(lidx) == toMove) {
                lidx--;
            }
            if (array.get(fidx) == toMove) {
                int tmp = array.get(lidx);
                array.set(lidx, array.get(fidx));
                array.set(fidx, tmp);
            }
            fidx++;
        }
        return array;
    }
}
