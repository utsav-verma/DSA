import java.util.*;
public class heap_sort {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int arr[] = {0,20,10,30,5,50,40};
        int n =arr.length-1;
        buildHeap(arr,n);
        heapSort(arr,n);
        System.out.println(Arrays.toString(arr));
    }
    public static void heapSort(int arr[],int n) {
        int i=n;
        while(i>1)
        {
            swap(arr,i,1);
            heapify(arr,i-1,1);
            i--;
        }

        
    }
    private static void buildHeap(int[] arr, int n) {
        for(int i=n/2;i>0;i--)
        {
            // * Builds Heap below that level
            heapify(arr,n,i);
        }
    }

    private static void heapify(int[] arr, int n, int i) {
        int largest= i;
        int l=2*i;
        int r= 2*i+1;
        
        if(r<=n &&arr[r]>arr[largest])
        {
            largest = r;
        }

        if(l<=n && arr[l]>arr[largest])
        {
            largest =l;
        }

        if(largest!=i)
        {
            swap(arr,i,largest);
            heapify(arr,n,largest);
        }

    }
    public static void swap(int arr[],int i,int j) {
        int temp = arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
        
    }
    
}
