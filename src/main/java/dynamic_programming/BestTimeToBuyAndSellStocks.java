package dynamic_programming;

import sun.applet.AppletResourceLoader;

/**
 * Created by cuining8 on 02/18/2022. Say you have an array for which the ith element is
 * the price of a given stock on day i.
 *
 * <p>If you were only permitted to complete at most one transaction (ie, buy one and sell one share
 * of the stock), design an algorithm to find the maximum profit.
 *
 * <p>Example 1: Input: [7, 1, 5, 3, 6, 4] Output: 5
 *
 * <p>max. difference = 6-1 = 5 (not 7-1 = 6, as selling price needs to be larger than buying price)
 * Example 2: Input: [7, 6, 4, 3, 1] Output: 0
 *
 * <p>In this case, no transaction is done, i.e. max profit = 0.
 */
public class BestTimeToBuyAndSellStocks {
    public static void main(String[] args) {
        int[] profit = {7, 1, 5, 3, 6, 4};
        int res = new BestTimeToBuyAndSellStocks().bestTimeToBuyAndSellStocks(profit);
        System.out.println(res);
    }

    public int bestTimeToBuyAndSellStocks(int[] profit) {
        int minpro = profit[0];

        int n = profit.length;
        if (n<2) {
            return 0;
        }

        int[] profile = new int[n];

        for (int i = 1; i < n; i++) {
            if (minpro > profit[i]) {
                minpro = profit[i];
                profile[i] = profile[i-1];
            } else {
                int tmp = profit[i] - minpro;
                profile[i] = Math.max(tmp, profile[i - 1]);
            }
        }
        return profile[n-1];
    }














}
