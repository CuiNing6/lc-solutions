package dynamic_programming;

/**
 * Created by cuining8 on 03/05/2022. A message containing letters from A-Z is being
 * encoded to numbers using the following mapping way:
 *
 * <p>'A' -> 1 'B' -> 2 ... 'Z' -> 26 Beyond that, now the encoded string can also contain the
 * character '*', which can be treated as one of the numbers from 1 to 9.
 *
 * <p>Given the encoded message containing digits and the character '*', return the total number of
 * ways to decode it.
 *
 * <p>Also, since the answer may be very large, you should return the output mod 109 + 7.
 *
 * <p>Example 1: Input: "*" Output: 9 Explanation: The encoded message can be decoded to the string:
 * "A", "B", "C", "D", "E", "F", "G", "H", "I". Example 2: Input: "1*" Output: 9 + 9 = 18 Note: The
 * length of the input string will fit in range [1, 105]. The input string will only contain the
 * character '*' and digits '0' - '9'.
 *
 * <p>Solution: O(n) consider each digit and a pair of digits and perform a cartesian product to
 * calculate the total number of ways. A pair of digits are to be considered only if their combined
 * value does not exceed 26. Corner cases with combination of * and 0s can be tricky
 */
public class DecodeWaysII {
}
