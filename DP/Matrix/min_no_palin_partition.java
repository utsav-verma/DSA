/*
 * Question:- We have to find min number of partition we need to make so that string becomes Palin
 */
import java.util.*;
public class min_no_palin_partition {
public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    String n=in.next();
    System.out.println(palinPart(n));
}
static int dp[][];
private static int palinPart(String n) {
    dp = new int[n.length()][n.length()];
    for(int i[]:dp)
    {
        Arrays.fill(i,-1);
    }
    return solve(n,0,n.length()-1);
}
private static int solve(String n, int i, int j) {
    if(i>=j)
    return 0;
    if(isPalin(n,i,j))
    return 0;
    if(dp[i][j]!=-1) return dp[i][j];
    int mn =Integer.MAX_VALUE;
    for(int k=i;k<=j-1;k++)
    {
        int temp = 1+solve(n,i,k)+solve(n,k+1,j);
       mn = Math.min(temp,mn);
    }
    dp[i][j] =mn;
    return mn;
}
    public static boolean isPalin(String n,int i,int j)
    {
        while(i<=j)
        {
            if(n.charAt(i)!=n.charAt(j))
            return false;

            i++;j--;
        }
        return true;
    }
}