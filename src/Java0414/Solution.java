package Java0414;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Solution {
    /**
     * 第一种方法
     * @param array
     * @return
     */
    public int MoreThanHalfNum_Solution1(int [] array) {
        Arrays.sort(array);
        int count=0;

        for(int i=0;i<array.length;i++){
            if(array[i]==array[array.length/2]){
                count++;
            }
        }
        if(count>array.length/2){
            return array[array.length/2];
        }else{
            return 0;
        }

    }
    /**
     * 第二种方法，快排思想
     * 其中一种思路是：基于Partition函数的O(n)算法
     * 我们回到题目本身分析，就会发现前面的思路并没有考虑到 数组的特性 ：数组中有一个数字出现的次数超过了数组长度的一半。
     * 如果我把这个数组排序，那么排序之后位于数组中间的数字一定就是那个出现次数超过数组一半的数字。也就是说，这个数字就是
     * 统计学上的中位数，即长度为n的数组中第n/2的数字。 我们有成熟的O(n)的算法得到数组中任意第K大的数字 。
     * 这种算法是受快速排序算法的启发。在随机快速排序算法中，我们现在数组中随机选择一个数字，然后调整数组中数字的顺序，
     * 使得比选中的数字小的数字都排在它的左边，比选中的数字大的数字都排在它的右边。如果这个选中的数字的下标刚好是n/2，
     * 那么这个数字就是数组的中位数。如果它的下标大于n/2，那么中位数应该位于它的左边，我们可以接着在它的左边部分的数组中查找。
     * 如果它的下标小于n/2，那么中位数应该位于它的右边，我们可以接着在它的右边部分的数组中查找
     *
     */
    public int MoreThanHalfNum_Solution2(int [] array) {
        if(array.length<=0)
            return 0;

        int start = 0;
        int length = array.length;
        int end  = length-1;
        int middle = length>>1;

        int index = Partition(array,start,end);


        while(index!=middle){

            if(index>middle){
                index = Partition(array,start,index-1);
            }
            else{
                index = Partition(array,index+1,end);
            }
        }
        int result = array[middle];

        int times = 0;
        for(int i=0;i<length;++i){
            if(array[i] == result)
                times++;
        }
        if(times*2<length){
            System.out.println(times);
            return 0;
        }else{
            return result;
        }
    }
    public int Partition(int[] array,int start,int end){
        int flag = (array[start]+array[end])/2;

        while(start<end){
            while(array[end]>flag){
                end--;
            }
            swap(array,start,end);
            while(array[start]<=flag){
                start++;
            }
            swap(array,start,end);
        }
        return start;
    }
       public void swap(int[] array,int num1,int num2){
        int temp =array[num1];
        array[num1] =array[num2];
        array[num2] =temp;
    }


    /**
     * 第三种方法：基于数组的特点
     */
    public int MoreThanHalfNum_Solution3(int [] array) {
        if(array.length<=0){
            return 0;
        }
        int result = array[0];
        int times = 1;

        for(int i=0;i<array.length;i++){
            if(times==0){
                result = array[i];
                times =1;
            }else if(array[i]==result)
                times++;
            else
                times--;
        }
        int time = 0;
        for(int i=0;i<array.length;++i){
            if(array[i] == result)
                time++;
        }
        if(time*2<array.length){
            System.out.println(time);
            return 0;
        }else{
            return result;
        }
    }

    /**
     * 第四种方法：利用Map存值
     */
    public int MoreThanHalfNum_Solution4(int [] array) {
        if(array.length==0||array==null)
            return 0;
        Map<Integer,Integer> map=new HashMap<Integer,Integer>();
        for(int i=0;i<array.length;i++){
            if(map.containsKey(array[i])){
                map.put(array[i], map.get(array[i])+1);
            }else{
                map.put(array[i], 1);
            }
        }
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if(entry.getValue()>array.length/2)
                return entry.getKey();
        }
        return 0;
    }
}

