package Java0611;

import java.util.Arrays;

/**
 * 数组中出现次数超过一半的数字:https://www.nowcoder.com/questionTerminal/e8a1b01a2df14cb2b228b30ee6a92163
 */
public class Solution {
    public static int MoreThanHalfNum_Solution(int [] array) {
        int count =array[0];
        int result = 0;
        for(int num: array){
            if(num == count) result++;
            else result = result==0?0:result-1;
            if(result==0){
                count = num;
                result = 1;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 2, 2, 2, 5, 4, 2};
        System.out.println(MoreThanHalfNum_Solution(array));
    }
}
