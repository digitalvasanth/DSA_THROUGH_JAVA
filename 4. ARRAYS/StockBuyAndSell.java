/*
 Input: prices = [7,1,5,3,6,4]
Output: 5
Explanation: Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6-1 = 5.
Note that buying on day 2 and selling on day 1 is not allowed because you must buy before you sell.
 */
public class StockBuyAndSell {
    
    public static void main(String [] args)
    {
        int prices[]={7,1,5,3,6,4};
        System.out.println(maxProfit(prices));
    }

public static int maxProfit(int[] prices) {
        
        int maxprofit=0;
        int buyprice=prices[0];

        for(int i=1;i<prices.length;i++)
        {
            if(prices[i]>buyprice)
            {
                int profit=prices[i]-buyprice;
                maxprofit=Math.max(maxprofit,profit);
            }
            else
            buyprice=prices[i];
        }
        return maxprofit;
    }
}
