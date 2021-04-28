package Java0428;

/**
 * 查找输入证书二进制中1的个数：https://www.nowcoder.com/questionTerminal/1b46eb4cf3fa49b9965ac3c2c1caf5ad
 * 关于位运算参考：https://blog.csdn.net/hyqsong/article/details/51588551
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()){
            int n = scanner.nextInt();
            System.out.println(findNumberOf1(n));
        }
        scanner.close();
    }
    public static int findNumberOf1(int num){
        int count = 0;
        while (num!=0){
            num &= (num-1);
            count++;
        }
        return count;
    }
}
