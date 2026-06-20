class Solution {
    public int maxProfit(int[] prices) {
    
    int minDif = 999;
    int index = 0;
    int previousValue = 9999;
    int minDay = -99;
    int maxProfitDay = 999;

    while (index < prices.length){
        if (index == 0){
            minDay = prices[index];
            index++;
            continue;
        }

        if (prices[index] < minDay){
            minDay = prices[index];
            index++;
            continue;
        }

        else {
            int diff = minDay - prices[index];

            if (diff < maxProfitDay){
                maxProfitDay = diff;
            }
            index++;
            continue;
        }
    }

    if (maxProfitDay <= 0){
        return maxProfitDay * -1;
    }
    return 0; 
    }
}
