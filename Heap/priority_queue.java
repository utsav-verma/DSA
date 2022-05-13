/**
 * * Find the median in an unsorted Array 
 * ! Solution :- 
 */


import java.util.*;
public class priority_queue {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        int arr[] = {20,10,60,30,50,40,70};
        for(int i=0;i<arr.length;i++)
        {
            if(maxHeap.isEmpty()|| maxHeap.peek()>=arr[i])
            {
                maxHeap.add(arr[i]);
            }
            else
            minHeap.add(arr[i]);

            if(maxHeap.size() > minHeap.size()+1)
            {
                minHeap.add(maxHeap.poll());
            }
            else if(maxHeap.size()<minHeap.size())
            {
                maxHeap.add(minHeap.poll());
            }
        }
        int median =0;
        System.out.println("Max  : "+maxHeap);
        System.out.println("Min : "+minHeap);
        if(maxHeap.size()==minHeap.size())
        {
            median = (maxHeap.peek() + minHeap.peek())/2;
        }
        else
        median = maxHeap.peek();
        System.out.println(median);

    }
    
}
