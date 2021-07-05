package LeeCodeDemo;

/**
 * 字符串拼接
 */
public class Solution5 {
        public String compressString(String S) {
            if (S.length() == 0) {
                return S;
            }
            StringBuffer ans = new StringBuffer();
            int cnt = 1;
            char ch = S.charAt(0);
            for (int i = 1; i < S.length(); ++i) {
                if (ch == S.charAt(i)) {
                    cnt++;
                } else {
                    ans.append(ch);
                    if(cnt != 1){
                        ans.append(cnt);
                    }
                    ch = S.charAt(i);
                    cnt = 1;
                }
            }
            ans.append(ch);
            if(cnt != 1){
                ans.append(cnt);
            }
            return ans.toString();
    }
}
