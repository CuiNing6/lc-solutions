package Array;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by cuining8 on 02/15/2022
 *
 * <p>For a non-negative integer X, the array-form of X is an array of its digits in left to right
 * order. For example, if X = 1231, then the array form is [1,2,3,1].
 *
 * <p>Given the array-form A of a non-negative integer X, return the array-form of the integer X+K.
 *
 * <p>Example 1:
 *
 * <p>Input: A = [1,2,0,0], K = 34 Output: [1,2,3,4] Explanation: 1200 + 34 = 1234 Example 2:
 *
 * <p>Input: A = [2,7,4], K = 181 Output: [4,5,5] Explanation: 274 + 181 = 455 Example 3:
 *
 * <p>Input: A = [2,1,5], K = 806 Output: [1,0,2,1] Explanation: 215 + 806 = 1021 Example 4:
 *
 * <p>Input: A = [9,9,9,9,9,9,9,9,9,9], K = 1 Output: [1,0,0,0,0,0,0,0,0,0,0] Explanation:
 * 9999999999 + 1 = 10000000000
 *
 * <p>Note：
 *
 * <p>1 <= A.length <= 10000 0 <= A[i] <= 9 0 <= K <= 10000 If A.length > 1, then A[0] != 0
 *
 * <p>Solution: O(N) use BigInteger to add long numbers
 */
public class AddToArrayFormOfInteger {
    public static void main(String[] args) {
        int[] nums = {2,1,5};
        int K = 806;
        AddToArrayFormOfInteger addToArrayFormOfInteger = new AddToArrayFormOfInteger();
        List<Integer> res = addToArrayFormOfInteger.addToArrayFormOfInteger(nums, K);
        System.out.println(res);
    }


    public List<Integer> addToArrayFormOfInteger(int[] nums, int K) {
        List<Integer> res = new ArrayList<>();

        int index = nums.length-1, carry = 0;

        while (index >= 0 || carry == 1 || K > 0) {
            int a = index < 0 ? 0 : nums[index--];
            int b = K - (K / 10) * 10;

            K = K / 10;

            int s = a + b + carry;
            carry = s/10;
            res.add(0,s-carry*10);
        }

        return res;
    }








}
