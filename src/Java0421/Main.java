package Java0421;

import java.util.Scanner;

/**
 * 末尾0的个数:https://www.nowcoder.com/questionTerminal/6ffdd7e4197c403e88c6a8aa3e7a332a
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            int res = 0; int n  = sc.nextInt();
            for (int i = 5; i <=n ; i *=5) {
                res += n/i;
            }
            System.out.println(res);
        }
        sc.close();
    }
}
