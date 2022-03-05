package dynamic_programming;

/**
 * Created by cuining8 on 03/05/2022. Given an array which consists of non-negative
 * integers and an integer m, you can split the array into m non-empty continuous subarrays. Write
 * an algorithm to minimize the largest sum among these m subarrays.
 *
 * <p>Note: If n is the length of array, assume the following constraints are satisfied:
 *
 * <p>1 ≤ n ≤ 1000 1 ≤ m ≤ min(50, n) Examples:
 *
 * <p>Input: nums = [7,2,5,10,8] m = 2
 *
 * <p>Output: 18
 *
 * <p>Explanation: There are four ways to split nums into two subarrays. The best way is to split it
 * into [7,2,5] and [10,8], where the largest sum among the two subarrays is only 18.
 *
 * <p>Solution O(n ^ 2 * k) Build a bottom up min-max dp table for each sub-array ranging from n ->
 * 0
 */
public class SplitArrayLargestSum {
}
