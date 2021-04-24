package Java0424;

/**
 * 二进制插入：https://www.nowcoder.com/questionTerminal/30c1674ad5694b3f8f0bc2de6f005490
 * 位运算
 */
public class BinInsert {
    public int binInsert(int n, int m, int j, int i){
        m<<=j;
        return n|m;
    }
}
