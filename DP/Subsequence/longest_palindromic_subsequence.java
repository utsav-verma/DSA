/*
 * Question :- Ina String try to find the Longest Palindromic Subsequence
 * Example :- "agbcba" ans is - abcba as it is palindromic
 ! Approach :- Its same as Longest Common subsequence reverse the String a we have 2 String a and a_rev.
 ! find lcs that will be the ans;
 */
import java.util.*;
public class longest_palindromic_subsequence {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String n =in.next();
        String rev =reverse(n);
    }
    public static String reverse(String n)
    {
        String rev ="";
        for(int i=0;i<n.length();i++)
        {
            rev = n.charAt(i)+rev;
        }
        return rev;
    }
    public static int LCS(String a,String b)
    {
        int dp[][] = new int [a.length()+1][b.length()+1];
        for(int i=1;i<=a.length();i++)
        {
            for(int j=1;j<=b.length();j++)
            {
                if(a.charAt(i-1)==b.charAt(j-1))
                {
                    dp[i][j] =1+dp[i-1][j-1];
                }
                else
                {
                    dp[i][j] = Math.max(dp[i-1][j],dp[i][j-1]);
                }
            }
        }
        return dp[a.length()][b.length()];
    }
   //*  Time Complexity O(n^2)
}
