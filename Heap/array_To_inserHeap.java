/*abstract
Heap is a Complete Binary Tree with Heap Properties
Heap Properties are : 1) MAX HEAP  2) MIN HEAP
1) MAX HEAP : In this the root node is always bigger than its left and right Node
2) MIN HEAP : Int this the root node is always smaller than its left and right Node


*/
import java.util.*;

public class array_To_inserHeap{

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();//Size of Array
        int n[] = new int[size+1];

        for(int i=0;i<size;i++)
        {
            int value = in.nextInt();
            insert(n,i,value);
        }
        System.out.println(Arrays.toString(n));



                                                  
    }
    /** 
    * * For Node : i
    **Parent : - i/2;
    **left :- 2*i;
    **right :- 2*i+1
    **/

    public static void insert(int arr[],int n ,int value)
    {
        n = n+1;
        if(n<arr.length)
        {
            arr[n]=value;
            int i=n;
            while(i>1)
            {
                int parent = i/2;
                if(arr[parent]<arr[i])
                {
                    swap(arr,parent,i);
                    i=parent;
                }
                else
                break;
    
            }
        }
        else
        {
            System.out.println("Insertion not Possible !!!");
        }
    }
   
    public static void swap( int arr[],int i,int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
   
}