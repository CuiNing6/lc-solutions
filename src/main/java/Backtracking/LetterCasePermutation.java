package Backtracking;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by cuining8 on 02/10/2022. Given a string S, we can transform every letter
 * individually to be lowercase or uppercase to create another string. Return a list of all possible
 * strings we could create.
 *
 * <p>Examples: Input: S = "a1b2" Output: ["a1b2", "a1B2", "A1b2", "A1B2"]
 *
 * <p>Input: S = "3z4" Output: ["3z4", "3Z4"]
 *
 * <p>Input: S = "12345" Output: ["12345"] Note:
 *
 * <p>S will be a string with length at most 12. S will consist only of letters or digits.
 *
 * <p>Solution: O(N x 2 ^ N) Backtrack and generate all possible combinations.
 */
public class LetterCasePermutation {
    public static void main(String[] args) {
        String s = "a1b2";
        LetterCasePermutation letterCasePermutation = new LetterCasePermutation();
        List<String> res = letterCasePermutation.letterCasePermutation(s);
        System.out.println(res);
    }

    public List<String> letterCasePermutation(String s) {
        List<String> res = new ArrayList<>();
        backtracking(s, res, 0, "");
        return res;
    }

    public void backtracking(String s, List<String> list, int i, String r) {
        if (s.length() == i) {
            list.add(r);
        } else {
            if (Character.isAlphabetic(s.charAt(i))) {
                backtracking(s, list, i+1, r+s.charAt(i));
                if(Character.isLowerCase(s.charAt(i))) {
                    backtracking(s,list,i+1, r+Character.toUpperCase(s.charAt(i)));
                } else {
                    backtracking(s,list,i+1, r+Character.toLowerCase(s.charAt(i)));
                }
            } else {
                backtracking(s, list, i+1, r+s.charAt(i));
            }
        }
    }
}
