package Java0511;

import java.util.Scanner;

/**
 * 字符串反转：https://www.nowcoder.com/questionTerminal/e45e078701ab4e4cb49393ae30f1bb04
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        StringBuilder sb = new StringBuilder(str);
        sb.reverse();
        System.out.println(sb.toString());
    }

    public static void main2(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()){
            String str = scanner.nextLine();
            for (int i = str.length()-1; i >=0 ; i--) {
                System.out.print(str.charAt(i));
            }
        }
    }
}
