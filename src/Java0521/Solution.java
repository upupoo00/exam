package Java0521;

/**
 * 求正数数组的最小不可组成和：https://www.nowcoder.com/questionTerminal/296c2c18037843a7b719cf4c9c0144e4
 */

import java.util.*;

public class Solution {
    /**
     *  正数数组中的最小不可组成和
     *  输入：正数数组arr
     *  返回：正数数组中的最小不可组成和
     */
    public int getFirstUnFormedNum(int[] arr) {
        int min = Integer.MAX_VALUE;
        int max = 0;
        for(int value: arr){
            if (value < min) min = value;
            max += value;
        }
        Arrays.sort(arr);
        BitSet[] table = new BitSet[arr.length];
        for(int i=0;i<table.length;i++){
            table[i] = new BitSet(max-min+1);
        }


        table[0].set(arr[0]-min);

        for(int i=1;i<arr.length;i++){ //array[i]
            table[i].set(arr[i]-min); //设置当前列的值arr[i],注意偏移
            for(int j=min;j<=max;j++){
                if(table[i-1].get(j-min)){
                    table[i].set(j-min); //继承上一行的值
                    if(j+arr[i]<=max) table[i].set(j+arr[i]-min); //上一行值加上这个值产生的新值
                }
            }
        }

        for(int j=min;j<=max;j++){
            if(!table[arr.length-1].get(j-min)) return j;
        }
        return max+1;
    }
}
