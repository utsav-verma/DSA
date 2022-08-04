/*
 * Question :- We are given array {1,1,2,3} we have to assign sign, so that
 * we get the target sum and count how many such possible solutions are possible
 * so here target is 1 
 * so combos are {+1,+3,-1,-2} =1 , {+1,+1,+2,-3}=1
 ! Approach let s be sum of Array so find the subsetset s1 so that s-s1 = target sum

 */
import java.util.*;
public class target_sum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n =in.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i] = in.nextInt();
        }
        int d =in.nextInt();
        int sum =0;
        for(int i=0;i<n;i++)
        sum+=arr[i];
        System.out.println(count_subset(arr,0,0,sum,d));
    }
    private static int count_subset(int arr[] ,int i,int s1,int sum,int target)
    {
        if(i==arr.length)
        return 0;
        if(sum-(s1+arr[i])==target)
        return 1+count_subset(arr,i+1,s1+arr[i],sum,target)+count_subset(arr,i+1,s1,sum,target);
        return count_subset(arr,i+1,s1+arr[i],sum,target)+count_subset(arr,i+1,s1,sum,target);
    }
}
