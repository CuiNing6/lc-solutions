package dynamic_programming;

/**
 * Created by cuining8 on 02/18/2022 Given a 2D grid, each cell is either a wall 'W', an
 * enemy 'E' or empty '0' (the number zero), return the maximum enemies you can kill using one bomb.
 * The bomb kills all the enemies in the same row and column from the planted point until it hits
 * the wall since the wall is too strong to be destroyed. Note: You can only put the bomb at an
 * empty cell.
 *
 * <p>Example:
 *
 * <p>Input: [["0","E","0","0"],["E","0","W","E"],["0","E","0","0"]] Output: 3 Explanation: For the
 * given grid,
 *
 * <p>0 E 0 0 E 0 W E 0 E 0 0
 *
 * ["0","E","0","0"]
 * ["E","0","W","E"]
 * ["0","E","0","0"]
 *
 * <p>Placing a bomb at (1,1) kills 3 enemies.
 */
public class BombEnemy {
    public static void main(String[] args) {
        char[][] bomb = {{'0','E','0','0'},{'E','0','W','E'},{'0','E','0','0'}};
        BombEnemy bombEnemy = new BombEnemy();
        int res = bombEnemy.bombEnemy(bomb);
        System.out.println(res);
    }

    public int bombEnemy(char[][] bomb) {
        int res = 0;

        if (bomb == null || bomb.length == 0 || bomb[0].length == 0) {
            return res;
        }

        int m = bomb.length;
        int n = bomb[0].length;
        int[] col = new int[n];
        int row = 0;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (i==0 || bomb[i-1][j] == 'W') {
                    col[j] = 0;
                    for (int k = i; k < m && bomb[k][j] != 'W'; k++) {
                        col[j] = col[j] + (bomb[k][j] == 'E' ? 1:0);
                    }
                }

                if (j==0 || bomb[i][j-1] == 'W') {
                    row = 0;
                    for (int k = j; k < n && bomb[i][k] != 'W'; k++) {
                        row = row + (bomb[i][k] == 'E' ? 1:0);
                    }
                }

                if (bomb[i][j] == '0') {
                    res = Math.max(res, col[j] + row);
                }
            }
        }
        return res;
    }
}
