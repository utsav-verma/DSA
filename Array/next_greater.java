/*
 * The task is to find the next greater number that could be made from given numbers.
 * Like example :- 534976 so the next greater is 536479.
 ! Approcah :- Traverse the array from right side and if you find any number at i  which is greater than i-1 
 ! you terminate the loop and then we have to find the next number which is just gretaer than arr[i-1]
 ! In the above example i will  stop at 9 as 9 is grater than 4 and then the just greater number to 4 is 6
 ! and then we swap the digits and digits in between get replaced;
 */
import java.util.*;
public class next_greater {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String num =in.next();
        int nums[] = new int[num.length()];
        for(int i=0;i<nums.length;i++)
        {
            char ch =num.charAt(i);
            nums[i] =ch-'0';

        }
        nextGreater(nums,nums.length);
        System.out.println(Arrays.toString(nums));
    }
    public static void nextGreater(int arr[],int n)
    {
        if(n==1)
        return;

        int i=n-2;
        while(i>=0 && arr[i]>arr[i+1]) i--;
        if(i!=0)
        {
            int j = n-1;
            while(arr[j]<=arr[i]) j--;
            swap(arr,i,j);
            reverse(arr,i+1,n-1);
        }
    }
    public static void reverse(int nums[],int i,int j)
    {
        while(i<j)
        {
            swap(nums,i,j);
            i++;j--;
        }
    }
    public static void swap(int arr[],int i,int j)
    {
        int temp =arr[i];
        arr[i] = arr[j];
        arr[j] =temp;
    }
}
