package Array;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by cuining8 on 02/16/2022 A group of two or more people wants to meet and
 * minimize the total travel distance. You are given a 2D grid of values 0 or 1, where each 1 marks
 * the home of someone in the group. The distance is calculated using Manhattan Distance, where
 * distance(p1, p2) = |p2.x - p1.x| + |p2.y - p1.y|.
 *
 * <p>Example:
 *
 * <p>Input:
 *
 * <p>1 - 0 - 0 - 0 - 1 | | | | | 0 - 0 - 0 - 0 - 0 | | | | | 0 - 0 - 1 - 0 - 0
 *
 * <p>Output: 6
 *
 * <p>Explanation: Given three people living at (0,0), (0,4), and (2,2): The point (0,2) is an ideal
 * meeting point, as the total travel distance of 2+2+2=6 is minimal. So return 6.
 *
 * <p>Solution: O(N ^ 2 + M ^ 2) + O(N x M): Calculate the total number of persons in each row and
 * each column and then take a minimum of cartesian product of each row and each column.
 */
public class BestMeetingPoint {
    public static void main(String[] args) {
        int[][] grids = {{1,0,0,0,1},{0,0,0,0,0},{0,0,1,0,0}};
        BestMeetingPoint bestMeetingPoint = new BestMeetingPoint();
        int res = bestMeetingPoint.bestMeetingPoint(grids);
        System.out.println(res);
    }


    public int bestMeetingPoint(int[][] grids) {
        int res = 0;
        List<Integer> ipos = new ArrayList<Integer>();
        List<Integer> jpos = new ArrayList<Integer>();

        for(int i = 0; i < grids.length; i++){
            for(int j = 0; j < grids[0].length; j++){
                if (grids[i][j] == 1) {
                    ipos.add(i);
                    jpos.add(j);

                }
            }
        }

        for (Integer pos : ipos) {
            res = res + Math.abs(pos - ipos.get(ipos.size()/2));
        }

        Collections.sort(jpos);
        for (Integer pos : jpos) {
            res = res + Math.abs(pos - jpos.get(jpos.size()/2));
        }

        return res;
    }

















}
