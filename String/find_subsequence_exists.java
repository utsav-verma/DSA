/*
 * Question :- Given two String strin s1 and s2 we have to find is s2 a subsequence of s1
 * Example :- s1 = abcdef, s2 =acd, yes s2 is subsequence
 ! APproach 1 :- Traverse to s1 and check if at s2 index i(0-s2.length) and check if i is part of s1 if yes continue
 ! In this approach if s1 is traversed and s2 is not traversed fully then s2 is not a subsequence

 ! Approach 2:- Use Hash Map to store inde of each character and then traverse through s2 and check if index of i > low or not
 ! continue with that map index or check if that character has any other map index, If character is not present return false

 */
import java.util.*;
public class find_subsequence_exists {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s1 =in.next();
        String s2 =in.next();
        for(char i:s1)
        System.out.println(i);
        // System.out.println(isSubsequence_2(s1,s2));
    }
    private static boolean isSubsequence_1(String s1,String s2)
    {
        int i=0,count=0;
        for(int j=0;j<s2.length();j++)
        {
            char c = s2.charAt(j);
            while(i<s1.length())
            {
                
                char z = s1.charAt(i);
                if(c==z)
                {
                    count++;
                    break;
                }
                i++;
            }
            
        }
        if(count!=s2.length())
            {
                return false;
            }
        return true;
    }
    private static boolean isSubsequence_2(String s1, String s2)
    {
        Map<Character,ArrayList<Integer>> map = new HashMap<>();
        for(int i=0;i<s1.length();i++)
        {
            char c =s1.charAt(i);
            if(!map.containsKey(c))
            {
                map.put(c,new  ArrayList<>());
                // map.get(c).add(i);
            }
            
                map.get(c).add(i);
            
        }
        int low=-1,prev=low;
        for(int i=0;i<s2.length();i++)
        {
            char c =s2.charAt(i);
            if(!map.containsKey(c))
            {
                return false;
            }
            
                for(Integer j : map.get(c))
                {
                    if(j>low)
                    {
                        low =j;
                        break;
                    }
                }
                if(low==prev)
                {
                    return false;
                }
                prev =low;
            
        }
        return true;
    }
}
