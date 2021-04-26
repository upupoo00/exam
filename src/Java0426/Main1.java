package Java0426;

/**
 * 跳石板：https://www.nowcoder.com/questionTerminal/4284c8f466814870bae7799a07d49ec8
 */

import java.util.*;
//广度优先遍历
public class Main1{
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        while(input.hasNext()){
            int N=input.nextInt();
            int M=input.nextInt();
            HashMap<Integer, Integer> list=new HashMap<>();
            LinkedList<Integer> queue=new LinkedList<>();
            list.put(N, 0);   //当前所在位置，0步
            queue.add(N);
            while(!queue.isEmpty()){
                int num=queue.remove();
                if(num==M){        //满足条件时，输出
                    System.out.println(list.get(num));
                    return ;
                }
                if(num>M)     //石板超过目标时不考虑
                    continue;
                HashSet<Integer> arr=new HashSet<>();   //存储当前石板的所有约数
                yueShu(num, arr);                //找约数
                for(int elem: arr){
                    if(!list.containsKey(num+elem)){     //记录下一次起跳时的石板
                        list.put(num+elem, list.get(num)+1);
                        queue.add(num+elem);
                    }
                }
            }
            System.out.println(-1);
        }
    }
    public static void yueShu(int num, HashSet<Integer> arr){    //约数计算
        for(int i=2; i<=Math.sqrt(num); i++){
            if(num%i==0){
                arr.add(i);
                arr.add(num/i);
            }
        }
    }
}