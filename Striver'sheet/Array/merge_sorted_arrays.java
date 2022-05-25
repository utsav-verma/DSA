/**
 * * Questions :- Given Two Arrays in Sorted Order Merge it without using Extra Space
 * 
 */


import java.util.*;
public class merge_sorted_arrays {
   public static void main(String[] args) {
       Scanner in = new Scanner(System.in);
       System.out.println("Enter the Size of Arrays  ->");
       int n =in.nextInt();int m =in.nextInt();
       int a[] = new int[n];
       int b[] = new int [m];
       System.out.println("Enter the Elements of 1st Array");
       for(int i=0;i<n;i++)
       {
           a[i] =in.nextInt();
       }
       System.out.println("Enter the Elements of 2nd Array");
       for(int i=0;i<m;i++)
       {
           b[i] =in.nextInt();
       }
       int merge[] = new int [n+m];
       merge(a,b,merge);
       System.out.println(Arrays.toString(merge));
   }

private static void merge(int[] a, int[] b, int[] merge) {
    int i=0;
    int j=0;
    int k=0;
    int l1=a.length;
    int l2 =b.length;
    while(i<l1 && j<l2)
    {
        if(a[i]<=b[j])
        {
            merge[k++]=a[i++];
        }
        else if(b[j]<a[i])
        {
            merge[k++] =b[j++];
        }
    }
    if(i>=l1)
    {
        while(j<l2)
        {
            merge[k++] =b[j++];
        }
    }
    else if(j>=l2)
    {
        while(i<l1)
        {
            merge[k++] =a[i++];
        }
    }
} 
}
