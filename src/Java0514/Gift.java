package Java0514;

/**
 * 微信红包：https://www.nowcoder.com/questionTerminal/fbcf95ed620f42a88be24eb2cd57ec54
 */

import java.util.*;

public class Gift {
    public int getValue(int[] gifts, int n) {
        Arrays.sort(gifts);
        int ans = gifts[n/2];
        int num = 0;
        for(int i = 0; i < gifts.length; i++) {
            if(gifts[i] == ans) {
                num++;
            }
        }
        return num <= n/2 ? 0 : ans;
    }
}
