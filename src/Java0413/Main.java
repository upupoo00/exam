package Java0413;

/**
 * 链接：https://www.nowcoder.com/questionTerminal/2d3f6ddd82da445d804c95db22dcc471
 * 来源：牛客网
 * 牛牛定义排序子序列为一个数组中一段连续的子序列,并且这段子序列是非递增或者非递减排序的。
 * 牛牛有一个长度为n的整数数组A,他现在有一个任务是把数组A分为若干段排序子序列,牛牛想知道他最少可以把这个数组分为几段排序子序列.
 * 如样例所示,牛牛可以把数组A划分为[1,2,3]和[2,2,1]两个排序子序列,至少需要划分为2个排序子序列,所以输出2
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int[] array = new int[num];
        int i = 0;
        while (i < num) {
            array[i] = scanner.nextInt();
            i++;
        }
        System.out.println(flg(array));
    }
        public static int flg(int[] array){
            //用标志区分 递增是true，递减是false
            boolean flag = false;
            //计算排序子序列的个数 默认 为1也就是从当前序列开始
            int count = 1;
            //state 表示当前是否有趋势，比如 1,2,3,2,2,1；[3,2]显然破坏了之前的
            //趋势，但是新的趋势还未出现；需要后面的数才能得到；
            //没有趋势就是true，有趋势是false
            boolean state = true;
            for (int i = 0; i < array.length - 1; i++) {
                if (state && array[i] < array[i + 1]) {
                    flag = true;
                    state = false;
                } else if (state && array[i] > array[i + 1]) {
                    flag = false;
                    state = false;
                }
                //当前有明确趋势，递增，但此时被破坏了；
                //趋势不明，但是一定会是一个新的序列了
                if (!state && flag && array[i] > array[i + 1]) {
                    state = true;
                    count++;
                }
                //当前有明确趋势，递减，但被破坏了
                // 趋势不明，但是一定会是一个新的序列了
                else if (!state && !flag && array[i] < array[i + 1]) {
                    state = true;
                    count++;
                }
            }
            return count;
    }
}

