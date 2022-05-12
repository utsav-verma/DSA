/**
 * * Question :- https://leetcode.com/problems/pancake-sorting/submissions/
 * ! Approach 1 :- 
 * * 1. Traverse through the arr of size n and find the n element and flip it to 1st index and then reverse it entirely 
 * * 2. Repeat the same process and reduce the value of n by 1 .
 *  * this way at the last index array would be sorted . its similar to bubble sort.
 */



import java.util.*;
public class pancake_flip {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int arr []= {3,2,4,1};
        pancakeSort(arr);

    }
    public static void pancakeSort(int[] arr) {
        int n = arr.length-1;
        List<Integer> flip = new ArrayList<>();
        for(int i =n;i>=0;i--)
        {
            for(int j =0;j<=i;j++)
            {
                if(arr[j]==i+1&&arr[j]!=j+1)
                {
                    flip.add(j+1);
                    rotate(arr,0,j);
                    flip.add(i+1);
                    rotate(arr,0,i);
                }
            }
        }
        System.out.println(flip);
        // return flip;
        
    }
    public static void rotate(int arr[],int i,int j)
    {
        while(i<j)
        {
            if(i!=j)
            {
                swap(arr,i,j);
            }
            i++;j--;
        }
    }
    public static void swap(int arr[],int i,int j)
    {
        int temp =arr[i];
        arr[i] = arr[j];
        arr[j] =temp;
    }
}
