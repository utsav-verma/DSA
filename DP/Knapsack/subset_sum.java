/*
 * Question:- If the given Array has the particular sum
 * Suppose Array is {1,5,11} and given sum =6 so we have to state that
 * is there any subset which will result in given sum so yees there is 
 * {1,5} =6
 */
import java.util.*;
public class subset_sum {
    static boolean mat[][];
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n =in.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i] = in.nextInt();
        }

        System.out.println("Enter the given sum ");
        int given_sum = in.nextInt();
        // System.out.println(isSubset(arr,0,given_sum));

        //* Memoization
        mat = new boolean[n][given_sum+1];
        System.out.println(issubsetSum(arr,given_sum));
        
    }
    public static boolean isSubset(int arr[],int i,int given_sum)
    {
        if(given_sum==0)
        {
            return true;
        }
        if(i==arr.length)
        {
            return false;
        }
        if(arr[i]>given_sum)
        return isSubset(arr,i+1,given_sum);

        return isSubset(arr,i+1,given_sum)||isSubset(arr,i+1,given_sum-arr[i]);
        
    }
    public static boolean issubsetSum(int arr[],int given_sum)
    {
        for(int i=1;i<=given_sum;i++)
        {
            mat[0][i] = false;
        }
        for(int i =0;i<arr.length;i++)
        {
            mat[i][0]=true;
        }
        for(int i=1;i<arr.length;i++)
        {
            for(int j=1;j<=given_sum;j++)
            {
                mat[i][j] = mat[i-1][j];
                if(j>=arr[i-1])
                {
                    mat[i][j] = mat[i][j]||mat[i-1][j-arr[i-1]];
                }
            }
        }
        return mat[arr.length-1][given_sum];
    }
    public static int minimum(int n,int sum)
    {
        int min = Integer.MAX_VALUE;
        for(int i=0;i<=sum/2;i++)
        {
            if(mat[n-1][i]==true)
            {
                min = Math.min(min,sum-(2*i));
            }
        }
        return min;
    }
}
