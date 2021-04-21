package Java0421;
/**
 * 数字颠倒
 */

import java.util.Scanner;

public class Main1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        String res="";

        while(num!=0){
            int t1=num%10;
            int t2=num/10;
            res=res+ t1;
            num=t2;
        }
        System.out.println(res);
    }

    public static void main2(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        StringBuffer sb = new StringBuffer(str);
        sb.reverse();
        System.out.println(sb.toString());
    }

    public static void main1(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str =sc.nextLine();
        int i = str.length()-1;
        while (i >=0) {
            System.out.print(str.charAt(i));
            i--;
        }
    }
}
