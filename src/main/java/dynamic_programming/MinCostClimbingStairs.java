package dynamic_programming;

/**
 * Created by cuining8 on 03/05/2022. On a staircase, the i-th step has some non-negative
 * cost cost[i] assigned (0 indexed).
 *
 * <p>Once you pay the cost, you can either climb one or two steps. You need to find minimum cost to
 * reach the top of the floor, and you can either start from the step with index 0, or the step with
 * index 1.
 *
 * <p>Example 1: Input: cost = [10, 15, 20] Output: 15 Explanation: Cheapest is start on cost[1],
 * pay that cost and go to the top. Example 2: Input: cost = [1, 100, 1, 1, 1, 100, 1, 1, 100, 1]
 * Output: 6 Explanation: Cheapest is start on cost[0], and only step on 1s, skipping cost[3]. Note:
 * cost will have a length in the range [2, 1000]. Every cost[i] will be an integer in the range [0,
 * 999].
 *
 * <p>Solution: O(N) At every step there are two options, either cost[i] + cost[i + 1] or cost[i] +
 * cost[i + 2]
 */
public class MinCostClimbingStairs {
    public static void main(String[] args) {
        int[] cost = {10, 15, 20};
        int res = new MinCostClimbingStairs().minCostClimbingStairs(cost);
        System.out.println(res);
    }

    public int minCostClimbingStairs(int[] cost) {
        int n = cost.length;

        if(n == 0){
            return 0;
        }

        if (n == 1) {
            return cost[0];
        }

        if (n == 2) {
            return Math.min(cost[0],cost[1]);
        }

        int[] dp = new int[n+2];
        dp[0] = cost[0];
        dp[1] = cost[1];

        for (int i = 2; i < n; i++) {
            dp[i] = cost[i] + Math.min(dp[i-1], dp[i-2]);
        }
        return Math.min(dp[n-1],dp[n-2]);
    }
}
