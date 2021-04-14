package Java0414;

import java.util.Scanner;

/**
 * 题目：字符串中找出连续最长的数字串
 * 链接：https://www.nowcoder.com/questionTerminal/bd891093881d4ddf9e56e7cc8416562d
 */
public class Main {

    /*算法思想：用max表示经过的数字长度最大值，count表示数字计数器，当为字母时重置为0
     *end表示数字尾部，每次满足数字时，对max进行判断，当max小于于count时，更新max和end
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()){
            String str = scanner.nextLine();
            int max = 0, count = 0, end = 0;
            for (int i = 0; i < str.length(); i++) {
                if(str.charAt(i)>='0' && str.charAt(i)<='9'){
                    count++;
                    if(count>max){
                        max = count;
                        end = i;
                    }
                }else {
                    count = 0;
                }
            }
            System.out.println(str.substring(end-max+1,end+1));
        }
    }



    //方法一：使用split函数用正则表达式（[^0-9]）分割，即使用非数字的字符进行分割
    public static void main1(String[] args) {
        Scanner scanner  = new Scanner(System.in);
        String str = scanner.nextLine();
        String[] arr = str.split("[[^0-9]]");
        String result = "";
        int max = 0;
        for (int i=0;i<arr.length;i++) {
            if(arr[i].length()>max){
                max = arr[i].length();
                result = arr[i];
            }
        }
        System.out.println(result);
    }
}
