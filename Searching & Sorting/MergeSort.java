/**
 * MergeSort
 */
import java.util.*;
public class MergeSort {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int nums[]={5,7 , 2 ,1 ,9 ,0 ,-9};
        //Sort the array using merge Sort
        mergeSort(nums,0,nums.length-1);
        System.out.println(Arrays.toString(nums));
    }

    private static void mergeSort(int[] nums, int l, int r) {
        if(l<r)//atleast two element check in array
        {
            int mid = (l+r)/2;
            mergeSort(nums, l, mid);
            mergeSort(nums, mid+1, r);
            merge(nums,l,mid,r);
        }
    }

    private static void merge(int[] nums, int l, int mid, int r) {
        int i=l,j=mid+1,k=l;
        int b[]= new int[nums.length];//reference Array

        while(i<=mid && j<=r)
        {
            if(nums[i]<nums[j])
            {
                b[k++]=nums[i++];
            }
            else
            {
                b[k++] = nums[j++];
            }
        }
        
        for(k=l;k<=r;k++)
        {
            nums[k] = b[k];
        }
    }
}