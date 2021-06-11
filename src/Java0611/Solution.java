package Java0611;

/**
 * 数组中出现次数超过一半的数字:https://www.nowcoder.com/questionTerminal/e8a1b01a2df14cb2b228b30ee6a92163
 */
public class Solution {
    public int MoreThanHalfNum_Solution(int [] array) {
        int count = 0;
        int result = 0;
        for(int i=0;i<array.length;i++){
            count = 0;
            for(int j=0;j<array.length;j++){

                if (array[i]==array[j]){
                    count++;
                }
            }
            if (count*2 >array.length){
                result = array[i];
            }

        }
        return result;

    }
}
