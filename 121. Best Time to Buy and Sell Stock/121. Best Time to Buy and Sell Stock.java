class Solution {
    public int maxProfit(int[] prices) {
        int minprice=prices[0];
        int maxprofit=0;
        for(int i=1;i<prices.length;i++){
            if(minprice>prices[i]){
                minprice=prices[i];
            }
            else if(prices[i]-minprice>maxprofit){
                maxprofit=prices[i]-minprice;
            }
        }
        return maxprofit;
    }
}
// T.C -> O(n)
// S.C -> O(1)