package Backtracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by cuining on 21/01/2022. Given a collection of candidate numbers (C) and a
 * target number (T), find all unique combinations in C where the candidate numbers sums to T.
 *
 * <p>Each number in C may only be used once in the combination.
 *
 * <p>Note: All numbers (including target) will be positive integers. The solution set must not
 * contain duplicate combinations. For example, given candidate set [10, 1, 2, 7, 6, 1, 5] and
 * target 8, A solution set is: [ [1, 7], [1, 2, 5], [2, 6], [1, 1, 6] ]
 */
public class CombinationSumII {
    public static void main(String[] args) {
        int[] candidate = {10, 1, 2, 7, 6, 1, 5};
        int target = 8;

        List<List<Integer>> result = new CombinationSumII().combinationSumII(candidate, target);

        System.out.println(Arrays.toString(result.toArray()));
    }

    public List<List<Integer>> combinationSumII(int[] candidate, int target) {
        Arrays.sort(candidate);
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> row = new ArrayList<>();
        combination(0,candidate,target,row,result);
        return result;
    }

    public void combination(int i, int[] candidate, int target, List<Integer> row, List<List<Integer>> result) {
        if (target==0) {
            result.add(new ArrayList<>(row));
        } else if (target > 0) {
            for (int j = i, l = candidate.length; j< l; j++) {
                if (j>i && candidate[j] == candidate[j-1]) {
                    continue;
                }
                row.add(candidate[j]);
                combination(j+1,candidate,target-candidate[j],row,result);
                row.remove(row.size()-1);
            }
        }

    }


}
