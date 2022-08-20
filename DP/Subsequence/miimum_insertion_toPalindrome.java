/*
 * Question:- WE have to find minimum number of character we need to insert so that string becomes Palindrome
 ! Approach:- Use (LPS) Longest Palindromic Subsequence so length of String - Length of LPS = number of deletion;
 ! number of Deletion == number of Insertion in String "abcdba"if we delete d it becomes Palinrome but instead we insert another d "abdcdba" than also its becomes Palin 
 */
import java.util.*;
public class miimum_insertion_toPalindrome {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String a =in.next();
        StringBuilder st = new StringBuilder(a);
        st.reverse();
        String rev =st.toString();
        int lps = LPS(a,rev);
        System.out.println(a.length()-lps);
    }
    public static int LPS(String a,String b)
    {
        int len =a.length();
        int dp[][] = new int[len+1][len+1];

        for(int i=1;i<=len;i++)
        {
            for(int j=1;j<=len;j++)
            {
                if(a.charAt(i-1)==b.charAt(j-1))
                {
                    dp[i][j] =1+dp[i-1][j-1];
                }
                else
                {
                    dp[i][j] = Math.max(dp[i][j-1],dp[i-1][j]);
                }
            }
        }
        return dp[len][len];
    }
}
