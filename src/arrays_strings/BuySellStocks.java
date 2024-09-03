package arrays_strings;

public class BuySellStocks {
    public int maxProfit(int[] prices) {
        int min = prices[0]; int profit = 0; int max_profit = 0;
        for(int i=1;i<prices.length;i++){
            if(prices[i]<min){
                min = prices[i];
            }
            else {
                profit = prices[i]-min;
                if(profit>max_profit){
                    max_profit = profit;
                }
            }
        }
        return max_profit;
    }
    public static void main(String[] args) {
        BuySellStocks buySellStocks = new BuySellStocks();
        System.out.println(buySellStocks.maxProfit(new int[]{7,1,5,3,6,4}));
    }
}
