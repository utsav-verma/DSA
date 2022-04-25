//This Algorithm helps return the indices os pettern present in the string

import java.util.*;
public class KMP_algorithm {

    public static int[] prefix_finction(String s)
    {
        int n =s.length();
        int pi[] = new int[n];
        Arrays.fill(pi,0);
        for(int i=1;i<n;i++)
        {
            int j =pi[i-1];
            while(j>0 && s.charAt(i)!=s.charAt(j))
            j=pi[j-1];
            if(s.charAt(i)==s.charAt(j))
            {
                j++;
            }
            pi[i]=j;
        }


        //Time Complexity is O(n)
        return pi;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String pat="Ve";
        String str = "UtavVerma";
        int pos =-1;
        int i=0,j=0;
        int prefix[]= prefix_finction(pat);
        while(i<str.length())
        {
            if(str.charAt(i)==pat.charAt(j))
            {
                i++;j++;
            }
            else
            {
                if(j!=0)
                {
                    j =prefix[j-1];
                }
                else
                {
                    i++;
                }
            }
            if(j==pat.length())
            {
                pos = i-pat.length();
                break;
            }
        }
        System.out.println(pos);
        // Time Complexity :- O(pat+str)

    }
    
}
