package dynamic_programming;

/**
 * Created by cuining8 on 03/05/2022.
 *
 * <p>In a given array nums of positive integers, find three non-overlapping subarrays with maximum
 * sum.
 *
 * <p>Each subarray will be of size k, and we want to maximize the sum of all 3*k entries.
 *
 * <p>Return the result as a list of indices representing the starting position of each interval
 * (0-indexed). If there are multiple answers, return the lexicographically smallest one.
 *
 * <p>Example: Input: [1,2,1,2,6,7,5,1], 2 Output: [0, 3, 5] Explanation: Subarrays [1, 2], [2, 6],
 * [7, 5] correspond to the starting indices [0, 3, 5]. We could have also taken [2, 1], but an
 * answer of [1, 3, 5] would be lexicographically larger. Note: nums.length will be between 1 and
 * 20000. nums[i] will be between 1 and 65535. k will be between 1 and floor(nums.length / 3).
 *
 * <p>Solution: O(N) solution by prefix and reverse-prefix sum First calculate max index for array
 * index k, then use this to calculate max index for two array indices j and k and again use this
 * result to calculate the final max index for i, j and k for the 3 arrays.
 */
public class MaxSum3SubArray {
}
