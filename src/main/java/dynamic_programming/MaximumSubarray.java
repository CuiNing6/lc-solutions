package dynamic_programming;

import java.util.Arrays;
import java.util.Collections;

/**
 * Created by cuining8 on 03/05/2022. Find the contiguous subarray within an array
 * (containing at least one number) which has the largest sum.
 *
 * <p>For example, given the array [-2,1,-3,4,-1,2,1,-5,4], the contiguous subarray [4,-1,2,1] has
 * the largest sum = 6.
 */
public class MaximumSubarray {
    public static void main(String[] args) {
        int[] array = {-2,1,-3,4,-1,2,1,-5,4};
        int res = new MaximumSubarray().maximumSubarray(array);
        System.out.println(res);
    }

    public int maximumSubarray(int[] array) {
        int n = array.length;
        int[] dp = new int[n];
        dp[0] = array[0];

        for (int i = 1; i < n; i++) {
            if (array[i] > array[i] + dp[i-1]) {
                dp[i] = array[i];
            } else {
                dp[i] = array[i] + dp[i-1];
            }
        }
        return Arrays.stream(dp).max().getAsInt();
    }
}
