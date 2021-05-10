package Java0510;

/*
 * 汽水瓶：https://www.nowcoder.com/questionTerminal/fe298c55694f4ed39e256170ff2c205f
 *
 */

import java.util.Scanner;

public class Main {
    /**
     * 规律是每两个汽水瓶换一瓶，所以除以二即可
     *
     */
    public static void main1(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        while (scanner.hasNext()){
            n = scanner.nextInt();
            if(n!=0)  System.out.println(n/2);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int num = sc.nextInt();
            if (num != 0) {
                System.out.println(f(num));
            }
        }
        sc.close();
    }

    /**
     * 思路二：递归方法
     * @param n 空的瓶子数
     * @return 可以喝的汽水瓶数
     */
    public static int f(int n) {
        if (n == 1)
            return 0;
        if (n == 2)
            return 1;
        return n / 3 + f(n % 3 + n / 3);
    }
}
