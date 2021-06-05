package Java0605;


/**
 * 解读密码：https://www.nowcoder.com/questionTerminal/16fa68271ee5448cafd504bb4a64b482
 */

import java.io.*;

public class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String str=null;
        while((str=br.readLine())!=null){
            for(int i=0;i<str.length();i++){
                if(str.charAt(i)>='0' && str.charAt(i)<='9')
                    System.out.print(str.charAt(i));
            }
            System.out.println();
        }
    }
}


