package dynamic_programming;

/**
 * Created by cuining8 on 03/05/2022. Initially on a notepad only one character 'A' is
 * present. You can perform two operations on this notepad for each step:
 *
 * <p>Copy All: You can copy all the characters present on the notepad (partial copy is not
 * allowed). Paste: You can paste the characters which are copied last time. Given a number n. You
 * have to get exactly n 'A' on the notepad by performing the minimum number of steps permitted.
 * Output the minimum number of steps to get n 'A'.
 *
 * <p>Example 1: Input: 3 Output: 3 Explanation: Intitally, we have one character 'A'. In step 1, we
 * use Copy All operation. In step 2, we use Paste operation to get 'AA'. In step 3, we use Paste
 * operation to get 'AAA'.
 *
 * <p>Note: The n will be in the range [1, 1000].
 */
public class TwoKeysKeyboard {
    public static void main(String[] args) {
        int n = 10;
        int res = new TwoKeysKeyboard().twoKeysKeyboard(n);
        System.out.println(res);
    }

    public int twoKeysKeyboard(int n) {
        int[] dp = new int[n+1];
        dp[1] = 0;

        for (int i = 2; i <= n; i++) {
            dp[i] = i;
            for (int j = i/2; j >= 1; j--) {
                if (i % j == 0) {
                    dp[i] = dp[j] + i / j;
                    break;
                }
            }
        }
        return dp[n];
    }
}
