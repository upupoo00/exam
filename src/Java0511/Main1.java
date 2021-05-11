package Java0511;

import java.util.*;

/**
 * 公共字串计算：https://blog.nowcoder.net/n/b66a02c40da54fc086b167e0372eef0d
 */
public class Main1 {
    public int getCommonStrLength(String s, String t) {
        int result = 0;
        for (int j = 0; j < t.length(); j++) {
            for (int i = 0, val = 0; i < s.length() && i + j < t.length(); i++) {
                if (t.charAt(i + j) == s.charAt(i)) {
                    val++;
                    result = Math.max(result, val);
                }
                else {
                    val = 0;
                }
            }
        }
        for (int i = 0; i < s.length(); i++) {
            for (int j = 0, val = 0; j < t.length() && i + j < s.length(); j++) {
                if (s.charAt(i + j) == t.charAt(j)) {
                    val++;
                    result = Math.max(result, val);
                }
                else {
                    val = 0;
                }
            }
        }
        return result;
    }

    public Main1() {
    }

    public static void main(String[] args) {
        Main1 solution = new Main1();
        Scanner in = new Scanner(System.in);
        while (in.hasNextLine()) {
            String s = in.nextLine();
            String t = in.nextLine();
            int result = solution.getCommonStrLength(s, t);
            System.out.println(result);
        }
    }
}

