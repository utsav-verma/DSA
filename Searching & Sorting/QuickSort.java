/*
Quick Sort :- So we choose an pivot element and all less then pivot is send forward
All Greater than pivot is send Backward;
*/
import java.util.*;
public class QuickSort {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        int nums[]={10, 7, 8, 9, 1, 5};
        quickSort(nums,0,nums.length-1);
        System.out.println(Arrays.toString(nums));
        
    }


    private static void quickSort(int[]nums, int l, int r) {
        if(l<r)
        {
            int pivot = partition(nums,l,r);
            quickSort(nums,l,pivot-1);
            quickSort(nums,pivot+1,r);
        }

    }
    public static int partition(int nums[],int l,int r) {
        
        int i=l,j=r;
        
        int pivot = nums[l];
        while(i<j)
        {
            while(nums[i]<=pivot&&i<r)
            {
                i++;
            }
            while(nums[j]>pivot&&j>=l)
            {
                j--;
            }
            if(i<j)
            swap(nums,i,j);

        }
        if(pivot!=nums[j])
        swap(nums,l,j);
        return j;
        
    }
    public static void swap(int nums[],int i,int j) {
        int temp =nums[i];
        nums[i] = nums[j];
        nums[j]=  temp;
        
    }
    
    
}
