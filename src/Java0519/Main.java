package Java0519;

import java.util.Scanner;

/**
 * 三角形 :https://www.nowcoder.com/questionTerminal/c67a09062c0f4a5b964eef0945d3dd06
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()){
            Double a = scanner.nextDouble();
            Double b = scanner.nextDouble();
            Double c = scanner.nextDouble();
            triangle(a,b,c);
        }
    }

    private static void triangle(double a, double b, double c) {
        if((a+b>c && a+c>b && b+c>a) && (a-b<c && a-c<b && b-c<a)){
            System.out.println("Yes");
        }else {
            System.out.println("No");
        }
    }
}
