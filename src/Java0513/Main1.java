package Java0513;

/**
 * 找出字符串中第一个只出现一次的字符：https://www.nowcoder.com/questionTerminal/e896d0f82f1246a3aa7b232ce38029d4
 */
import java.util.Scanner;

public class Main1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            String str = sc.nextLine();
            char[] cs = str.toCharArray();
            String s = "-1";
            for(int i = 0; i < cs.length; i++){
                if(str.indexOf(cs[i]) == str.lastIndexOf(cs[i])){
                    s = cs[i]+"";
                    break;
                }
            }
            System.out.println(s);
        }
        sc.close();
    }
}
