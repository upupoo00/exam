package Java0518;

/**
 * 变态跳台阶：https://www.nowcoder.com/practice/22243d016f6b47f2a6928b4313c85387?tab=answerKey
 */
public class Solution {

    public int jumpFloorII(int target) {
        return (int)Math.pow(2,target-1);
    }
}
