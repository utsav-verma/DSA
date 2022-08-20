/*
 * Question :- Given two Strings print the Longest Common Subsequence.
 * Example :- a:- abejkl, b:- ijjefjkl output :- ejkl
 *  
 */
import java.util.*;

import javax.lang.model.util.ElementScanner14;
public class print_LCS {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String a = in.next();
        String b =in.next();
        LCS(a,b);
        // System.out.println();
    }
    static int mat[][];
    private static  void LCS(String a,String b) {
      mat = new int[a.length()+1][b.length()+1];
      int row =a.length(),col =b.length();
      for(int i=1;i<=row;i++)
      {
        for(int j=1;j<=col;j++)
        {
            if(a.charAt(i-1)==b.charAt(j-1))
            {
                mat[i][j] =1+mat[i-1][j-1];
            }
            else
            {
                mat[i][j] = Math.max(mat[i][j-1],mat[i-1][j]);
            }
        }
      }
      for(int i=0;i<=row;i++)
      {
        for(int j=0;j<=col;j++)
        {
            System.out.print(mat[i][j]+" ");
        }
        System.out.println();
      }
      String ans="";
      int i=row,j=col;
      while(i>0 && j>0)
      {
        if(a.charAt(i-1)==b.charAt(j-1))
        {
            ans = a.charAt(i-1)+ans;
            i--;j--;
        }
        else if(mat[i][j-1]>mat[i-1][j])
        {
            j--;
        }
        else if(mat[i-1][j]>mat[i][j-1])
        {
            i--;
        }
        else break;
      }
      System.out.println(ans);
    }
    
}
