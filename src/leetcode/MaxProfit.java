package leetcode;

public class MaxProfit {
    public int maxProfit(int[] prices) {
        if(prices == null || prices.length == 0)
        	return 0;
        int max = 0;
        int size = prices.length;
        for(int i = 0; i < size - 1; i++){
        	for(int j = i + 1; j < size; j++){
        		if(prices[j] - prices[i] > max)
        			max = prices[j] - prices[i] ;
        	}
        }
    	return max;
    }
}
