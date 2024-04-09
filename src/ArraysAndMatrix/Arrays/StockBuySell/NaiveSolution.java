package ArraysAndMatrix.Arrays.StockBuySell;

public class NaiveSolution {

    public static int maxProfit(int[] price, int start , int end) {

        if(end <= start)
            return 0;
        int profit = 0;
        for(int i = start; i < end; i++){
            for (int j = i+1 ; j <= end; j++){
                if(price[j] > price[i]){
                    int currProfit = (price[j] - price[i]) + maxProfit(price, start, i - 1) + maxProfit(price, j + 1, end);
                    profit = Math.max(profit, currProfit);
                }
            }
        }
        return profit;
    }


    public static void main(String[] args) {

        int[] price = {1,5,3,8,12};

        int profit = maxProfit(price, 0, price.length - 1);
        System.out.println("Maximum profit: " + profit);
    }
}
