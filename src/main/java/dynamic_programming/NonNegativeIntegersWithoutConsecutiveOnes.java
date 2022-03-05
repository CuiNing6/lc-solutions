package dynamic_programming;

/**
 * Created by cuining8 on 03/05/2022 Given a positive integer n, find the number of
 * non-negative integers less than or equal to n, whose binary representations do NOT contain
 * consecutive ones.
 *
 * <p>Example 1: Input: 5 Output: 5 Explanation: Here are the non-negative integers <= 5 with their
 * corresponding binary representations: 0 : 0 1 : 1 2 : 10 3 : 11 4 : 100 5 : 101 Among them, only
 * integer 3 disobeys the rule (two consecutive ones) and the other 5 satisfy the rule. Note: 1 <= n
 * <= 109
 *
 * <p>Solution: O(1) (30 ^ 2) For each bit we can set either '0' or '1' starting from index i to 0,
 * if we set 0 then the next bit i + 1 can be either set to 0 or 1 but, if we set it to 1 then the
 * next bit at position i + 1 can only be 0 because two consecutive 1s are invalid. This gives us a
 * general dp formula DP[0][i] = DP[0][i + 1] + DP[1][i + 1] for bit 0 and similarly DP[1][i] =
 * DP[0][i + 1].
 *
 * <p>Lets consider an example with number = 4 (binary representation is 100). Now, the above
 * approach would calculate all possible number ranging from 0 (000) -> 7 (111), lets say the count
 * is x. But, we actually want to restrict until only 100. Therefore we have to calculate all valid
 * states starting from 100 until 111 and lets say this is y. Now, the answer would be x - y + 1.
 * Adding 1 here because the state 100 (which is a valid state) would be counted twice in x and also
 * in y. For cases where a binary representation of given N is like 1100 we have to find a max
 * possible valid state which occurs just before 1100 which in this case is 1010 and now calculate y
 * starting from 1010 to 1111.
 */
public class NonNegativeIntegersWithoutConsecutiveOnes {
}
