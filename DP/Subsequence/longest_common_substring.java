/*
 * Question:- Find the longest common substring
 */
/**
 * longest_common_substring
 */
import java.util.*;
public class longest_common_substring {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String a =in.next();
        String b =in.next();
        // System.out.println("Longest Commom Substring len = : ");abc
       
        mat = new int[a.length()+1][b.length()+1];
        for(int i[]:mat)
        Arrays.fill(i,0);
        LCS(a,b);
       
    }
    static int mat[][];
    private static void LCS(String a, String b) {
       

        for(int i=1;i<a.length()+1;i++)
        {
            for(int j=1;j<b.length()+1;j++)
            {
                if(a.charAt(i-1)==b.charAt(j-1))
                {
                    mat[i][j] =1+mat[i-1][j-1];
                }
                else
                {
                    mat[i][j]=0;
                }
            }
        }
        int max =0;
        for(int i=0;i<a.length()+1;i++)
        {
            for(int j=0;j<b.length()+1;j++)
            {
                max = Math.max(max,mat[i][j]);
            }
        }
        System.out.println(max);

    }
}