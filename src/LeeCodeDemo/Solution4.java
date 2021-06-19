package LeeCodeDemo;

/**
 * 移动零：https://leetcode-cn.com/problems/move-zeroes/submissions/
 */
public class Solution4 {
    public void moveZeroes(int[] nums) {
        if(nums == null)return;
        int j  = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i] != 0){
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j++] = temp;
            }
        }
    }
}
