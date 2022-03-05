package dynamic_programming;

/**
 * Created by cuining8 on 03/05/2022 You have a number of envelopes with widths and
 * heights given as a pair of integers (w, h). One envelope can fit into another if and only if both
 * the width and height of one envelope is greater than the width and height of the other envelope.
 *
 * <p>What is the maximum number of envelopes can you Russian doll? (put one inside other)
 *
 * <p>Note: Rotation is not allowed.
 *
 * <p>Example:
 *
 * <p>Input: [[5,4],[6,4],[6,7],[2,3]] Output: 3 Explanation: The maximum number of envelopes you
 * can Russian doll is 3 ([2,3] => [5,4] => [6,7]).
 *
 * <p>Solution: O(N ^ 2) Sort the envelopes based on increasing order of area and for each envelope
 * iterate through all the possible envelopes which are smaller than that the current envelope and
 * check the maximum possible envelopes which an be russian dolled.
 */
public class RussianDollEnvelopes {
}
