package ArraysAndMatrix.Arrays.StockBuySell;

public class EfficientSolution {

    public static int maxProfit(int[] price , int n){

        int profit = 0;
        for(int i=1 ; i < n ; i++){
            if(price[i] > price[i-1]){
                profit += (price[i] - price[i-1]);
            }
        }
        return profit;
    }


    public static void main(String[] args) {

        int[] price = { 100, 180, 260, 310, 40, 535, 695 };

        int profit = maxProfit(price, price.length);
        System.out.println("Maximum profit: " + profit);
    }
}
