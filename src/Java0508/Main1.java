package Java0508;

/**
 * 字符串通配符;https://www.nowcoder.com/questionTerminal/43072d50a6eb44d2a6c816a283b02036
 * dp解决：http://www.mamicode.com/info-detail-986984.html
 */

import java.util.Scanner;
public class Main1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            while(sc.hasNext()){
                String zhengze = sc.next();
                String s = sc.next();
                zhengze = zhengze.replaceAll("\\?","[\\\\w]{1}");
                zhengze = zhengze.replaceAll("\\*","[\\\\w]*");
                System.out.println(s.matches(zhengze));
             }
        sc.close(); 
    }
}