/*
 * Question:- Given a String "AABEBCDD" ABD is the longest repeating subsequence as one ABD has index {0,2,6} and other has {1,4,7}
 ! Approach Find Lcs with with condition i!=j
 */
import java.util.*;
public class longest_repeating_subsequence {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String n =in.next();
        System.out.println(LRS(n));
    }
    public static int LRS(String a)
    {
        String b = a;
        int dp[][] = new int[a.length()+1][a.length()+1];
        for(int i=1;i<a.length()+1;i++)
        {
            for(int j=1;j<=a.length();j++)
            {
                if(a.charAt(i-1)==b.charAt(j-1) && i!=j)
                {
                    dp[i][j] = dp[i-1][j-1]+1;
                }
                else
                {
                    dp[i][j] = Math.max(dp[i][j-1],dp[i-1][j]);
                }
            }
        }
        return dp[a.length()][a.length()];
    }
}
