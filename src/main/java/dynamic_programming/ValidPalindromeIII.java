package dynamic_programming;

/**
 * Created by cuining8 on 03/05/2022 Given a string s and an integer k, find out if the
 * given string is a K-Palindrome or not.
 *
 * <p>A string is K-Palindrome if it can be transformed into a palindrome by removing at most k
 * characters from it.
 *
 * <p>Example 1:
 *
 * <p>Input: s = "abcdeca", k = 2 Output: true Explanation: Remove 'b' and 'e' characters.
 *
 * <p>Constraints:
 *
 * <p>1 <= s.length <= 1000 s has only lowercase English letters. 1 <= k <= s.length
 */
public class ValidPalindromeIII {
    public static void main(String[] args) {
        String s = "abcdeca";
        int k = 2;

        int res = new ValidPalindromeIII().validPalindromeIII(s);

        boolean result = s.length() - res <= k;

        System.out.println(result);
    }

    public int validPalindromeIII(String s) {
        int n = s.length();
        int[][] dp = new int[n][n];

        for (int i = n-1; i >= 0; i--) {
            dp[i][i] = 1;
            for (int j = i + 1; j < n; j++) {
                if (s.charAt(i) == s.charAt(j)) {
                    dp[i][j] = dp[i+1][j-1] + 2;
                }else {
                    dp[i][j] = Math.max(dp[i+1][j], dp[i][j-1]);
                }
            }
        }
        return dp[0][n-1];
    }
}
