/**
 * * Question :- Convert the Infix operation to PostFix
 * ! link :- https://practice.geeksforgeeks.org/problems/infix-to-postfix-1587115620/1
 */



import java.util.*;

public class infixToPostfix {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str =in.next();
        Queue<Character>var = new LinkedList<>();
        Stack<Character> opt = new Stack<>();
        Map<Character,Integer> order = new HashMap<>();
        order.put('^',50);
        order.put('*',30);
        order.put('/',30);
        order.put('+',10);
        order.put('-',10);
        
        String postfix="";
        for(int i=0;i<str.length();i++)
        {
            char c=str.charAt(i);

            if(c=='('||c=='{'||c=='[')
            {
                opt.push(c);
            }

            else if(c==')')
            {
                while(!var.isEmpty())
                {
                    postfix +=var.remove();
                }
                System.out.println(opt);
                while(!opt.isEmpty()&&opt.peek()!='(')
                {
                    postfix+=opt.pop();
                }
                opt.pop();
            }
            else if(c==']')
            {
                while(!var.isEmpty())
                {
                    postfix +=var.remove();
                }
                System.out.println(opt);
                while(!opt.isEmpty()&&opt.peek()!='[')
                {
                    postfix+=opt.pop();
                }
                opt.pop();
            }
            else if(c=='}')
            {
                while(!var.isEmpty())
                {
                    postfix +=var.remove();
                }
                System.out.println(opt);
                while(!opt.isEmpty()&&opt.peek()!='{')
                {
                    postfix+=opt.pop();
                }
                opt.pop();
            }
           
            else if(order.containsKey(c))
            {
                if(opt.isEmpty())
                {
                    opt.push(c);
                }
                else
                {
                    int val = order.get(c);
                    char y =opt.peek();
                    if(order.containsKey(y) && order.get(y)>val)
                    {
                        while(!var.isEmpty())
                        {
                            postfix+=var.remove();
                        }
                        postfix +=opt.pop();
                        opt.push(c);
                    }
                    else
                    {
                        opt.push(c);
                    }
                }
            }
            else if(Character.isLetter(c)){
                var.add(c);

            }
            

            

        }
        while(!var.isEmpty())
        {
            postfix+=var.remove();
        }
        while(!opt.isEmpty())
        {
            postfix+=opt.pop();
        }
        System.out.println(postfix);
    }
}
