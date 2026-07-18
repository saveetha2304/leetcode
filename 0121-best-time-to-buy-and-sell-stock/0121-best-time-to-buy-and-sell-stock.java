class Solution {
    public int maxProfit(int[] prices) {
        int Maxprofit=0;
        int min=Integer.MAX_VALUE;
        for(int i=0;i<prices.length;i++){
            if(prices[i]<min ){
                min=prices[i];
            }
            else{
                int profit=prices[i]-min;
                Maxprofit=Math.max(profit,Maxprofit);

            }
          
        }
        return Maxprofit;
    }
}