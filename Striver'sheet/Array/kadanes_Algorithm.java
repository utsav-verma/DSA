/**
 * * Question :- Find the Subarray with maximum sum
 * 
 */


import java.util.*;
public class kadanes_Algorithm {
   public static void main(String[] args) {
       Scanner in = new Scanner(System.in);
       int arr[]={-2,1,-3,4,-1,2,1,-5,4};

       int currSum=0;
       int maxSum=arr[0];
        int start =0,end =-1;
       for(int i=0;i<arr.length;i++)
       {
           currSum+=arr[i];
           if(currSum>maxSum)
           {
               maxSum=currSum;
               end =i;
           }
           if(currSum<0)
           {
               start=i+1;
               currSum=0;
           }
       }
       System.out.println(maxSum);
       System.out.println(start+" "+end);
   } 
}
