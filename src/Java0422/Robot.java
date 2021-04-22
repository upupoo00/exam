package Java0422;

/**
 * 机器人走方格1 ：https://www.nowcoder.com/questionTerminal/e8bb8e68434e42acbcdff0341f2a32c5
 * 暂时没有接触动态规划，只写了递归的解法
 */
public class Robot {

//    由于题目中x+y<=12，所以不必担心递归超时问题，对于每一步，只要没有走到
//    边缘（x==1||y==1）就会有两种选择：向下走（x-1）or 向右走（y-1），终
//    止条件即走到边缘，只能一直走下去，即此时只有一种走法。
    public int countWays(int x, int y) {
        // write code here
        if(x<=0||y<=0) return 0;
        if(x==1 || y==1) return 1;
        return countWays(x-1,y)+countWays(x,y-1);
    }
}
