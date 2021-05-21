package Java0521;

/**
 * 有假币：https://www.nowcoder.com/questionTerminal/1d18c0841e64454cbc3afaea05e2f63c
 * 先枚举一些例子，找出其中规律：
 * 对于 1个硬币，称量 0次
 * 对于 2个硬币，称量 1次
 * 对于 3个硬币，称量 1次
 *
 * 对于 4个硬币，称量 2次，先分成（2，2，0），第一次称量前两份（2，2），如果重量不一样，再次求出判断另外2个硬币需要称量的次数。
 *
 * 对于 5个硬币，称量 2次，先分成（2，2，1），第一次称量前两份（2，2），如果重量不一样，再次判断另外1个硬币需要称量的次数。
 *
 * 对于 6个硬币，称量 2次，先分成（2，2，2），第一次称量前两份（2，2），如果重量不一样，再次判断求出另外2个硬币需要称量的次数。
 *
 * 对于 7个硬币，称量 2次，先分成（3，3，1），第一次称量前两份（3，3），如果重量不一样，再次判断求出另外3个硬币需要称量的次数。
 *
 * 通过上面分析可以看出，对于要称量的硬币，每次称量前分成3份，要求前两份的个数不小于第三份。如果前两份重量是一样，那么假币在第三份中，这样就除去了2/3的硬币。
 * 如果前两份重量不一样，那么假币在重量轻的一份中，这样也除去了2/3的硬币。
 *
 * 这样以来，称量一次除去了将近2/3的硬币，一直重复上面的分法，就可以很快求出称量次数。
 */

import java.io.PrintStream;
import java.util.Scanner;

public class Main {
    public static Scanner in = new Scanner(System.in);
    public static PrintStream out = System.out;

    public static int findCoin(int n){
        if(n==1)
            return 0;
        if(n<=3)
            return 1;
        int metage,rest,times=0;
        // 3等分前，先加2，使得metage的值尽量大于rest
        // (metage,metage,rest)
        metage = (n+2)/3;
        rest = n-2*metage;

        times= 1 + findCoin(Math.max(metage, rest));
        return times;
    }
    public static void main(String[] args) {
        int n;
        while((n=in.nextInt()) > 0){
            out.println(findCoin(n));
        }
    }
}
