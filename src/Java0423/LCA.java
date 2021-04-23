package Java0423;

/**
 * 最近公共先祖：https://www.nowcoder.com/questionTerminal/70e00e490b454006976c1fdf47f155d9
 */
public class LCA {
    public int getLCA(int a, int b) {
        // write code here
        while(a!=b){
            if(a>b) a /=2;
            else b /= 2;

        }
        return a;
    }
}
