/**
 * *Question :- Buy and sell stock in such way that it bears maximum profit
 * !link :- https://takeuforward.org/data-structure/stock-buy-and-sell/
 * !Approach :- Initialise buy with 0 , if anywhere we get a i such that a[i]<a[buy] update buy =i;
 * ! if any value of i we get such that a[i]-a[buy] is max then we sell on that day that is our max profit
 */




public class stock_buy_sell {
    public static void main(String[] args) {
        // Scanner in = new Scanner(System.in);
        int arr[] ={7,6,4,3,1};
        int buy =0;
        int maxProfit=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[buy]>arr[i])
            {
                buy =i;
            }
            else if(maxProfit<(arr[i]-arr[buy]))
            {
                maxProfit=arr[i]-arr[buy];
            }
        }
        System.out.println(maxProfit);
    }    
}
