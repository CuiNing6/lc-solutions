package dynamic_programming;

/**
 * Created by cuining8 on 02/18/2022. Given n balloons, indexed from 0 to n-1. Each
 * balloon is painted with a number on it represented by array nums. You are asked to burst all the
 * balloons. If the you burst balloon i you will get nums[left] * nums[i] * nums[right] coins. Here
 * left and right are adjacent indices of i. After the burst, the left and right then becomes
 * adjacent.
 *
 * <p>Find the maximum coins you can collect by bursting the balloons wisely.
 *
 * <p>Note: (1) You may imagine nums[-1] = nums[n] = 1. They are not real therefore you can not
 * burst them. (2) 0 ≤ n ≤ 500, 0 ≤ nums[i] ≤ 100
 *
 * <p>Example:
 *
 * <p>Given [3, 1, 5, 8]
 *
 * <p>Return 167
 *
 * <p>nums = [3,1,5,8] --> [3,5,8] --> [3,8] --> [8] --> [] coins = 3*1*5 + 3*5*8 + 1*3*8 + 1*8*1 =
 * 167
 *
 * <p>Solution: O(N ^ 3) The recursive top-down dp memorization solution is based on the idea where
 * each balloon is considered as the last balloon to be burst. For the above example 1,3,1,5,8,1 (1
 * included at either end to indicate boundary) each balloon starting from 3 until 8 is chosen each
 * time as a the last balloon to be burst using the boundary 1 on either side. So, for the first
 * iteration the result is calculated as 3*1(left boundary)*1(right boundary) + dp(1, 3)
 * (left-sub-problem having 1 and 3 as the boundary) + dp(3, 1) (right-sub-problem having 3 and 1 as
 * the boundary)
 */
public class BurstBalloons {
}
