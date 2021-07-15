package MianShiTest;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        long ret = 0, ant = 0;
        for (int i = str.length()-1; i >-1; i--) {
            if(str.charAt(i) == 'b') {
                ret++;
            }else {
                ant += ret;
                ret *= 2;
                ret %=1000000007;
                ant %=1000000007;
            }
        }
        System.out.println(ant);
    }
}
