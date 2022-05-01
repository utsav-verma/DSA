/** 
*<h1>Question </h1>
*Check Balanced Parentheses. Given string str containing just the characters ‘(‘, ‘)’, ‘{‘, ‘}’, ‘[‘ and ‘]’,
* check if the input string is valid and return true if the string is balanced otherwise return false.
*<hr>
*[@link](https://takeuforward.org/data-structure/check-for-balanced-parentheses/)

**/
import java.util.*;

import javax.lang.model.util.ElementScanner14;
public class check_balanced_paranthesis {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String n =in.next();
        System.out.println(isBalanced(n));
    }
    
    private static boolean isBalanced(String n) {
        
        boolean balance =true;
        Stack<Character> st = new Stack<>();
        for(int i=0;i<n.length();i++)
        {
            char c =n.charAt(i);
            if(c==')'&&st.peek()=='(')
            {
                st.pop();
            }
            else if(c=='}'&&st.peek()=='{')
            {
               st.pop();

            }
            else if(c==']'&&st.peek()=='[')
            {
                st.pop();
            }
            else
            {
                st.push(c);
            }
            

        }
        if(!st.empty())
        {
            return false;
        }
        return true;
    }
}
