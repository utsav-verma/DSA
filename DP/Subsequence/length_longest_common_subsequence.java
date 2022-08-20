import java.util.*;
/*
 * Question :- Find the maximum length longest common subsequence
 */
public class length_longest_common_subsequence {
    static int dp[][];
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String a =in.next();
        String b =in.next();
        // dp = new int[a.length()][b.length()];
        // for(int i[]:dp)
        // Arrays.fill(i,-1);
        // System.out.println(lcs(a,b,a.length()-1,b.length()-1));
        System.out.println(lcs_TopDown(a, b));
    }

    private static int lcs(String a, String b,int i ,int j) {
        if(i<0||j<0)
        return 0;
        if(dp[i][j]!=-1)
        return dp[i][j];
        char aa = a.charAt(i);
        char bb = b.charAt(j);
        if(aa==bb)
        {
            dp[i][j]= 1+lcs(a,b,i-1,j-1);
        }
        else
        dp[i][j]= Math.max(lcs(a,b,i-1,j),lcs(a,b,i,j-1));
        return dp[i][j];

    }
    //* TopDown Approach */
    private static int lcs_TopDown(String a,String b)
    {
        int mat[][] = new int[a.length()+1][b.length()+1];
        int m =a.length(),n=b.length();
        for(int i=0;i<=m;i++)
        {
            mat[i][0]=0;
        }
        for(int j=0;j<=n;j++)
        {
            mat[0][j] =0;
        }
        for(int i=1;i<=m;i++)
        {
            for(int j=1;j<=n;j++)
            {
                if(a.charAt(i-1)==b.charAt(j-1))
                mat[i][j] = 1+mat[i-1][j-1];
                else
                {
                    mat[i][j]=Math.max(mat[i-1][j],mat[i][j-1]);
                }
            }
        }
        return mat[m][n];
    }
}