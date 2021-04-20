package Java0420;

/**
 * 求n个数里k个最小数：https://www.nowcoder.com/questionTerminal/cc727473d1e248ccb674eb31bd8683dc
 */

import java.util.Arrays;
import java.util.Scanner;

public class Main1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            String temp = sc.nextLine();
            String[] arr = temp.split(" ");
            int[] result = new int[arr.length-1];
            int k = 0;
            for(int i=0;i<arr.length;i++){
                if(i<arr.length-1)
                    result[i]=Integer.parseInt(arr[i]);
                else
                    k=Integer.parseInt(arr[i]);
            }
            Arrays.sort(result);
            for(int i=0;i<k;i++){
                if(i<k-1)
                    System.out.print(result[i]+" ");
                else
                    System.out.println(result[i]);
            }
        }
    }
}
