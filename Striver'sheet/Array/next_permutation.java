/**
 * *Question :- Find the next nearest greater permutation of given number and if not possible then return it in asending order
 * ! Example :- 1354 -> Ans is 1435 which is next largest
 * ! Example 2 : - 54321 - > 12345 it is the largest permutation no other largest possible
 * * Approach :- So Traverse from last and find i for which a[i]<a[i+1]
 * * After doing so again traverse from back find j so that a[j]>a[i]
 * * Now swap it if its within range
 * * Reverse the array from i+1 index
 */

import java.util.*;
public class next_permutation {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int arr[]={5,4,3,2,1};
        //* finding the i so that a[i]<a[i+1]
        int l=arr.length;
        int i=l-2;
        while(i>=0&&arr[i]>=arr[i+1])
        {
            i--;
        }
        //*Finding j for which a[j]>a[i]

        int j=l-1;
        while(i>=0&&j>=0&&arr[j]<=arr[i])
        {
            j--;
        }
        //* Swapping part
        if(i>=0 && j>=0)
        {
            swap(arr,i,j);
        }
        //* Then the last part to reverse the array from i+1;
        reverse(arr,i+1,l-1);
        System.out.println(Arrays.toString(arr));
        

    }
    public static void swap(int arr[],int i,int j)
    {
        int temp =arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static void reverse(int arr[],int l ,int r)
    {
        while(l<r)
        {
            swap(arr,l,r);
            l++;r--;
        }

    }
    
}
