package leetcode.p0001_0500;

public class Pro0121 {

    static class Solution {
        public int maxProfit(int[] prices) {
            int maxProfit = 0;
            for (int i = 0; i < prices.length; i++) {
                for (int j = i+1; j < prices.length; j++) {
                    int profit = prices[j] - prices[i];
                    if (profit > maxProfit) {
                        maxProfit = profit;
                    }
                }
            }
            return maxProfit;
        }
    }

    static class Solution1 {
        public int maxProfit(int[] prices) {
            int maxProfit = 0, minPrice = Integer.MAX_VALUE;
            for (int price : prices) {
                if (price < minPrice) {
                    minPrice = price;
                } else if (price - minPrice > maxProfit) {
                    maxProfit = price - minPrice;
                }
            }
            return maxProfit;
        }
    }
}
