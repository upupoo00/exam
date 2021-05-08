package Java0508;

import java.util.Scanner;

public class Main{
    /**
     *统计兔子的总数:https://www.nowcoder.com/questionTerminal/1221ec77125d4370833fd3ad5ba72395
     * @param mouthCount 每个月
     * @return 兔子的总数
     */
    public static int getTotalCount(int mouthCount){
        if(mouthCount <=0){
            return -1;
        }
        if(mouthCount <=3){
            return 1;
        }
        return getTotalCount(mouthCount-4)+getTotalCount(mouthCount-5);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            int input = sc.nextInt();
            System.out.println(Main.getTotalCount(input));

        }
    }
}
