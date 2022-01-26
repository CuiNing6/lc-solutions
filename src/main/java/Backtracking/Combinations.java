package Backtracking;

import com.sun.tools.internal.ws.wsdl.document.soap.SOAPUse;
import org.omg.PortableInterceptor.SUCCESSFUL;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by cuining on 26/1/2022. Given two integers n and k, return all possible combinations of
 * k numbers out of 1 ... n.
 *
 * <p>For example, If n = 4 and k = 2, a solution is:
 *
 * <p>[ [2,4], [3,4], [2,3], [1,2], [1,3], [1,4], ]
 */
public class Combinations {
    public static void main(String[] args) {
        int n = 4;
        int k = 2;

        List<List<Integer>> res = new Combinations().combinations(n,k);
        System.out.println(Arrays.toString(res.toArray()));
    }

    public List<List<Integer>> combinations(int n, int k) {
        List<List<Integer>> result = new ArrayList<>();
        int[] subArr = new int[k];

        doNext(0,0,n,k,subArr,result);
        return result;
    }

    public void doNext(int i, int count, int n, int k, int[] subArr, List<List<Integer>> result) {
        if (k==0) {
            List<Integer> subList = new ArrayList<>();
            for (int d = 0; d < subArr.length; d++) {
                subList.add(subArr[d]);
            }
            result.add(subList);
        } else {
            for (int p = i + 1; p <= n; p++) {
                subArr[count] = p;
                doNext(p,count+1,n,k-1,subArr,result);
            }

        }
    }


}
