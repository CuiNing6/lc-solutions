package dynamic_programming;

/**
 * Created by cuining8 on 02/18/2022. Say you have an array for which the ith element is
 * the price of a given stock on day i.
 *
 * <p>Design an algorithm to find the maximum profit. You may complete at most two transactions.
 *
 * <p>Note: You may not engage in multiple transactions at the same time (ie, you must sell the
 * stock before you buy again).
 *
 * <p>Solution: O(n): In the first iteration calculate the max profit that can be made by one buy
 * and sell by iterating from right to left and saving this in a dp array and maintaining a max
 * value. In the second iteration starting from left to right maintain a min value and calculate the
 * max profit that can be made by one buy and sell by taking the difference of current with min and
 * calculate the total profit of two transactions by summing up the current profit made with the
 * profit in dp array.
 */
public class BestTimeToBuyAndSellStockIII {
    public static void main(String[] args) {
        int[] prices = {3,3,5,0,0,3,1,4};
        BestTimeToBuyAndSellStockIII bestTimeToBuyAndSellStockIII = new BestTimeToBuyAndSellStockIII();
        int res = bestTimeToBuyAndSellStockIII.bestTimeToBuyAndSellStockIII(prices);
        System.out.println(res);
    }

    public int bestTimeToBuyAndSellStockIII(int[] prices) {
        int buy1 = Integer.MIN_VALUE;
        int sell1 = 0;
        int buy2 = Integer.MIN_VALUE;
        int sell2 = 0;

        for (int i = 0; i < prices.length; i++) {
            buy1 = Math.max(buy1, -prices[i]);
            sell1 = Math.max(sell1, buy1+prices[i]);
            buy2 = Math.max(buy2,sell1-prices[i]);
            sell2 = Math.max(sell2,buy2+prices[i]);
        }

        return sell2;
    }
}
