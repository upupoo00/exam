package Java0522;

/**
 * 最难的问题：https://www.nowcoder.com/questionTerminal/9f6b8f6ec26d44cfb8fc8c664b0edb6b
 */

import java.util.Scanner;
public class Main{
    //方法1
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            String s = sc.nextLine();
            for(int i = 0; i < s.length(); i++){
                char c = s.charAt(i);
                if(c >= 'A' && c < 'F'){
                    System.out.print((char)((int)c + 21));
                }else if(c > 'E' && c <= 'Z'){
                    System.out.print((char)((int)c - 5));
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    //方法2
    public static void main2(String[] args){
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            String s = sc.nextLine();
            char[] chars = s.toCharArray();
            StringBuffer sb = new StringBuffer();
            for(int i = 0; i < s.length(); i++){
                char c = chars[i];
                if(c >= 'A' && c < 'F'){
                    sb.append((char)(c + 21));
                }else if(c > 'E' && c <= 'Z'){
                    sb.append((char)(c - 5));
                }else{
                    sb.append(c);
                }
            }
            System.out.println(sb.toString());
        }
    }
}
