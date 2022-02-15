package Backtracking;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by cuining8 on 02/10/2022. Given a collection of numbers that might contain
 * duplicates, return all possible unique permutations.
 *
 * <p>For example, [1,1,2] have the following unique permutations: [ [1,1,2], [1,2,1], [2,1,1] ]
 */
public class PermutationsII {
    public static void main(String[] args) {
        int[] nums = {1,1,2};
        PermutationsII permutationsII = new PermutationsII();
        List<List<Integer>> res = permutationsII.permutationsII(nums);
        System.out.println(res);
    }

    public List<List<Integer>> permutationsII(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> r = new ArrayList<>();
        boolean[] flag = new boolean[nums.length];
        backtracking(nums, r, flag, res);
        return res;
    }

    public void backtracking(int[] nums, List<Integer> r, boolean[] flag, List<List<Integer>> res) {
        if (r.size() == nums.length) {
            if (!res.contains(new ArrayList<>(r))) {
                res.add(new ArrayList<>(r));
            }
        } else {
            for (int i = 0; i < nums.length; i++) {
                if(!flag[i]) {
                    flag[i] = true;
                    r.add(nums[i]);
                    backtracking(nums, r, flag, res);
                    r.remove(r.size()-1);
                    flag[i] = false;
                }
            }
        }
    }


}
