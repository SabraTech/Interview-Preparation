class Solution {
    public int maxProfit(int[] prices) {
        if(prices.length == 0){
            return 0;
        }
        int min = prices[0];
        int maxP = 0;
        for(int i = 1; i < prices.length; i++){
            if(prices[i] < min){
                min = prices[i];
            }

            int dif = prices[i] - min;

            if(dif > maxP){
                maxP = dif;
            }
        }
        return maxP;
    }
}
