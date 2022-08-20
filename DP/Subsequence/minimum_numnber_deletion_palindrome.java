/*
 * Question:- We have to do minimum number of deletion to change the String to palindromic String
 * eg:- abcagba so longest Palindromic String is abcba
 ! Approach so if we find the the longest Palindromic Subsequence then only we will have to perform minimum number of deletion
 ! So find Orignal length - LPS = ans
 */
import java.util.*;
public class minimum_numnber_deletion_palindrome {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String n =in.next();
        String rev = reverse(n);
        int lps = LPS(n,rev);
        System.out.println(n.length()-lps);
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
    public static int LPS(String a,String b)
    {
        int dp[][] = new int[a.length()+1][b.length()+1];
        
        for(int i=1;i<=a.length();i++)
        {
            for(int j=1;j<=b.length();j++)
            {
                if(a.charAt(i-1)==b.charAt(j-1))
                {
                    dp[i][j] = 1+dp[i-1][j-1];
                }
                else
                {
                    dp[i][j] =Math.max(dp[i][j-1],dp[i-1][j]);
                }
            }
        }
        return dp[a.length()][b.length()];
    }
}
