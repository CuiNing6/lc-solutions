package Backtracking;

/**
 * Created by cuining8 on 02/10/2022 Remember the story of Little Match Girl? By now, you
 * know exactly what matchsticks the little match girl has, please find out a way you can make one
 * square by using up all those matchsticks. You should not break any stick, but you can link them
 * up, and each matchstick must be used exactly one time.
 *
 * <p>Your input will be several matchsticks the girl has, represented with their stick length. Your
 * output will either be true or false, to represent whether you could make one square using all the
 * matchsticks the little match girl has.
 *
 * <p>Example 1: Input: [1,1,2,2,2] Output: true
 *
 * <p>Explanation: You can form a square with length 2, one side of the square came two sticks with
 * length 1. Example 2: Input: [3,3,3,3,4] Output: false
 *
 * <p>Explanation: You cannot find a way to form a square with all the matchsticks. Note: The length
 * sum of the given matchsticks is in the range of 0 to 10^9. The length of the given matchstick
 * array will not exceed 15.
 *
 * <p>Solution: O(2 ^ N): Generate a power set of all combination of numbers for the given array
 * which sum up to the length of a side of square. Now, to check if a square can be made using all
 * the sides sticks of different length, generate a hash for for each of the combination which was
 * generated in the previous step. The hash function should be such that it uses unique indexes of
 * each match stick. If 4 different hash values are formed using unique and all indices then a
 * square is possible.
 */

public class MatchsticksToSquare {
}
