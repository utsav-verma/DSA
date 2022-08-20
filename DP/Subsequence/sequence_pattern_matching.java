/*
 * Question :- Given two String a,,b find if String a is a Subsequence of B.
 */
import java.util.*;
public class sequence_pattern_matching {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String a =in.next();
        String b =in.next();
        System.out.println(isSubsequence(a,b));
    }

    private static boolean isSubsequence(String a, String b) {
        int dp[][] = new int[a.length()+1][b.length()+1];

        for(int i=1;i<=a.length();i++)
        {
            for(int j=1;j<=b.length();j++)
            {
                if(a.charAt(i-1)==b.charAt(j-1))
                {
                    dp[i][j] = 1+dp[i-1][j-1];
                }
                else{
                    dp[i][j] = Math.max(dp[i][j-1],dp[i-1][j]);
                }
            }
        }
        if(dp[a.length()][b.length()]==a.length())
        return true;
        return false;
    }
    
}
