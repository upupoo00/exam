package Java0518;

/**
 * 快到碗里来：https://www.nowcoder.com/questionTerminal/82424d93369649b98720743c25edc6ce
 */

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            Double n = sc.nextDouble();
            Double r = sc.nextDouble();
            if(n < 2 * 3.14 * r) System.out.println("Yes");
            else System.out.println("No");
        }
    }
}
