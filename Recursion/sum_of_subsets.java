import java.util.*;
public class sum_of_subsets {
   public static void main(String[] args) {
       Scanner in = new Scanner (System.in);
       int n =in.nextInt();
       int arr[]=new int [n];
       for(int i=0;i<n;i++)
       {
           arr[i]= in.nextInt();
       }
       System.out.println("All permuted sums : - ");
       all_sum(arr,0,0);
       System.out.println();
   } 
   public static void all_sum(int arr[],int i,int sum)
   {
       if(i==arr.length)
       {
           System.out.print(sum+" ");
           return;
       }
       all_sum(arr,i+1,arr[i]+sum);
       all_sum(arr,i+1,sum);
   }
}
