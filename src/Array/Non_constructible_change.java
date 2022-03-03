package Array;

import java.util.*;

public class Non_constructible_change {
    public int nonConstructibleChange(int[] coins) {
        Arrays.sort(coins);
        int createdChange = 0;
        for (int coin : coins) {
            if (coin > createdChange + 1) return createdChange + 1;
            createdChange += coin;
        }
        return createdChange + 1;
    }
}
