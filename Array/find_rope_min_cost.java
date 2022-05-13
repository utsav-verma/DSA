/**
 * * Connect N ropes with Minimum Cost.
 * ! link : - https://www.codingninjas.com/codestudio/library/connect-n-ropes-with-minimum-cost-201
 * ! Approach : - Priority Queue (min heap)
 */



import java.util.*;
public class find_rope_min_cost {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int arr[] ={2,5,4,8,6,9};
        findMin(arr);
    }

    private static void findMin(int[] arr) {
        PriorityQueue <Integer> pq = new PriorityQueue<>();
        for(int i=0;i<arr.length;i++)
        {
            pq.add(arr[i]);
        }
        int ans=0;
        while(pq.size()>1)
        {
            int first = pq.poll();
            int second = pq.poll();
            int sum =first+second;
            ans+=sum;
            pq.add(sum);
        }
        System.out.println(ans);
    }
    
}
