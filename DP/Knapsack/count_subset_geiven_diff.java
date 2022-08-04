/*
 * Question :- You are given an array and a Target diff we have to find out how many subset diff will result in target
 * So basically we have to count
 ! Approach:- Now suppose the 's' is sum of array elements
 ! s1 and s2 are subsets whose diff is target
 ! we know s1+s2 =s and s1-s2 =diff
 ! Adding both eq we get 2s1 = s+diff
 */
import java.util.*;
public class count_subset_geiven_diff {
    static int mat[][];
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n =in.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++)
        arr[i] =in.nextInt();
        int target =in.nextInt();
        int sum=target;
        for(int i=0;i<n;i++)
        {
            sum+=arr[i];
        }
        mat= new int[n][sum];
        for(int i[]:mat)
        {
            Arrays.fill(i,-1);
        }
        System.out.println(count_subset(arr,0,0,sum));

    }
    // public static int count_subset(int arr[],int i,int s1,int sum)
    // {
    //     if(i==arr.length)
    //     return 0;

    //     if(mat[i][s1]!=-1)
    //     return mat[i][s1];
    //     if(2*(arr[i]+s1)==sum)
    //     {
    //         mat[i][s1]= 1+count_subset(arr,i+1,s1+arr[i],sum)+count_subset(arr,i+1,s1,sum);
    //     }
    //     else
    //     mat[i][s1]= count_subset(arr,i+1,s1,sum)+count_subset(arr,i+1,s1+arr[i],sum);

    //     return mat[i][s1];
    // }
    public static int count_subset(int arr[],int i,int s1,int sum)
    {
        if(i==arr.length)
        return 0;

       
        if(2*(arr[i]+s1)==sum)
        {
            return 1+count_subset(arr,i+1,s1+arr[i],sum)+count_subset(arr,i+1,s1,sum);
        }
        
        return count_subset(arr,i+1,s1,sum)+count_subset(arr,i+1,s1+arr[i],sum);

        
    }
}
