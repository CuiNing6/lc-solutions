package dynamic_programming;

/**
 * Created by cuining8 on 03/05/2022. Given a 2D binary matrix filled with 0's and 1's,
 * find the largest square containing only 1's and return its area.
 *
 * <p>For example, given the following matrix:
 *
 * <p>1 0 1 0 0 1 0 1 1 1 1 1 1 1 1 1 0 0 1 0 Return 4.
 *
 * <p>Solution: O(n * m) time and space complexity. Calculate the max length of a square using DP(i,
 * j) = min(DP[i - 1][j], DP[i][j - 1], DP[i - 1][j - 1]) + 1 Return the square of the answer.
 */
public class MaximalSquare {
}
