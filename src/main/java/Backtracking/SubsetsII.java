package Backtracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by cuining8 on 02/10/2022. Given a collection of integers that might contain
 * duplicates, nums, return all possible subsets.
 *
 * <p>Note: The solution set must not contain duplicate subsets.
 *
 * <p>For example, If nums = [1,2,2], a solution is:
 *
 * <p>[ [2], [1], [1,2,2], [2,2], [1,2], [] ]
 */
public class SubsetsII {
    public static void main(String[] args) {
        int[] nums = new int[]{1,2,2};
        SubsetsII subsetsII = new SubsetsII();
        List<List<Integer>> res = subsetsII.subsetsII(nums);
        System.out.println(res);
    }

    public List<List<Integer>> subsetsII(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> tmp = new ArrayList<>();
        backtracking(res, nums, 0, tmp);
        return res;
    }

    private void backtracking (List<List<Integer>> res, int[] nums, int i, List<Integer> tmp) {
        res.add(new ArrayList<>(tmp));

        for (int k=i; k<nums.length;k++) {
            tmp.add(nums[k]);
            backtracking(res, nums, k+1, tmp);
            tmp.remove(tmp.size()-1);
        }
        }
}
