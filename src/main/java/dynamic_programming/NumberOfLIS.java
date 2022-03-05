package dynamic_programming;

/**
 * Created by cuining8 on 03/05/2022. Given an unsorted array of integers, find the
 * number of longest increasing subsequence.
 *
 * <p>Example 1: Input: [1,3,5,4,7] Output: 2 Explanation: The two longest increasing subsequence
 * are [1, 3, 4, 7] and [1, 3, 5, 7]. Example 2: Input: [2,2,2,2,2] Output: 5 Explanation: The
 * length of longest continuous increasing subsequence is 1, and there are 5 subsequences' length is
 * 1, so output 5. Note: Length of the given array will be not exceed 2000 and the answer is
 * guaranteed to be fit in 32-bit signed int.
 *
 * <p>Solution O(n ^ 2) compute the LIS and save the results in length also save the max length of
 * LIS in maxVal. Calculate the count as below
 *
 * <p>For every pair of (i, j) count[i] = count[i] + count[j] where length[i] == length[j] + 1 and
 * nums[j] < nums[i]
 *
 * <p>sum-up the count for every length where length[i] == maxVal
 */
public class NumberOfLIS {
}
