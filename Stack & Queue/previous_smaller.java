/**
 * * Question:- Find all the previous smaller element in an array.
 * ! link:- https://practice.geeksforgeeks.org/problems/smaller-on-left20360700/1
 * !Approach:- Store the first element in stack and for 1st element previous smaller will be -1 
 * ! Now if the top elemnt in stack < current then that is previous smaller element else pop() the element unttil its small 
 */



import java.util.*;

public class previous_smaller {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // int arr[] ={2, 3, 4, 5, 1};
        int arr[]={1,2,3};
        Stack<Integer> element = new Stack<>();
        ArrayList<Integer> next_smaller =new ArrayList<>();
        for(int i=0;i<arr.length;i++)
        {
            while(!element.isEmpty()&&element.peek()>=arr[i])
            {
                element.pop();
            }
            if(element.isEmpty())
            {
                next_smaller.add(-1);
            }
            else{
                
                next_smaller.add(element.peek());
                
            }
            element.push(arr[i]);
        }
        System.out.println(next_smaller);
    }
}
