class Solution {
    public int maxProfit(int[] prices) {
        //base cases, if there's no stock or if there's only one, you wont have any profit.
        if(prices.length <= 0) return 0;
     
        //minimum stock price will start with the first element.
        //starting profit will likewise be $0.
        int min = prices[0];
        int profit = 0;
        
        //keep a running total of the current maximum profit and current minimum.
        //iterate through while constantly updating. 
        for(int i = 1; i < prices.length; i++){
            //temp variable used for checking values
            int temp = prices[i] - min;
            
            if(temp > profit) profit = temp; //if the value is higher, then we update the max profit.
            if(prices[i] < min) min = prices[i]; //new minimum buy price 
        }
        return profit;  
    }
}