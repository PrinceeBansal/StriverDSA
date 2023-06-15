package array;

public class StockBuySell {

	public int maxProfit(int[] prices) {
        int n = prices.length;
        if(n==0||n==1){return 0;}
        int sellPrice = Integer.MIN_VALUE;
        int buyPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for(int i = 0; i < n; i++){
            if(prices[i] < buyPrice){
                buyPrice = prices[i];
                sellPrice = prices[i];
            }

            if(prices[i] > sellPrice){
                sellPrice = prices[i];
            }

            int profit = sellPrice-buyPrice;
            if(profit>maxProfit){maxProfit = profit;}
        }

        return maxProfit;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
