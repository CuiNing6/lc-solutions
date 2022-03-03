package dynamic_programming;

/**
 * Created by cuining8 on 03/03/2022. Find the contiguous subarray within an array
 * (containing at least one number) which has the largest product.
 *
 * <p>For example, given the array [2,3,-2,4], the contiguous subarray [2,3] has the largest product
 * = 6.
 */
public class MaximumProductSubarray {
    public static void main(String[] args) {
        int[] nums = {2,3,4,-2,4};
        int res = new MaximumProductSubarray().maximumProductSubarray(nums);
        System.out.println(res);
    }

    public int maximumProductSubarray(int[] nums) {
        if (nums.length == 1) {
            return nums[0];
        }

        int min = nums[0];
        int max = nums[0];

        int res = max;

        for (int i = 1; i < nums.length; i++) {
            int preMin = min;
            int preMax = max;

            min = Math.min(nums[i], Math.min(nums[i]*preMin, nums[i]*preMax));
            max = Math.max(nums[i], Math.max(nums[i]*preMin, nums[i]*preMax));

            res = Math.max(max, res);
        }
        return res;
    }













}
