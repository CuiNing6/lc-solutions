package Backtracking;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by cuining8 on 02/10/2022. Given a digit string, return all possible letter
 * combinations that the number could represent.
 *
 * <p>A mapping of digit to letters (just like on the telephone buttons) is given below. 1 2(abc)
 * 3(def) 4(ghi) 5(jkl) 6(mno) 7(pqrs) 8(tuv) 9(wxyz)
 *
 * <p>
 *
 * <p>Input:Digit string "23" Output: ["ad", "ae", "af", "bd", "be", "bf", "cd", "ce", "cf"]. Note:
 * Although the above answer is in lexicographical order, your answer could be in any order you
 * want.
 */

public class LetterPhoneNumber {
    private final String[] NUMBER_ALPHA = {
            "", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"
    };

    public static void main(String[] args) {
        String digit = "23";

        LetterPhoneNumber letterPhoneNumber = new LetterPhoneNumber();
        List<String> res = letterPhoneNumber.letterPhoneNumber(digit);

        System.out.println(res);
    }

    public List<String> letterPhoneNumber(String digit) {
        if (digit==null || digit.isEmpty() || digit.contains("1") || digit.contains("0")) {
            return new ArrayList<>();
        }

        List<String> res = new ArrayList<>();
        backtracking(digit, res, 0, "");
        return res;
    }

    public void backtracking(String digit, List<String> list, int i, String r){
        if (digit.length() == i) {
            list.add(r);
        } else {
            String str = NUMBER_ALPHA[Integer.parseInt(String.valueOf(digit.charAt(i)))];
            for (int j = 0; j < str.length(); j++) {
                backtracking(digit, list, i+1, r+str.charAt(j));
            }
        }

    }
}
