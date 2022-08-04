import java.util.*;
/*
 * rod_cutting
 * Questions:- https://www.geeksforgeeks.org/cutting-a-rod-dp-13/
 ! Approach :- 
 */
public class rod_cutting {
    static int mat[];
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n =in.nextInt();
        int arr[] = new int [n];
        for(int i=0;i<n;i++)
        {
            arr[i] =in.nextInt();
        }
        int sum =0;
        for(int i=0;i<n;i++)
        {
            sum+=arr[i];
        }
        System.out.println(rodCutting(arr,0,n));
    }
    private static int rodCutting(int[] arr, int i,int n) {
        if(i==arr.length) return 0;
        if(n==0)
        return 0;
        if(n-i-1>=0)
        {
            return Math.max(rodCutting(arr,i+1,n),arr[i]+rodCutting(arr, i, n-i-1));
        }
        return rodCutting(arr,i+1,n);
    }

}