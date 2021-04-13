package Java0413;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        String[] strings = str.split(" ");
        StringBuilder res = new StringBuilder();
        for (int i =strings.length-1; i >=0; i--) {
            res.append(strings[i]).append(" ");
        }
        String re = res.toString().trim();
        System.out.println(re);
    }
}
