package dynamic_programming;

/**
 * Created by cuining8 on 03/03/2022. You are a professional robber planning to rob houses along a
 * street. Each house has a certain amount of money stashed, the only constraint stopping you from
 * robbing each of them is that adjacent houses have security system connected and it will
 * automatically contact the police if two adjacent houses were broken into on the same night.
 *
 * <p>Given a list of non-negative integers representing the amount of money of each house,
 * determine the maximum amount of money you can rob tonight without alerting the police.
 * input [2,7,9,3,1] output 12
 */
public class HouseRobber {
    public static void main(String[] args) {
        int[] nums = {2,7,9,3,1};
        int res = new HouseRobber().houseRobber(nums);
        System.out.println(res);
    }

    public int houseRobber(int[] nums) {
        int[] res = new int[nums.length];
        int result = 0;

        if (nums.length == 1) {
            return nums[0];
        }

        for (int i = 0; i < nums.length; i++) {
            if (i == 0 || i == 1) {
                res[i] = nums[i];
            } else {
                res[i] = res[i-2] + nums[i];
            }
        }
        result = Math.max(res[nums.length-1],res[nums.length-2]);
        return result;
    }



















}
