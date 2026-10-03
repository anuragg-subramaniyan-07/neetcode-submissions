class Solution {
    public int maxProfit(int[] prices) {
         int minPrice = prices[0];
         int maxprofit = 0;
         for(int i=1;i<prices.length;i++){
             if(prices[i] > minPrice){
                  maxprofit = Math.max(maxprofit,prices[i]-minPrice);
             }
             else{
                  minPrice = prices[i];
             }
         }
         return maxprofit;
    }
}
