package dynamic_programming;

/**
 * Created by cuining8 on 03/05/2022 There is an m by n grid with a ball. Given the start
 * coordinate (i,j) of the ball, you can move the ball to adjacent cell or cross the grid boundary
 * in four directions (up, down, left, right). However, you can at most move N times. Find out the
 * number of paths to move the ball out of grid boundary. The answer may be very large, return it
 * after mod 10 ^ 9 + 7.
 *
 * <p>Solution: O(m x n x N x 4) Move in all possible directions from the starting position (i, j)
 * and keep track of distance traversed and ensure the distance traversed does not exceed N. Keep
 * the count of number of possibilities to go out of the boundary for each cell reached. Return the
 * sum in cell (a, b)
 */
public class OutOfBoundaryPaths {
}
