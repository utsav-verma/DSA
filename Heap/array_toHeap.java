/**
 * *Converting an Array to Max Heap Structure
 */

import java.util.*;
public class array_toHeap {
public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int arr[] ={0,20,10,30,5,50,40};
    // * Convert this into MAX Heap Structure
    // convert(arr,arr.length-1);
    int n =arr.length-1;
    buildHeap(arr,n);
    // heapify(arr,n,n/2);
    System.out.println(Arrays.toString(arr));
}
    public static void buildHeap(int arr[],int n)
    {
        for(int i=n/2;i>0;i--)
        {
        
            heapify(arr,n,i);
        }
    }
    public static void heapify(int arr[],int n,int i)
    {
        int largest =i;
        int r = 2*i+1;
        int l = 2*i;

        if(r<=n&&arr[r]>arr[largest])
        largest =r;
        if(l<=n&&arr[l]>arr[largest])
        largest =l;
        if(largest!=i)
        {

            swap(arr,i,largest);
            heapify(arr,n,largest);
        }
    }
    private static void swap(int[] arr, int i, int largest) {
        int temp = arr[largest];
        arr[largest] =arr[i];
        arr[i] = temp;
    }
}
