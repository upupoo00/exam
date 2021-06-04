package Java0604;

/**
 * Emacs计算器：https://www.nowcoder.com/questionTerminal/1a92fbc771a54feb9eb5bd9b3ff2d0a9
 */

import java.util.Scanner;
import java.util.Stack;
public class Main1 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        Stack<Integer>stack=new Stack<>();
        while(scanner.hasNext()){
            int n=scanner.nextInt();
            String string[]=new String[n];
            for (int i = 0; i < n; i++) {
                string[i]=scanner.next();
                if (string[i].charAt(0)>='0'&&string[i].charAt(0)<='9') {
                    stack.push(Integer.parseInt(string[i]));
                    //System.out.println(Integer.parseInt(string[i]));
                }else{
                    int a2=stack.pop();
                    int a1=stack.pop();
                    if (string[i].charAt(0)=='+') {
                        stack.push(a1+a2);
                    }
                    if (string[i].charAt(0) == '-') {
                        stack.push(a1-a2);
                    }
                    if (string[i].charAt(0) == '*') {
                        stack.push(a1*a2);
                    }
                    if (string[i].charAt(0) == '/') {
                        stack.push(a1/a2);
                    }
                }
            }
            System.out.println(stack.pop());
        }

    }
}
