/**
 * police_station
 */
import java.util.*;
public class police_station {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n =in.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i] =in.nextInt();
        }
        int k =in.nextInt();
        ArrayList<Integer>leftSum = new ArrayList<>();
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        int sum=0;
        for(int i=0;i<n;i++)
        {
            if(pq.size()<k)
            {
                pq.add(arr[i]);
                sum+=arr[i];
            }
            if(pq.size()==k && pq.peek()<arr[i])
            {
                sum-=pq.peek();
                pq.poll();
                sum+=arr[i];
                pq.add(arr[i]);
            }
            leftSum.add(sum);
        }
        System.out.println(leftSum);
        sum=0;
        PriorityQueue<Integer>pq2 = new PriorityQueue<>(Collections.reverseOrder());
        ArrayList<Integer>rightSum = new ArrayList<>();
        for(int i=n-1;i>=0;i--)
        {
            if(pq2.size()<k)
            {
                pq2.add(arr[i]);
                sum+=arr[i];
            }
            if(pq2.size()==k&&pq2.peek()>arr[i])
            {
                sum-=pq2.peek();
                pq2.poll();
                pq2.add(arr[i]);
                sum+=arr[i];
            }
            rightSum.add(sum);
        }
        Collections.reverse(rightSum);
        System.out.println(rightSum);
        int max=Integer.MIN_VALUE;
        int j=1;
        for(int i=0;i<n-2;i++)
        {
            int diff = leftSum.get(i)-rightSum.get(i+1);
            System.out.println(diff);
            max =Math.max(diff,max);
        }
        System.out.println(max);
    }
}