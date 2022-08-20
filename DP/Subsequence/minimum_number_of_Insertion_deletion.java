/*
 * Question:- We need to perform minimum number of insertion and deletion to convert String a to b
 * a :- heap ; b:- pea
 * Insetrtion :-1 deletion :-2
 ! Approach find LCS of both String them substract the LCS len with String a's len that is deletion and then subtract lcs from String b that is insertion 
 */
import java.util.*;
public class minimum_number_of_Insertion_deletion {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String a = in.next();
        String b= in.next();
        minimumInsertionDeletion(a,b);
    }
    public static void minimumInsertionDeletion(String a,String b)
    {
        int lcs = LCS(a,b);
        int ins =Math.abs(b.length()-lcs);
        int del = Math.abs(a.length()-lcs);
        System.out.println("Insertion :- "+ins);
        System.out.println("Deletion :- "+del);
    }
    public static int LCS(String a,String b)
    {
        int mat[][] = new int[a.length()+1][b.length()+1];
        for(int i=1;i<=a.length();i++)
        {
            for(int j=1;j<=b.length();j++)
            {
                if(a.charAt(i-1)==b.charAt(j-1))
                {
                    mat[i][j]= 1+mat[i-1][j-1];
                }
                else
                {
                    mat[i][j] = Math.max(mat[i][j-1],mat[i-1][j]);
                }
            }
        }
        return mat[a.length()][b.length()];
    } 
}
