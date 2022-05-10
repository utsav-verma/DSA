/**
 *  * In this WE shall be delteing the created heap
 */


import java.util.*;
public class array_To_deleteHeap {
    static int ptr;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        int arr[]  = new int[size+1];
        for(int i=1;i<=size;i++)
        {
            int value = in.nextInt();
            insert(arr,i,value);
        }
        ptr =size;
        // System.out.println(Arrays.toString(arr));
        System.out.println("Heap Structure");
        display(arr);
        System.out.println("Delete Operation ");
        // while(ptr-->3)
        // {

        //     delete(arr);
        //     display(arr);
        // }
        delete(arr);
        delete(arr);
        delete(arr);
        delete(arr);
        delete(arr);
        delete(arr);
        delete(arr);
        display(arr);
    }
    public static void insert(int arr[],int n,int value) {
        int i = n;
        if(n<arr.length)
        {
            arr[n] = value;
            while(i>1)
            {
                int parent = i/2;
                if(arr[parent]<arr[i])
                {
                    swap(arr,parent,i);
                    i =parent;
                }
                else
                break;
            }
        }
        else
        {
            System.out.println("No Insertion Possibel");
        }
        
    }
    public static void display(int arr[])
    {
        for(int i=1;i<=ptr;i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    private static void swap(int[] arr, int parent, int i) {
        int temp = arr[parent];
        arr[parent] = arr[i];
        arr[i] = temp;
    }
    private static void delete(int arr[]) {
        // System.out.println("Ptr : "+ptr);
        if(ptr>0)
        {
            arr[1] = arr[ptr];
            ptr--;
            // display(arr[1]);
            // System.out.println(arr[1]);
            int largest =1; 
            int i=1;
            while(i<=ptr)
            {
                int left = 2*i;
                int right = 2*i+1;
                // display(arr);
                if(left<=ptr && arr[left]>arr[largest])
                largest =left;
                if(right<=ptr && arr[right]>arr[largest])
                largest = right;

                if(largest!=i)
                {

                    swap(arr,i,largest);
                    i=largest;
                }
                else
                break;
            }
            // System.out.println("End");
        }
        else
        System.out.println("All Elements are Deleted");
        
    } 
}
