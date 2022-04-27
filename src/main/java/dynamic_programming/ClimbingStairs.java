package dynamic_programming;

/**
 * Created by cuining8 on 03/05/2022. You are climbing a stair case. It takes n steps to
 * reach to the top.
 *
 * <p>Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the
 * top?
 *
 * <p>Note: Given n will be a positive integer.
 */
public class ClimbingStairs {
    public static void main(String[] args) {
        int n = 4;
        ClimbingStairs climbingStairs = new ClimbingStairs();
        int res = climbingStairs.climbingStairs(n);
        System.out.println(res);
    }

    public int climbingStairs(int n) {
        if (n==0|n==1|n==2) {
            return n;
        }

        int[] dp = new int[n+1];

        dp[0] = 0;
        dp[1] = 1;
        dp[2] = 2;

        for (int i = 3; i < n+1; i++) {
            dp[i] = dp[i-1] + dp[i-2];
        }

        return dp[n];
    }
}
