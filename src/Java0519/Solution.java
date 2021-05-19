package Java0519;

/**
 * 不用加减乘除做加法:https://blog.nowcoder.net/n/0f1f6021ad0e4410a6bad6d4c935d4c2
 */
public class Solution {
    public int Add(int num1,int num2) {
        while (num2 != 0) {
            int nums = num1 ^ num2;
            int carry = (num1 &  num2)<<1;
            num1 = nums;
            num2 = carry;
        }
        return num1;
    }
}
