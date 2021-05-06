package Java0506;

/**
 * 超长整数相加：https://blog.nowcoder.net/n/9fcb0b53562946078069c78e8e6abd61
 */

import java.util.*;

public class Main1 {

    public Main1() {
    }

    public String addLongInteger(String addend, String augend) {
        StringBuilder res = new StringBuilder();
        // 进位信息
        int carry = 0;
        int i = addend.length() - 1, j = augend.length() - 1;
        while (i >= 0 || j >= 0 || carry != 0) {
            int sum = carry;
            if (i >= 0) {
                sum += addend.charAt(i--) - '0';
            }
            if (j >= 0) {
                sum += augend.charAt(j--) - '0';
            }
            res.append(sum % 10);
            carry = sum / 10;
        }
        return res.reverse().toString();
    }

    public static void main(String[] args) {
        Main1 solution = new Main1();
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            String addend = in.next();
            String augend = in.next();
            String res = solution.addLongInteger(addend, augend);
            System.out.println(res);
        }
    }
}
