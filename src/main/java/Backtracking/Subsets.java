package Backtracking;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by cuining8 on 02/10/2022. Given a set of distinct integers, nums, return all
 * possible subsets.
 *
 * <p>Note: The solution set must not contain duplicate subsets.
 *
 * <p>For example, If nums = [1,2,3], a solution is:
 *
 * <p>[ [3], [1], [2], [1,2,3], [1,3], [2,3], [1,2], [] ]
 */
public class Subsets {
    public static void main(String[] args) {
        int[] nums = new int[]{1, 2, 3};
        Subsets subsets = new Subsets();
        List<List<Integer>> res = subsets.subsets(nums);
        System.out.println(res);
    }

    public List<List<Integer>> subsets (int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> r = new ArrayList<>();
        backtracking(res, nums, 0, r);
        return res;
    }

    public void backtracking (List<List<Integer>> res, int[] nums, int i, List<Integer> r) {
        res.add(new ArrayList<Integer>(r));
        for (int j=i; j<nums.length; j++) {
            r.add(nums[j]);
            backtracking(res, nums, i+1, r);
            r.remove(r.size()-1);
        }
    }
}
