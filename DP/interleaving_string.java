/*
 * Question :- Interleaving String
 * Link:- https://leetcode.com/problems/interleaving-string/
 ! Approach :- So we have two String s1 s2 and s3, len(s3)= len(s1)+len(s2), 
 ! we take 3 pointers p1, p2 and p3 pointing respectively to s1,s2,s3
 ! Now we check if p1==p3 && p2==p3 so we form string using both p1 and p2 and if any one's resultant string = s3
 ! then return true else false

 */
import java.util.*;
public class interleaving_string {
    static Map<String,Boolean> map ;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s1 =in.next();
        String s2 =in.next();
        String s3 =in.next();
        map = new HashMap<>();
        System.out.println(isInterleaving(s1,s2,s3,0,0,0));
        
    }
    private static boolean isInterleaving(String s1, String s2, String s3, int p1, int p2, int p3) {
        if(p3==s3.length())
        {
            return p1==s1.length()&&p2==s2.length()?true:false;
        }
        String key = Integer.toString(p1)+"-"+Integer.toString(p2)+"-"+Integer.toString(p3);
        boolean one=false,two=false;
        if(map.containsKey(key))
        {
                return map.get(key);
            }
            char c3=s3.charAt(p3);
        if(p1==s1.length())
        {
                
            char c2 =s2.charAt(p2);
            if(c2==c3)
            {
                one= isInterleaving(s1,s2,s3,p1,p2+1,p3+1);
                map.put(key,one);
                return one;
            }
            else
            {
                map.put(key,false);
                return false;
            }
        }
        if(p2==s2.length())
        {
            char c1 =s1.charAt(p1);
            if(c1==c3)
            {

                two= isInterleaving(s1,s2,s3,p1+1,p2,p3+1);
                map.put(key,two);
                return two;
            }
            else
            {
                map.put(key,false);
                return false;
            }
            
        }
        char c1 =s1.charAt(p1);
        char c2 =s2.charAt(p2);
        if(c1==c3)
        one = isInterleaving(s1,s2,s3,p1+1,p2,p3+1);
        if(c2==c3)
        two = isInterleaving(s1,s2,s3,p1,p2+1,p3+1);
        map.put(key,one || two);
        return one || two;
        
    }
    

}

