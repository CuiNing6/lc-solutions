package dynamic_programming;

/**
 * Created by cuining8 on 03/05/2022. After robbing those houses on that street, the thief has found
 * himself a new place for his thievery so that he will not get too much attention. This time, all
 * houses at this place are arranged in a circle. That means the first house is the neighbor of the
 * last one. Meanwhile, the security system for these houses remain the same as for those in the
 * previous street.
 *
 * <p>Given a list of non-negative integers representing the amount of money of each house,
 * determine the maximum amount of money you can rob tonight without alerting the police.
 * 4,5,6,8,3 -> 13
 * 1,5,4,2 -> 7
 */
public class HouseRobberII {
    public static void main(String[] args) {
        int[] nums = {4,5,6,8,3};
        int res = new HouseRobberII().houseRobberII(nums);
        System.out.println(res);
    }

    public int houseRobberII(int[] nums) {
        if (nums.length == 0){
            return 0;
        }else if (nums.length == 1) {
            return nums[0];
        }else {
            return Math.max(rob(nums, 0, nums.length-2),rob(nums, 1, nums.length-1));
        }
    }

    public int rob(int[] nums, int start, int end) {
        int[] dp = new int[nums.length];
        dp[start] = nums[start];
        dp[start+1] = nums[start+1];
        for (int i = start+2; i <= end; i++) {
            dp[i] = nums[i] + dp[i-2];
        }
        return Math.max(dp[nums.length-1],dp[nums.length-2]);
    }
}
