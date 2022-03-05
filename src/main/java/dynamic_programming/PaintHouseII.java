package dynamic_programming;

/**
 * Created by cuining8 on 03/05/2022. There are a row of n houses, each house can be
 * painted with one of the k colors. The cost of painting each house with a certain color is
 * different. You have to paint all the houses such that no two adjacent houses have the same color.
 *
 * <p>The cost of painting each house with a certain color is represented by a n x k cost matrix.
 * For example, costs[0][0] is the cost of painting house 0 with color 0; costs[1][2] is the cost of
 * painting house 1 with color 2, and so on... Find the minimum cost to paint all houses.
 *
 * <p>Note: All costs are positive integers.
 *
 * <p>Follow up: Could you solve it in O(nk) runtime?
 *
 * <p>Solution: Worst case run-time complexity of O(n x k) : Perform a prefix and postfix sum and
 * maintain a auxiliary array to keep track of prefix and post-fix sum. Perform a bottom-up dp to
 * calculate the final result. DP[i][j] = DP[i][j] + Min(LeftPrefixSum[i + 1][j], RightPrefixSum[i +
 * 1][j])
 */
public class PaintHouseII {
}
