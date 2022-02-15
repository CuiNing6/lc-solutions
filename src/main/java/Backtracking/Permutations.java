package Backtracking;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by cuining8 on 02/10/2022. Given a collection of distinct numbers, return all
 * possible permutations.
 *
 * <p>For example, [1,2,3] have the following permutations: [ [1,2,3], [1,3,2], [2,1,3], [2,3,1],
 * [3,1,2], [3,2,1] ]
 */
public class Permutations {
    public static void main(String[] args) {
        int[] nums = {1,2,3};
        Permutations permutations = new Permutations();
        List<List<Integer>> res = permutations.permutations(nums);
        System.out.println(res);
    }

    public List<List<Integer>> permutations(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> r = new ArrayList<>();
        boolean[] flag = new boolean[nums.length];
        backtracking(nums, r, res, flag);
        return res;
    }

    public void backtracking(int[] nums, List<Integer> r, List<List<Integer>> res, boolean[] flag) {
        if (r.size() == nums.length) {
            res.add(new ArrayList<>(r));
        } else {
            for (int k = 0; k < nums.length; k++) {
                if (!flag[k]) {
                    flag[k] = true;
                    r.add(nums[k]);
                    backtracking(nums, r, res, flag);
                    r.remove(r.size()-1);
                    flag[k] = false;
                }

            }
        }
    }


















}
