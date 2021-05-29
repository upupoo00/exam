package Java0528;

import java.util.LinkedList;
import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while(in.hasNext()){
            String str=in.nextLine();
            String verStr=in.nextLine();
            char[] cA = str.toCharArray();
            int len=str.length();
            LinkedList<String> list=new LinkedList<String>();
            StringBuilder sb=new StringBuilder();
            int count=0;
            for (int i = 0; i < len; i++) {
                char c = cA[i];
                if(c=='"'){
                    count++;
                }
                else{
                    if(count==1){
                        sb.append(c);
                    }
                    else if(count==0){
                        if(c==','){
                            list.add(sb.toString());
                            sb=new StringBuilder();
                        }
                        else{
                            sb.append(c);
                        }
                    }
                }

                if(count==2){
                    list.add(sb.toString());
                    sb=new StringBuilder();
                    count=0;
                    i++;//避免间隔符--逗号
                }
                else if(i==len-1){//最后一组不是引号组
                    list.add(sb.toString());
                }
            }

            int size=list.size();
            String sArr[]=new String[size];
            for (int i = 0; i < size; i++) {
//              System.out.println(list.get(i));
                sArr[i]=list.get(i);
            }

            boolean flag=false;
            for (int i = 0; i < size; i++) {
                if(sArr[i].equals(verStr)){
                    System.out.println("Ignore");
                    flag=true;
                    break;
                }
            }

            if(flag){
                continue;
            }
            else{
                System.out.println("Important!");
            }
        }
    }
}
