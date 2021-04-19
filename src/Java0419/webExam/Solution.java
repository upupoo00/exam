package Java0419.webExam;

/**
 * 数组中只出现一次的两个数字：https://www.nowcoder.com/questionTerminal/e02fdb54d7524710a7d664d082bb7811?answerType=1&f=discussion
 */

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Solution {
    //方法1：排序
    public void FindNumsAppearOnce1(int [] array,int num1[] , int num2[]) {
        Arrays.sort(array);
        for (int i:array) System.out.print(i+" ");
        System.out.println();

        //遍历，拿到一个数，判断它的前后是不是有相同的，有下一个，没有加进去。
        boolean first = false;
        for (int i = 1; i <array.length-1 ; i++) {
            if (array[i] > array[i-1] && array[i]<array[i+1]){
                if(first) {
                    num2[0] = array[i];
                    return;
                } else{
                    num1[0] =array[i];
                    first = true;
                }
            }
        }
        if (first){
            num2 [0] = array[0]!=array[1]?array[0]:array[array.length-1];
        }else{
            num1[0] = array[0];
            num2[0] = array[array.length-1];
        }
    }



    // 方法2：Hash计数
    public void FindNumsAppearOnce2(int [] array,int num1[] , int num2[]) {
        HashMap<Integer,Integer> map = new HashMap<>();

        for (int i = 0; i < array.length; i++) {
            map.merge(array[i],0,Integer::sum);
        }
        boolean first = false;
        for (Map.Entry<Integer,Integer> entry : map.entrySet()){
            if (entry.getValue()==1){
                if (first){
                    num2[0] = entry.getKey();
                    return;
                }else{
                    num1[0] = entry.getKey();
                    first = true;
                }
            }
        }
    }

    //方法3：位运算
    /*
     * 一个数异或两个相同的数 得到原数
     * 所有数异或起来，最终的结果是两个不同的数的异或。
     *
     * */
    public void FindNumsAppearOnce(int [] array,int num1[] , int num2[]) {
        int res = 0;
        for(int i: array)res^=i;
        res &= (-res); //为了找到两个数字的二进制位中第一个不相同二进制位，然后根据这个位置进行分组
        //i = ret & (-ret)是为了获得两个数字的二进制位中第一个不相同二进制位出现的位置，之后第二次for循环的时候，分两组，第一组是i的位置为1的，第二个是i的位置为0的。这样分两组再进行异或操作，出现两次的数字全部被抵消，只剩下出现一次的数字。
        for (int a : array){
            if((a&res)!=0)num1[0]^=a; //按第一个位不同的位置来分组，两个数相同给分到同一组，两个数没有影响。
            else num2[0]^=a;  //那两个不同的数会被分到两个组，由于其他成对的数都没有影响，只剩下这两个数了。
        }
    }

}

