/*
 * Find the Majority Elemnts with frequency more than n/3 times where n is the size of Array.
 ! Approach Boore Morre Majority Algorithm.
 */
import java.util.*;
public class majority_element {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n =in.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i] = in.nextInt();
        }
        majorityElements(arr,n);
    }

    private static void majorityElements(int[] arr, int n) {
        int num1=Integer.MIN_VALUE;
        int num2=Integer.MIN_VALUE;
        int c1=0,c2=0;
        for(int i:arr)
        {
            if(i==num1)c1++;
            else if(i==num2)c2++;
            else if(c1==0)
            {
             num1=i;
             c1=1;
            }
            else if(c2==0)
            {
             num2=i;
             c2=1;
            }
            else
            {
                c1--;
                c2--;
            }
        }
        c1=0;c2=0;
        for(int i:arr)
        {
            if(i==num1)c1++;
            if(i==num2)c2++;
        }
        if(c1>(n/3))
        System.out.println(num1);
        if(c2>(n/3))
        System.out.println(num2);
    }
}
