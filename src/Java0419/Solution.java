package Java0419;
import java.util.*;
public class Solution {
        /**
         * 代码中的类名、方法名、参数名已经指定，请勿修改，直接返回方法规定的值即可
         *
         *
         * @param array int整型一维数组
         * @return int整型一维数组
         */
        public int[] FindNumsAppearOnce (int[] array) {
            // write code here
            int res = 0;
            for(int a:array) res ^= a;
            int[] nums = new int[]{0,0};
            res &= -res;
            for(int a:array){
                if( (a&res)==0 ) nums[0] ^= a;
                else nums[1] ^= a;
            }
            if(nums[0]>nums[1]){
                int temp = nums[0];
                nums[0] = nums[1];
                nums[1] = temp;
            }
            return nums;
        }
      public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int ret = scanner.nextInt();
            int[] arr = new int[ret];
            for (int i = 0; i <=ret; i++) {
                arr[i] = scanner.nextInt();
            }
        }
}
