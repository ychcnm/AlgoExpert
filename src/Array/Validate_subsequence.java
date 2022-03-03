package Array;

import java.util.*;

public class Validate_subsequence {
    public static boolean isValidSubsequence(List<Integer> array, List<Integer> sequence) {

        int fd = 0;
        int ld = 0;

        while (ld < sequence.size()) {
            int num = sequence.get(ld);
            if (fd >= array.size()) {
                break;
            }
            if (num == array.get(fd)) {
                fd++;
                ld++;
            } else {
                fd++;
            }
        }

        return ld == sequence.size() ? true : false;
    }
}
