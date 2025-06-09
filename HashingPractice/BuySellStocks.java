/*
 * 
 * 
 * The cost of stock on each day is given in an array price[].
 *  Each day you may decide to either buy or sell the stock i at price[i], you can even buy and sell the stock on the same day. Find the maximum profit that you can get.

Note: A stock can only be sold if it has been bought previously 
and multiple stocks cannot be held on any given day.
 */


 public class BuySellStocks{


    public static int maximumProfit(int arr[]) {
      
       
        int Profit = 0;
    for(int i=1;i<arr.length;i++){
       if(arr[i]>arr[i-1]){
               Profit+=arr[i]-arr[i-1];
               
       }  
                       }
        return Profit;
        
    }
    public static void main(String args[]){
   int prices[] ={100, 180, 260, 310, 40, 535, 695};
   System.out.println(maximumProfit(prices));
    }
 }