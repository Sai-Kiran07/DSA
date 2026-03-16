class Solution {
    public int maxProfit(int[] prices) {
        int buy = 0;
        int sell = 0;
        int maxprofit = 0;
        for(int day = 0; day < prices.length; day++){
            if(prices[day] > prices[buy] && prices[day] > prices[sell]){
                sell = day;
                maxprofit = Math.max(maxprofit, prices[sell] - prices[buy]);
            }
            else if(prices[day] < prices[buy]){
                buy = day;
                sell = buy;
            }
        }return maxprofit;
    }
}