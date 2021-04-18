package LeeCodeDemo;

public class Solution1 {
    /**
     * 方案一：利用字符串中现有的方法
     * 如果你熟悉 Java 里的 String 类的方法的话，你会觉得面试官是不是在搞笑呢，这么简单的问题，不就可以直接使用 replaceAll 方法就可以搞定吗，你会很快的写出代码：
     *
     * @param s
     * @return
     */
    public String replaceSpace(String s) {
        return s.replace(" ","%20");
    }

    /**
     * 方案二：StringBuilder
     * 首先，我们肯定要遍历一遍字符串的所有字符，因为每个字符都有可能为空。接下来就是考虑当遇到空字符的时候，我们该怎么处理，最直接的想法当然是将空字符串直接替换为 %20，但是你要知道 Java 中的字符串是不变的，所以直接替换是不行的。
     *
     * 我们知道 Java 中有个 StringBuilder 是表达可变的字符串的。我们可以使用 StringBuilder 来实现替换空格，算法步骤如下：
     *
     * 初始化一个 StringBuilder 实例 sb
     * 遍历字符串 s 的每个字符：
     * 当遍历到非空字符的时候，直接将字符 append 到 sb 中
     * 如果遍历到的是空字符，那么将 %20 append 到 sb 中
     * 返回 sb.toString
     *以上算法的复杂度分析：
     *
     * 时间复杂度是 O(n)
     * 空间复杂度是 O(n)
     * @param s
     * @return
     */
    public String replaceSpace2(String s) {
        StringBuilder str = new StringBuilder();
        for (int i = 0; i <s.length() ; i++) {
            if(s.charAt(i) != ' '){
                str.append(s.charAt(i));
            }else {
                str.append("%20");
            }
        }
        return str.toString();
    }
    /**
     * 案三：数组
     * 熟悉 StringBuilder 的朋友，应该知道它本质上是一个 char 类型的动态数组：
     *
     * 当初始化 StringBuilder 的时候，会初始化一个固定长度的 char 类型的数组
     * 当往 StringBuilder 中 append 数据的时候，其实就是往 char 类型的数组最后追加数据
     * 那么，当追加的数据的个数超过了数组的大小的时候，就需要对 char 类型的数据进行扩容了，所以这里的扩容还是有点性能损耗的，那么我们能不能减少这个性能损耗呢？
     * 答案是可以的，我们可以通过使用静态数组来解决这个问题，从而可以消除数组动态扩容带来的性能损耗。
     *
     * 第一种方法速度快，但是会浪费空间
     * 第二种方法不会浪费空间，但是会有些许的性能损耗
     * 作者：tangweiqun
     * 链接：https://leetcode-cn.com/problems/ti-huan-kong-ge-lcof/solution/zhe-dao-ti-mu-zhen-de-you-zhe-yao-jian-dan-ma-qing/
     * 来源：力扣（LeetCode）
     */
    public String replaceSpace3(String s) {
        int n = s.length();
        char[] newArr = new char[3 * n];
        int j = 0;
        for (int i = 0; i < n; i++) {
            char c = s.charAt(i);
            if (c == ' ') {
                newArr[j++] = '%';
                newArr[j++] = '2';
                newArr[j++] = '0';
            } else {
                newArr[j++] = c;
            }
        }
        return new String(newArr, 0, j);
    }
//    public String replaceSpace(String s) {
//        int n = s.length();
//        int cnt = 0;
//        for (char c : s.toCharArray()) {
//            if (c == ' ') cnt++;
//        }
//​
//        char[] newArr = new char[n + 2 * cnt];
//        int j = 0;
//        for (int i = 0; i < n; i++) {
//            char c = s.charAt(i);
//            if (c == ' ') {
//                newArr[j++] = '%';
//                newArr[j++] = '2';
//                newArr[j++] = '0';
//            } else {
//                newArr[j++] = c;
//            }
//        }
//        return new String(newArr);
//    }
}
