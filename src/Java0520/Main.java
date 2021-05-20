package Java0520;

/**
 * 猴子分桃：https://www.nowcoder.com/questionTerminal/480d2b484e1f43af8ea8434770811b4a
 * 思路：因为每次分5堆都会多出来1个，所以我们借给猴子们4个，以致每次都可以刚好分成5堆
 *     并且，每次给老猴子的桃子都不在我们借出的那4个中，这样最后减掉4就可以得到结果。
 *   假设最初由x个桃子，我们借给猴子4个，则此时有x+4个，
 *   第一个猴子得到（x+4）/5，剩余（x+4）*（4/5）个
 *   第二个猴子分完后剩余（x+4）*(4/5)^2个
 *   第三个猴子分完后剩余（x+4）*(4/5)^3个
 *   依次类推，最后一个猴子分完后剩余（x+4）*（4/5）^n
 *   要满足最后剩余的为整数，并且x最小，则当 x+4=5^n时，满足要求
 *   此时，x=5^n-4;
 *   老猴子得到的数量为：old = （x+4）*（4/5）^n + n - 4
 *                     = 4^n + n - 4
 *   最后老猴子减4是还给我们借给它们的那4个
 *
 */
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = 0;
        while(sc.hasNext()){
            n = sc.nextInt();
            if(n == 0)
                break;
            long a = (long)Math.pow(5, n);
            long b = (long)Math.pow(4, n);
            System.out.println((a-4)+" "+(b-4+n));
        }
    }
}
