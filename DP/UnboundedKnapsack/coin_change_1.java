/*
 * Question :- https://leetcode.com/problems/coin-change/submissions/
 ! Approach :- We have two choice either to include that coins or exclude , if we include then in further iteration also we have change of including it
 */
public class coin_change_1 {
    public static void main(String[] args) {
        int coins[]={1,5,9};
        int amount =11;
        System.out.println(coinChange(coins,amount));   
    }

    private static int coinChange(int[] coins, int amount) {
        int n=coins.length;
        int dp[][] = new int[n+1][amount+1];

        for(int i=0;i<=n;i++)
        {
            for(int j=0;j<=amount;j++)
            {
                if(j==0)
                dp[i][j] = 0;
                else if(i==0)
                dp[i][j] = (int)Integer.MAX_VALUE;
                else if(coins[i-1]<=j)
                dp[i][j] = Math.min(1+dp[i][j-coins[i-1]],dp[i-1][j]);
                else
                dp[i][j]=dp[i-1][j];

            }
        }
        return dp[n][amount];
    }
}
