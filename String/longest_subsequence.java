/**
 * *Question :- Find the Longest subsequence of given two String
 * * Subsequence of a b c are :- a,b,c,ab,bc,ca,abc
 * !Approach :-  Find all the common Characters in it and then check the common number 0f characters in other, count of common characters is this way we get longest susequence
 */

import java.util.*;
public class longest_subsequence {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String x =in.next();
        String y =in.next();
        int res = longestSusequence(x,y);
        System.out.println(res);
    }

    private static int longestSusequence(String x, String y) {
        int max_length =0;
        Map<Character,Integer> map = new HashMap<>();
        int l =x.length();
        for(int i=0;i<l;i++)
        {
            char c=x.charAt(i);
            if(map.containsKey(c))
            {
                int val = map.get(c)+1;
                map.put(c,val);
            }
            else
            map.put(c,1);
        } 
        for(int i=0;i<l;i++)
        {
            char c= y.charAt(i);
            if(map.containsKey(c))
            {
                int val = map.get(c)-1;
                if(val==0)
                map.remove(c);
                else
                map.put(c,val);
                max_length++;
            }
        }

        return max_length;
    }
    
    
}
