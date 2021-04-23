package Java0423;
/**
 * 求最大连续bit数：https://www.nowcoder.com/questionTerminal/4b1658fd8ffb4217bc3b7e85a38cfaf2?f=discussion
 */

import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()){
            int input = sc.nextInt();
            String bi = Integer.toBinaryString(input);
            String subs = "1";
            int cnt = 1;
            for(int i=1; i<=bi.length(); i++) {
                if(bi.contains(subs)) {
                    cnt = subs.length();
                    subs += "1";
                }
            }
            System.out.println(cnt);
        }
    }
}
