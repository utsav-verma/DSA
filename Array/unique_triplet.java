import java.util.ArrayList;
import java.util.Arrays;

import javax.lang.model.util.ElementScanner14;

/**
 * unique_triplet
 */
/*
Question :-https://www.geeksforgeeks.org/unique-triplets-sum-given-value/
To find unique triplet which adds upto given sum
*/


public class unique_triplet {
    public static void merge_sort(int arr[],int l,int r)
    {
        
        if(l<r)
        {
            int mid = (l+r)/2;
            merge_sort(arr, l, mid);
            merge_sort(arr, mid+1,r);
            merge(arr,l,mid,r);
        }
    }
    private static void merge(int[] arr, int l, int m, int r) {
        int n1 = m - l + 1;
        int n2 = r - m;
  
        /* Create temp arrays */
        int L[] = new int[n1];
        int R[] = new int[n2];
  
        /*Copy data to temp arrays*/
        for (int i = 0; i < n1; ++i)
            L[i] = arr[l + i];
        for (int j = 0; j < n2; ++j)
            R[j] = arr[m + 1 + j];
  
        /* Merge the temp arrays */
  
        // Initial indexes of first and second subarrays
        int i = 0, j = 0;
  
        // Initial index of merged subarray array
        int k = l;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            }
            else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }
  
        /* Copy remaining elements of L[] if any */
        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }
  
        /* Copy remaining elements of R[] if any */
        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }
    }
  
    // Main function that sorts arr[l..r] using
    // merge()
    void sort(int arr[], int l, int r)
    {
        if (l < r) {
            // Find the middle point
            int m =l+ (r-l)/2;
  
            // Sort first and second halves
            sort(arr, l, m);
            sort(arr, m + 1, r);
  
            // Merge the sorted halves
            merge(arr, l, m, r);
        }

    }
    public static void main(String[] args) {
        int arr[] ={12, 3, 6, 1, 6, 9};
        int sum =16;
        int n =arr.length-1;
        merge_sort(arr, 0, n);
        int start =0,end=n;
        ArrayList<ArrayList<Integer>> allTrip = new ArrayList<>();

        for(int i=0;i<arr.length-3;i++)
        {
            // if(arr[i]==arr[i+1])
            // {
            //     // /To avoid Repetation in Triplet
            //     continue;
            // }
            int first =arr[i];
            start =i+1;
            while(start<end)
            {
                int second = arr[start];
                int s = sum -(first+second);
                if(arr[end]==s)
                {
                    ArrayList<Integer> trip =new ArrayList<>();
                    trip.add(first);
                    trip.add(second);
                    trip.add(s);
                    allTrip.add(trip);
                    start++;end--;
                }
                else if(arr[end]>s)
                {
                    end--;
                }
                else
                {
                    start++;
                }

            }
        }
        if(allTrip.isEmpty())
        {
            System.out.println("No Unique Triplet!!");
        }
        else
        System.out.println(allTrip);
    }
    
}