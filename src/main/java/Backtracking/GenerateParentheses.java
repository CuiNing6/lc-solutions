package Backtracking;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by cuining8 on 02/10/2022. Given n pairs of parentheses, write a function to
 * generate all combinations of well-formed parentheses.
 *
 * <p>For example, given n = 3, a solution set is:
 *
 * <p>[ "((()))", "(()())", "(())()", "()(())", "()()()" ]
 */

public class GenerateParentheses {
    public static void main(String[] args) {
        int n = 3;
        GenerateParentheses generateParentheses = new GenerateParentheses();
        List<String> res = generateParentheses.generateParentheses(n);
        System.out.println(res);
    }

    public List<String> generateParentheses(int n) {
        List<String> res = new ArrayList<>();
        backtracking("",res, 0,0,n);
        return res;
    }

    public void backtracking(String str, List<String> list, int open, int close, int n) {
        if (str.length() == 2*n) {
            list.add(str);
        } else {
            if (open < n) {
                backtracking(str.concat("("), list, open+1, close, n);
            }
            if (close < open) {
                backtracking(str.concat(")"), list, open, close+1, n);
            }

        }
    }

}
