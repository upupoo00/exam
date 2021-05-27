package Java0527;

/**
 * 养兔子：https://www.nowcoder.com/questionTerminal/71d3849a19f04a1591c415964ac148f1
 */

import java.math.BigInteger;
import java.util.Scanner;

public class Main1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()){
            int n = scanner.nextInt();
            BigInteger oldRabbit = new BigInteger("1");
            BigInteger newRabbit = new BigInteger("0");
            for (int i = 0; i <n-1 ; i++) {
                BigInteger temp=newRabbit;
                newRabbit=oldRabbit;
                oldRabbit=oldRabbit.add(temp);
            }
            System.out.println(oldRabbit.add(newRabbit));
        }
    }
}
