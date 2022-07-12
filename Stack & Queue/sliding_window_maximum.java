/*
 * sliding_window_maximum
 * Question say we are given an array {4,1,3,5,2,1,2,3}
 * ans K =3
 * Return the largest window in every kth window
 * output:- 4,5,5,5,2,3
 */
import java.util.*;
public class sliding_window_maximum {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n =in.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the Elements in Array > ");
        for(int i=0;i<n;i++)
        {
            arr[i] = in.nextInt();
        }
        System.out.println("Enter the window Size > ");
        int k =in.nextInt();
        Deque<Integer> dq =  new ArrayDeque<>();
        for(int i=0;i<k;i++)
        {
            while(!dq.isEmpty()&&arr[i]>=arr[dq.peekLast()])
            {
                dq.removeLast();
            }
            dq.addLast(i);
        }
        for(int i=k;i<n;i++)
        {
            System.out.print(arr[dq.peekFirst()]+" ");
            //*  dq.peek()<=i-k :- means that index is in range
            while(!dq.isEmpty()&&dq.peek()<= i-k)
            {
                dq.removeFirst();
            }
            while(!dq.isEmpty()&&arr[i]>=arr[dq.peekLast()])
            {
                dq.removeLast();
            }
            dq.addLast(i);
        }

    }
}