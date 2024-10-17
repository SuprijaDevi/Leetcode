class Solution {
    public int maxProfit(int[] prices) {
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = Integer.MIN_VALUE;
        for(int price : prices) {
            if(price < minPrice) {
                minPrice = price;
            }
            int profit = price - minPrice;
            if(profit > maxProfit) {
                maxProfit = profit;
            }
        }
        return maxProfit;
    }
}