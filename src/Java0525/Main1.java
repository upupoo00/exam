package Java0525;

/**
 * 斐波那契凤尾：https://www.nowcoder.com/questionTerminal/c0a4b917a15f40a49ca10532ab9019fb
 */

import java.util.Scanner;
public class Main1{
    static int[] fib = new int[100001];
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        fib[0] = 1;
        fib[1] = 1;
        while (in.hasNext()) {
            int n = in.nextInt();
            System.out.printf((n<25?"%d\n":"%06d\n"), getFibonacci(n));
        }
        in.close();
    }
    static int getFibonacci(int n) {
        if (fib[2] == 0) {
            for (int i = 2; i <100001; i++) {
                fib[i] = (fib[i-1] + fib[i-2]) % 1000000;
            }
        }
        return fib[n];
    }
}