package dynamic_programming;

/**
 * Created by cuining8 on 03/05/2022
 *
 * <p>A game on an undirected graph is played by two players, Mouse and Cat, who alternate turns.
 *
 * <p>The graph is given as follows: graph[a] is a list of all nodes b such that ab is an edge of
 * the graph.
 *
 * <p>Mouse starts at node 1 and goes first, Cat starts at node 2 and goes second, and there is a
 * Hole at node 0.
 *
 * <p>During each player's turn, they must travel along one edge of the graph that meets where they
 * are. For example, if the Mouse is at node 1, it must travel to any node in graph[1].
 *
 * <p>Additionally, it is not allowed for the Cat to travel to the Hole (node 0.)
 *
 * <p>Then, the game can end in 3 ways:
 *
 * <p>If ever the Cat occupies the same node as the Mouse, the Cat wins. If ever the Mouse reaches
 * the Hole, the Mouse wins. If ever a position is repeated (ie. the players are in the same
 * position as a previous turn, and it is the same player's turn to move), the game is a draw. Given
 * a graph, and assuming both players play optimally, return 1 if the game is won by Mouse, 2 if the
 * game is won by Cat, and 0 if the game is a draw.
 *
 * <p>Example 1:
 *
 * <p>Input: [[2,5],[3],[0,4,5],[1,4,5],[2,3],[0,2,3]] Output: 0 Explanation: 4---3---1 | | 2---5 \
 * / 0
 *
 * <p>Note:
 *
 * <p>3 <= graph.length <= 50 It is guaranteed that graph[1] is non-empty. It is guaranteed that
 * graph[2] contains a non-zero element.
 *
 * <p>Solution: Each combination of mouse, cat and turn for a state (m, c, p). Transition between
 * different states form a state graph - start to color each state with either MOUSE, CAT or a DRAW
 * based on who wins this state. Perform a bottom up dp inorder to arrive at the answer.
 */
public class CatAndMouse {
}
