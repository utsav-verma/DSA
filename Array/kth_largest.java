/**
 * * Question : Find the kth Largets Element in an Array
 * ! link : -https://leetcode.com/problems/kth-largest-element-in-an-array/
 * * a =[20,10,60,30,50,40]
 * * So in this Array if k= 3 then the 3rd Largest Element is 40 , a =[10,20,30,40,50,60]
 * ! Approach 1
 * * Sort the Array using Merge sort and then return the a[k] that will be kth largest
 * 
 * ! Approach 2
 * * Using Priority Queue (Min Heap) create a Queue of Size k and store the 1st k elements in queue and for rest
 * * Check if the queue top is less than other elemenst if yes swap this way at last queue's top will have kth largest 
 */



import java.util.*;
public class kth_largest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int arr[] ={20,10,60,30,50,40};
        int k=2;
        PriorityQueue <Integer> pq = new PriorityQueue<>();
        for(int i=0;i<k;i++)
        {
            pq.add(arr[i]);
        }
        System.out.println(pq);
        for(int i=k;i<arr.length;i++)
        {
            if(pq.peek()<arr[i])
            {
                pq.poll();
                pq.add(arr[i]);
            }
            // System.out.println(pq);
        }
        System.out.println(pq.peek());
    }
}
