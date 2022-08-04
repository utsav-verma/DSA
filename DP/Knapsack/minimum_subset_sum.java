/*
 * Question :- We have to divide the given Array in two part s1 ad s2 such that
 * s2-s1 is min throut the Array
 * Example:- {1,6,11,5} so {1,6,5} and {11} so the minmium val = 0;
 ! Approach would be , we know that sum = s1+s2 where sum is ,sum of all the elements in array.
 ! s2 = sum-s1 so diff =s2-s1 can be written as sum-s1-s1 = sum-2s1 , so we have to find value where
 ! sum-s1 is minimum
 */
/**
 * minimum_subset_sum
 */
import java.util.*;
public class minimum_subset_sum {

    static boolean mat[][];
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n =in.nextInt();
        int arr[] = new int[n];
        int sum=0;
        for(int i=0;i<n;i++)
        {
            arr[i] = in.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            sum+=arr[i];
        }
        mat = new boolean[n][sum+1];
        boolean ans =subsetSum(arr,arr.length,sum);
        System.out.println(minimum(arr.length, sum));
        for(boolean[]i:mat)
        {
            System.out.println(Arrays.toString(i));
        }
    }
    public static boolean subsetSum(int arr[],int n,int sum)
    {
        for(int i=0;i<n;i++)
        {
            mat[i][0] =true;
        }
        for(int i=1;i<=sum;i++)
        {
            mat[0][i] =false;
        }

        for(int i=1;i<n;i++)
        {
            for(int j=1;j<=sum;j++)
            {
                mat[i][j] = mat[i][j-1];
                if(j>=arr[i])
                {
                    mat[i][j] = mat[i][j]||mat[i-1][j-arr[i-1]];
                }
            }
        }
        return mat[n-1][sum];
    }
    public static int minimum(int n,int sum)
    {
        int min = Integer.MAX_VALUE;
        for(int i=0;i<sum/2;i++)
        {
            if(mat[n-1][i]==true)
            {
                min = Math.min(min,sum-(2*i));
            }
        }
        return min;
    }
}