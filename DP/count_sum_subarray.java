/**
 * count_sum_subarray
 * * We have to return the number of subarray that has the same sum as given sum
 * * arr[]={2,3 5,6,8,10};
 * *so the given sum =10
 * * Possible combinations are :- {2,8},{2,3,5},{10} so the answer is 3
 */
import java.util.*;

public class count_sum_subarray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the size of Array > ");
        int n =in.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=in.nextInt();
        }
        int count = count_subarray(arr,n-1,10,0);
        System.out.println(count);
        map = new HashMap<>();
        int cou =count_subarray_dp(arr, n-1, 10, 0);
        System.out.println(cou);

    }
    static Map<String,Integer>map;
    private static int count_subarray(int[] arr, int n,int sum,int currSum) {

        if(n<0)
        {
            return 0;
        }
        
        if(arr[n]+currSum==sum)
        {
            return 1+count_subarray(arr, n-1, sum, currSum+arr[n])+count_subarray(arr, n-1, sum, currSum);
        }
        else if(arr[n]+currSum<sum)
        {
            return count_subarray(arr, n-1, sum, currSum+arr[n])+count_subarray(arr, n-1, sum, currSum);
        }
        return count_subarray(arr, n-1, sum, currSum);
    }
    static int count =0;
    private static int count_subarray_dp(int[] arr, int n,int sum,int currSum) {
        int c=0;
        if(n<0)
        {
            return 0;
        }
        String a = Integer.toString(n)+"-"+Integer.toString(currSum);
        if(map.containsKey(a))
        {
            c = map.get(a);
            return c;
        }
        if(arr[n]+currSum==sum)
        {
            c= 1+count_subarray(arr, n-1, sum, currSum+arr[n])+count_subarray(arr, n-1, sum, currSum);
        }
        else if(arr[n]+currSum<sum)
        { 
            c= count_subarray(arr, n-1, sum, currSum+arr[n])+count_subarray(arr, n-1, sum, currSum);
        }
        else
            c=count_subarray(arr, n-1, sum, currSum);
        map.put(a,c);
        return c;
    }
    
}