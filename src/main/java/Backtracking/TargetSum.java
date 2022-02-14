package Backtracking;

/**
 * Created by cuining8 on 02/10/2022. You are given a list of non-negative integers, a1,
 * a2, ..., an, and a target, S. Now you have 2 symbols + and -. For each integer, you should choose
 * one from + and - as its new symbol.
 *
 * <p>Find out how many ways to assign symbols to make sum of integers equal to target S.
 *
 * <p>Example 1: Input: nums is [1, 1, 1, 1, 1], S is 3. Output: 5 Explanation:
 *
 * <p>-1+1+1+1+1 = 3 +1-1+1+1+1 = 3 +1+1-1+1+1 = 3 +1+1+1-1+1 = 3 +1+1+1+1-1 = 3
 *
 * <p>There are 5 ways to assign symbols to make the sum of nums be target 3. Note: The length of
 * the given array is positive and will not exceed 20. The sum of elements in the given array will
 * not exceed 1000. Your output answer is guaranteed to be fitted in a 32-bit integer.
 */
public class TargetSum {
    private static int res;

    public static void main(String[] args) {
        int[] nums = {1,1,1,1,1};
        int s = 3;
        res = 0;
        TargetSum targetSum = new TargetSum();
        targetSum.targetSum(nums, s);
        System.out.println(res);
    }

    public int targetSum(int[] nums, int s) {
        int sum = 0;
        backtracking(nums, s, sum, 0);
        return res;
    }

    public void backtracking(int[] nums, int s, int sum, int n) {
        if (n == nums.length) {
            if (sum == s) {
                res += 1;
        }
        } else {
            backtracking(nums, s, sum+nums[n], n+1);
            backtracking(nums, s, sum-nums[n], n+1);
        }
    }
}
