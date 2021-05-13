package Java0513;
/**
 * 小易的升级之路：https://www.nowcoder.com/questionTerminal/fe6c73cb899c4fe1bdd773f8d3b42c3d
 */

import java.util.*;

public class Main {
    public static void main(String[] args) {
        //先构造对应的输入输出格式
        Scanner scanner=new Scanner(System.in);
        //获取输入判断
        while(scanner.hasNext())
        {
            //初始化
            int n=scanner.nextInt();
            int init=scanner.nextInt();
            int[] monster=new int [n];
            for(int i=0;i<n;i++)
            {
                //获取对应的数值
                monster[i]=scanner.nextInt();
                if(init>monster[i])
                {
                    init+=monster[i];
                }
                else
                {
                    //这时候一定monster大
                    init+=GetGYS(init,monster[i]);
                }
            }
            System.out.println(""+init);
        }
        //关闭scanner
        scanner.close();
    }

    //获取对应最大公约数
    public static int GetGYS(int n,int m)
    {
        if(m%n==0)
            return n;
        else
        {
            return GetGYS(m%n,n);
        }

    }
}

