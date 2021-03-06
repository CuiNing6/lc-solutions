package dynamic_programming;

/**
 * Created by cuining8 on 03/05/2022 Alex and Lee play a game with piles of stones. There
 * are an even number of piles arranged in a row, and each pile has a positive integer number of
 * stones piles[i].
 *
 * <p>The objective of the game is to end with the most stones. The total number of stones is odd,
 * so there are no ties.
 *
 * <p>Alex and Lee take turns, with Alex starting first. Each turn, a player takes the entire pile
 * of stones from either the beginning or the end of the row. This continues until there are no more
 * piles left, at which point the person with the most stones wins.
 *
 * <p>Assuming Alex and Lee play optimally, return True if and only if Alex wins the game.
 *
 * <p>Example 1:
 *
 * <p>Input: [5,3,4,5] Output: true Explanation: Alex starts first, and can only take the first 5 or
 * the last 5. Say he takes the first 5, so that the row becomes [3, 4, 5]. If Lee takes 3, then the
 * board is [4, 5], and Alex takes 5 to win with 10 points. If Lee takes the last 5, then the board
 * is [3, 4], and Alex takes 4 to win with 9 points. This demonstrated that taking the first 5 was a
 * winning move for Alex, so we return true.
 *
 * <p>Note:
 *
 * <p>2 <= piles.length <= 500 piles.length is even. 1 <= piles[i] <= 500 sum(piles) is odd.
 *
 * <p>Solution: O(N ^ 2) Each state can be considered as State = (total stones left, player's turn).
 * Do a dfs on each state and memoize the result in order not to recalculate. When all the stones
 * are exhausted - Alex wins if the total collected stones by her is greater than total collected by
 * Lee
 */
public class StoneGame {
}
