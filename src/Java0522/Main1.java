package Java0522;

/**
 * 因子个数：https://www.nowcoder.com/questionTerminal/e8fb8f89f5d147ec92fd8ecfefe89b0d
 */

import java.util.*;
public class Main1{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while (input.hasNext()) {
            int n = input.nextInt();
            if (isPrimer(n)) {
                System.out.println(1);
                continue;
            }
            int cnt = 0;
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) {
                    while (n % i == 0) {
                        n /= i;
                    }
                    cnt++;
                }
            }
            if (n != 1) cnt++;
            System.out.println(cnt);
        }
    }

    public static boolean isPrimer(int n) {
        for (int i = 2; i <= Math.pow(n, 0.5); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }
}
