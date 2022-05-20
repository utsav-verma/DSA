/**
 * * Question :- Find the next Smaller element in an Array
 * ! link :- https://www.geeksforgeeks.org/next-smaller-element/
 * ! Approach :- 
 */



import java.util.*;
public class next_smaller_element {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int arr[] ={4, 8, 5, 2, 25};
        Stack<Integer> st = new Stack<>();
        int answer[] = new int[arr.length];
        for(int i=arr.length-1;i>=0;i--)
        {
            while(!st.isEmpty()&& st.peek()>=arr[i])
            {
                st.pop();
            }
            if(st.isEmpty())
            answer[i]=-1;
            else
            answer[i]=st.peek();
            st.push(arr[i]);
        }
        System.out.println(Arrays.toString(answer));
        // System.out.println(answer.toString());
    }
}
