package Java0416;

/**
 * 连续子数组的最大和：https://www.nowcoder.com/questionTerminal/5a304c109a544aef9b583dce23f5f5db
 */

import java.util.Scanner;
public class Main1{
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()){
            int n=sc.nextInt();
            int max=Integer.MIN_VALUE,temp=0;
            for(int i=0;i<n;i++){
                temp+=sc.nextInt();
                if(temp>max)
                    max=temp;
                if(temp<=0)
                    temp=0;
            }
            System.out.println(max);
        }
    }
}
