package Java0428;

/**
 * 手套：https://www.nowcoder.com/questionTerminal/365d5722fff640a0b6684391153e58d8?f=discussion
 */
import java.util.*;

public class Gloves {
    public int findMinimum(int n, int[] left, int[] right) {
        // write code here
        ArrayList<Integer> arr1=new ArrayList<>();
        ArrayList<Integer> arr2=new ArrayList<>();
        int sum=0;
        for(int i=0; i<n; i++){
            if((left[i]==0 && right[i]!=0) || (left[i]!=0 && right[i]==0))
                sum+=left[i]+right[i];
            else if(left[i]!=0 && right[i]!=0){
                arr1.add(left[i]);
                arr2.add(right[i]);
            }
        }
        Collections.sort(arr1);
        Collections.sort(arr2);
        int num1=0, num2=0;
        for(int i=arr1.size()-1; i>0; i--){
            num1+=arr1.get(i);
            num2+=arr2.get(i);
        }
        return sum+2+Math.min(num1,num2);
    }
}

