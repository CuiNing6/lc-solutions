package dynamic_programming;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by cuining8 on 03/05/2022. Given a non-empty string s and a dictionary
 * wordDict containing a list of non-empty words, determine if s can be segmented into a
 * space-separated sequence of one or more dictionary words. You may assume the dictionary does not
 * contain duplicate words.
 *
 * <p>For example, given s = "leetcode", dict = ["leet", "code"].
 *
 * <p>Return true because "leetcode" can be segmented as "leet code".
 */
public class WordBreak {
    public static void main(String[] args) {
        String s = "leetcode";
        List<String> dict = new ArrayList<>(Arrays.asList("leet", "code"));
        boolean res = new WordBreak().wordBreak(s, dict);
        System.out.println(res);
    }

    public boolean wordBreak(String s, List<String> dict) {
        int n = s.length();

        boolean[] dp = new boolean[n + 1];
        dp[0] = true;

        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < i; j++) {
                String tmp = s.substring(j, i);
                if (dp[j] && dict.contains(tmp)) {
                    dp[i] = true;
                }
            }
        }
        return dp[n];
    }

}
