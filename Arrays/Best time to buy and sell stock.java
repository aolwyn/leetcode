class Solution {
    public int maxProfit(int[] prices) {
        //base case, 0/1 stocks ( wont get any profit if you cant sell)
        if(prices.length <= 1) return 0;

        int min = prices[0];
        int maxMoney = 0;
        //keep running totals of max and min prices to find the best price. 
        for(int i = 0; i < prices.length; i++){
            int money = prices[i] - min;
            if(money > maxMoney) maxMoney = money;
            if(prices[i] < min) min = prices[i];
        }
        return maxMoney;
    }
}
