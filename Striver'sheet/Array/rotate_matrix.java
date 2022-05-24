/**
 * * Rotate a Matrix by 90 degree
 */


import java.util.*;
public class rotate_matrix {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n =in.nextInt();
        int arr[][] = new int [n][n];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                arr[i][j] = in.nextInt();
            }
        }
        rotate(arr);
        reverse(arr);
        System.out.println("Rotated Matrix ");
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        
    }
    public static void reverse(int arr[][])
    {
        int l=0,r=arr.length-1;

        while(l<=r)
        {
            for(int i=0;i<arr.length;i++)
            {
                int temp =arr[i][r];
                arr[i][r] =arr[i][l];
                arr[i][l] =temp;
            }
            l++;r--;
        }
    }
    public static void rotate(int [][]matrix)
    {
        int n =matrix.length;
        for(int i=0;i<matrix.length;i++)
        {
            for(int j=i;j<n;j++)
            {
                swap(matrix,i,j);
            }
        }
    }
    private static void swap(int[][] arr, int i, int j) {
        int temp =arr[i][j];
        arr[i][j]=arr[j][i];
        arr[j][i] =temp;
        
    }
    
}
