package dynamic_programming;

/**
 * Created by cuining8 on 03/05/2022 Given an integer n, your task is to count how many
 * strings of length n can be formed under the following rules:
 *
 * <p>Each character is a lower case vowel ('a', 'e', 'i', 'o', 'u') Each vowel 'a' may only be
 * followed by an 'e'. Each vowel 'e' may only be followed by an 'a' or an 'i'. Each vowel 'i' may
 * not be followed by another 'i'. Each vowel 'o' may only be followed by an 'i' or a 'u'. Each
 * vowel 'u' may only be followed by an 'a'. Since the answer may be too large, return it modulo
 * 10^9 + 7.
 *
 * <p>Example 1:
 *
 * <p>Input: n = 1 Output: 5 Explanation: All possible strings are: "a", "e", "i" , "o" and "u".
 * Example 2:
 *
 * <p>Input: n = 2 Output: 10 Explanation: All possible strings are: "ae", "ea", "ei", "ia", "ie",
 * "io", "iu", "oi", "ou" and "ua". Example 3:
 *
 * <p>Input: n = 5 Output: 68
 */
public class CountVowelsPermutation {
}
