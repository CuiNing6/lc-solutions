package dynamic_programming;

/**
 * Created by cuining8 on 03/05/2022 Given several boxes with different colors
 * represented by different positive numbers. You may experience several rounds to remove boxes
 * until there is no box left. Each time you can choose some continuous boxes with the same color
 * (composed of k boxes, k >= 1), remove them and get k*k points. Find the maximum points you can
 * get.
 *
 * <p>Example 1: Input:
 *
 * <p>[1, 3, 2, 2, 2, 3, 4, 3, 1] Output: 23 Explanation: [1, 3, 2, 2, 2, 3, 4, 3, 1] ----> [1, 3,
 * 3, 4, 3, 1] (3*3=9 points) ----> [1, 3, 3, 3, 1] (1*1=1 points) ----> [1, 1] (3*3=9 points) ---->
 * [] (2*2=4 points) Note: The number of boxes n would not exceed 100.
 *
 * <p>Solution O(N ^ 4) For each sub-array [l, r] make a dp cache and calculate maximum of [l, i][1]
 * + [i + 1, r][1] or maximum of [l + 1, i - 1][n] + [i, r][1] where boxes[l] == boxes[i] where n is
 * the count of repetitions
 */
public class RemoveBoxes {
}
