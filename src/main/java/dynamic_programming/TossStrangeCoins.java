package dynamic_programming;

/**
 * Created by cuining8 on 03/05/2022 You have some coins. The i-th coin has a probability
 * prob[i] of facing heads when tossed.
 *
 * <p>Return the probability that the number of coins facing heads equals target if you toss every
 * coin exactly once.
 *
 * <p>Example 1:
 *
 * <p>Input: prob = [0.4], target = 1 Output: 0.40000 Example 2:
 *
 * <p>Input: prob = [0.5,0.5,0.5,0.5,0.5], target = 0 Output: 0.03125
 */
public class TossStrangeCoins {
    public static void main(String[] args) {
        double[] prob = {0.5,0.5,0.5,0.5,0.5};
        int target = 0;
        double res = new TossStrangeCoins().tossStrangeCoins(prob, target);

        System.out.println(res);
    }


    public double tossStrangeCoins(double[] prob, int target) {
        int n = prob.length;
        double[][] dp = new double[n][target+1];
        dp[0][0] = 1-prob[0];
        if (target >= 1) {
            dp[0][1] = prob[0];
        }

        for (int i = 1; i < n; i++) {
            for (int j = 0; j <= target; j++) {
                if (j==0) {
                    dp[i][j] = dp[i-1][0] * (1-prob[i]);
                } else {
                    dp[i][j] = dp[i-1][j] * (1-prob[i]) + dp[i-1][j-1] * prob[i];
                }
            }
        }

        return dp[n-1][target];

    }

}
