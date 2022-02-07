package Backtracking;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by gouthamvidyapradhan on 05/12/2017. Given a string that contains only digits 0-9 and a
 * target value, return all possibilities to add binary operators (not unary) +, -, or * between the
 * digits so they evaluate to the target value.
 *
 * <p>Examples: "123", 6 -> ["1+2+3", "1*2*3"] "232", 8 -> ["2*3+2", "2+3*2"] "105", 5 ->
 * ["1*0+5","10-5"] "00", 0 -> ["0+0", "0-0", "0*0"] "3456237490", 9191 -> []
 *
 * <p>Solution: Backtrack and keep track of the total and product value. In case of + or - add/sub
 * curr to total and curr becomes the new product In case of * take difference of total and prod and
 * add (product of curr value with previous product and make this a new product for the next
 * iteration)
 *
 * <p>Worst-case time complexity can be O(n * (2^n-1))
 */
public class ExpressionAddOperators {
    public static void main(String[] args) {

    }

    public List<String> expressionAddOperators (String num, int target) {
        List<String> result = new ArrayList<>();

        return result;
    }

    public void backTrack() {

    }
}
