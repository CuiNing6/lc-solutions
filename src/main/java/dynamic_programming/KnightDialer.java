package dynamic_programming;

/**
 * Created by cuining8 on 03/05/2022 A chess knight can move as indicated in the chess
 * diagram below:
 *
 * <p>.
 *
 * <p>This time, we place our chess knight on any numbered key of a phone pad (indicated above), and
 * the knight makes N-1 hops. Each hop must be from one key to another numbered key.
 *
 * <p>Each time it lands on a key (including the initial placement of the knight), it presses the
 * number of that key, pressing N digits total.
 *
 * <p>How many distinct numbers can you dial in this manner?
 *
 * <p>Since the answer may be large, output the answer modulo 10^9 + 7.
 *
 * <p>Example 1:
 *
 * <p>Input: 1 Output: 10 Example 2:
 *
 * <p>Input: 2 Output: 20 Example 3:
 *
 * <p>Input: 3 Output: 46
 *
 * <p>Note:
 *
 * <p>1 <= N <= 5000
 *
 * <p>Solution: O(N x 4 x 3) Visit all different possible states and sum up the total possible
 * moves. Cache the states to avoid recalculating.
 */
public class KnightDialer {
}
