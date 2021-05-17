package Java0517;

/**
 * 数根：https://www.nowcoder.com/questionTerminal/e2422543519249f292d8435394ab82fe
 */

import java.util.Scanner;

public class Main{

    public static void main(String[] args)
    {
        Scanner input=new Scanner(System.in);
        while(input.hasNext())
        {
            String str=input.nextLine();
            System.out.println(getRoot(str));
        }
    }
    private static int getRoot(String str)
    {
        if(str.length()==1)
        {
            return Integer.parseInt(str);
        }
        else
        {
            int sum=0;
            for(int i=0;i<str.length();i++)
            {
                sum+=Integer.parseInt(String.valueOf(str.charAt(i)));
            }
            if(sum<10)
            {
                return sum;
            }
            else
            {
                return getRoot(String.valueOf(sum));
            }
        }
    }
}
