package Java0520;

/**
 * 奇数位上是奇数偶数位上是偶数：https://www.nowcoder.com/questionTerminal/b89b14a3b5a94e438b518311c5156366
 */
public class Solution {
    /**
     *	奇数位上都是奇数或者偶数位上都是偶数
     *	输入：数组arr，长度大于2
     *	将arr调整成奇数位上都是奇数或者偶数位上都是偶数
     */
    public void oddInOddEvenInEven(int[] arr) {
        if(arr == null || arr.length<2){
            return;
        }
        int even = 0;
        int odd = 1;
        int end = arr.length-1;
        while (even< end && odd<end) {
            if(arr[end]%2==0){
                int temp = arr[end];
                arr[end] = arr[even];
                arr[even] = temp;
                even += 2;
            }else {
                int temp = arr[end];
                arr[end] = arr[odd];
                arr[odd] = temp;
                odd += 2;
            }
        }
    }
}
