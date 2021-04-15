package Java0415;

import java.util.HashMap;
import java.util.Scanner;

/**
 * 进制转换：https://www.nowcoder.com/questionTerminal/ac61207721a34b74b06597fe6eb67c52
 */
public class Main1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<Integer,Character> hm = new HashMap<Integer,Character>();
        hm.put(10,'A');hm.put(11,'B');
        hm.put(12,'C');hm.put(13,'D');
        hm.put(14,'E');hm.put(15,'F');
        while(sc.hasNext()){
            int m = sc.nextInt();
            int n = sc.nextInt();
            StringBuilder sb = new StringBuilder();
            boolean flag = false;
            if(m<0){
                flag = true;
                m = 0-m;
            }
            while(m>0){
                int t = m%n;
                sb.append(hm.get(t)==null?t:hm.get(t)+"");
                m = m/n;
            }
            if(flag)
                System.out.println("-" + sb.reverse().toString());
            else
                System.out.println(sb.reverse().toString());
        }
    }
}
