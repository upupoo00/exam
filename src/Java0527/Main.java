package Java0527;

/**
 * 收件人列表：https://www.nowcoder.com/questionTerminal/5973a31d58234b068fa1fe34f7290855
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while(in.hasNext()){
            int n=in.nextInt();
            int tn=n;
            StringBuilder sb=new StringBuilder();
            while(n--!=-1){
                String s=in.nextLine();
                int len=s.length();
                char[] cA = s.toCharArray();
                boolean hasFh=false;
                for (int i = 0; i < len; i++) {
                    char c = cA[i];
                    if(c==',' || c==' '){
                        hasFh=true;
                        break;
                    }
                }

                if(hasFh){
                    sb.append("\""+s+"\"");
                }
                else{
                    sb.append(s);
                }

                if(n!=-1 && n!=tn-1){
                    sb.append(", ");
                }
            }
            System.out.println(sb);
        }
    }
}