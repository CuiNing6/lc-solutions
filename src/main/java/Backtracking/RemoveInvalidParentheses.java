package Backtracking;

/**
 * Created by cuining8 on 02/10/2022. Remove the minimum number of invalid parentheses in
 * order to make the input string valid. Return all possible results.
 *
 * <p>Note: The input string may contain letters other than the parentheses ( and ).
 *
 * <p>Examples: "()())()" -> ["()()()", "(())()"] "(a)())()" -> ["(a)()()", "(a())()"] ")(" -> [""]
 *
 * <p>Solution: O(N x 2 ^ N) backtrack and generate all combination of unique parentheses. Keep
 * track of a counter which keeps track of validity of parentheses. Prune the search space by
 * checking for validity of parenthesis on the fly by checking if the counter goes below 0 in which
 * case a valid combination is impossible and also keep track of selected count and total count of
 * characters in each state to check if the difference between them is above the min threshold.
 */
public class RemoveInvalidParentheses {
}
