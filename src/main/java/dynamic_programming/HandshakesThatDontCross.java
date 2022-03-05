package dynamic_programming;

/**
 * Created by cuining8 on 03/05/2022 You are given an even number of people num_people
 * that stand around a circle and each person shakes hands with someone else, so that there are
 * num_people / 2 handshakes total.
 *
 * <p>Return the number of ways these handshakes could occur such that none of the handshakes cross.
 *
 * <p>Since this number could be very big, return the answer mod 10^9 + 7
 *
 * <p>Example 1:
 *
 * <p>Input: num_people = 2 Output: 1 Example 2:
 *
 * <p>Input: num_people = 4 Output: 2 Explanation: There are two ways to do it, the first way is
 * [(1,2),(3,4)] and the second one is [(2,3),(4,1)]. Example 3:
 *
 * <p>Input: num_people = 6 Output: 5 Example 4:
 *
 * <p>Input: num_people = 8 Output: 14
 *
 * <p>Constraints:
 *
 * <p>2 <= num_people <= 1000 num_people % 2 == 0
 */
public class HandshakesThatDontCross {
}
