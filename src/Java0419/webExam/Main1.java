package Java0419.webExam;

import java.util.*;

/**
 * 单调栈结构：https://www.nowcoder.com/questionTerminal/e3d18ffab9c543da8704ede8da578b55
 */

//第一行输入一个数字 n，表示数组 arr 的长度。
//
//以下一行输出 n个数字，表示数组的值。

//7
//3 4 1 5 6 2 7

//-1 2
//0 2
//-1 -1
//2 5
//3 5
//2 -1
//5 -1
public class Main1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int  m= sc.nextInt();
        int[] nums=new int[m];
        for (int i = 0; i < m; i++) {
            nums[i]=sc.nextInt();
        }
        Stack<Integer> s=new Stack<>();
        s.push(0);
        int[][] res=new int[m][2];
        res[0][0]=-1;
        int index=1;
        while (index<m){
            int cur=nums[index];//取出当前值
            if(!s.isEmpty()&&cur>nums[s.peek()]){//如果栈不为空，且比栈顶的值大，为了保持单调栈的结构，直接压入栈，后面出栈的时候再设置其左侧和右侧最小就行
                s.push(index);
                index++;
            }else if(s.isEmpty()){//如果栈为空，压入当前的下标
                s.push(index);
                index++;
            }
            else {//栈不为空，且cur<当前的栈顶，这道题数组是不含有重复值的，所以只有大于或者等于
                while (!s.isEmpty()&&cur<nums[s.peek()]){
                    int temp=s.pop();
                    res[temp][1]=index;
                    res[temp][0]= s.isEmpty()?-1:s.peek();
                }
                s.push(index);
                index++;
            }

        }
        while(!s.isEmpty()){//如果有些值本身就比较小，会一直在栈中，所以得设置其值
            int cur=s.pop();
            res[cur][1]=-1;
            res[cur][0]=s.isEmpty()?-1:s.peek();
        }
        res[m-1][1]=-1;//末尾元素的右侧肯定是-1
        for (int i = 0; i < res.length; i++) {
            System.out.printf(String.valueOf(res[i][0])+" ");
            System.out.printf(String.valueOf(res[i][1])+'\n');
        }

    }
}
