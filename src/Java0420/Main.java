package Java0420;
/**
 * 删数：https://www.nowcoder.com/questionTerminal/f9533a71aada4f35867008be22be5b6e
 */

import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int length = sc.nextInt();
            LinkedList<Integer> resList = new LinkedList<>();
            for (int i = 0; i < length; i++) {
                resList.addLast(i);
            }
            int tmp = getLive(resList.size(), 3);
            System.out.println(resList.get(tmp - 1));
        }
    }

    // length 为中长度， num 为数到几删除
    public static int getLive(int length, int num) {
        if (length == 1) {
            return 1;
        }
        // 计算出新编号对应的旧编号，将该旧编号作为下一次计算的新编号
        return (getLive(length - 1, num) + num - 1) % length + 1;
    }
    public static void main1(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int n = sc.nextInt();
            if (n > 1000) {
                n = 999;
            }
            List<Integer> list = new ArrayList<Integer>();
            for (int i = 0; i < n; i++) {
                list.add(i);
            }
            int i = 0;
            while (list.size() > 1) {
                i = (i + 2) % list.size();
                list.remove(i);
            }
            System.out.println(list.get(0));
        }
    }
}
