package Java0422;

/**
 * Fibonacci数列：https://www.nowcoder.com/questionTerminal/18ecd0ecf5ef4fe9ba3f17f8d00d2d66?f=discussion
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = 0,b = 1;
        while(b<n){
            b = b+a;
            a = b-a;
        }
        System.out.println(Math.min((b - n), (n - a)));
    }
}
