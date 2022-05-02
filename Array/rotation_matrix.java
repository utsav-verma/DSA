import java.util.*;
public class rotation_matrix {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n =in.nextInt();
        int arr[][] = new int [n][n];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                arr[i][j]=in.nextInt();
            }
        }
        Transpose(arr);
        System.out.println("The rotated matrix is > ");
        swap_coloumn(arr);
        display(arr);
    }
    public  static void display(int arr[][]) {
        int n =arr.length;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        
    }
    public static void swap_coloumn(int arr[][])
    {
        int start =0,end = arr.length-1;
        while(start<=end)
        {
            for(int i=0;i<arr.length;i++)
            {
                int temp = arr[i][start];
                arr[i][start] = arr[i][end];
                arr[i][end] = temp;
            }
            start++;end--;
        }
    }
    public static void Transpose(int arr[][]) {
        int n =arr.length;
        for(int i=0;i<n;i++)
        {
            for(int j=i;j<n;j++)
            {
                int temp =arr[i][j];
                arr[i][j] =arr[j][i];
                arr[j][i]=temp;
            }
        }
        
    }
}
