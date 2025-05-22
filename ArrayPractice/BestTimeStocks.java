public class BestTimeStocks {
    public static int Profitstock(int arr[]){
        int buyPrice   = Integer.MAX_VALUE;
        int maxProfit = 0;
        for(int i=0;i<arr.length;i++){
            if(buyPrice < arr[i]){
              int  profit = arr[i]-buyPrice;
              maxProfit = Math.max(profit,maxProfit);
            }else {
                buyPrice = arr[i];
            }
        }
        return maxProfit;

    }
    public static void main(String args[]){
        int price [] = {7,1,5,3,6,4};
        System.out.println("maximum profit is : "+Profitstock(price));
    }
}
