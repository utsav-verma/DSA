import java.util.*;
public class n_queen {
    //Placing all the n queens in grid such that no queens attack each other
    /*Best Approach would be to place a queen in each row at specific column and 
    recursively check the sub problem , if it matches the condition then good else back to previous row and change the column*/

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a[][]= new int [6][6];
        for(int i[]:a)
        Arrays.fill(i,0);
        // display(a);
        boolean place =n_queen(a,0);
        if(!place)
        System.out.println("Not Possible !!");
       
        }
    
    public static boolean n_queen(int [][]arr,int row)
    {
        int n =arr.length;
        if(row==n)
        {
            display(arr);
            return true;
        }
        for(int i=0;i<n;i++)
        {
            if(isSafe(arr,row,i))
            {
                arr[row][i]=1;
                n_queen(arr,row+1);
            }
            arr[row][i]=0;
        }
        return false;
    }
    public static boolean isSafe(int arr[][],int row,int col)
    {
        int n =arr.length;
        int i=0,j=0;
        
        //left upper diagonal
        i=row;
        for(j=col;j>=0&&i>=0;j--)
        {
            if(arr[i--][j]==1)
            return false;
        }
        //right upper diagonal
        i=row;
        for(j=col;i<n&&i>=0&&j>=0&&j<n;j++)
        {
            if(arr[i--][j]==1)
            return false;
        }
        //right lower diagonal 
        i= row;
        for(j=col;i<n&&i>=0&&j>=0&&j<n;j++)
        {
            if(arr[i++][j]==1)
            return false;
        }
        // left lower diagonal 
        i=row;
        for(j=col;i<n&&i>=0&&j>=0&&j<n;j--)
        {
            if(arr[i++][j]==1)
            return false;
        }


        //above row
        for(i=0;i<row;i++)
        {
            if(arr[i][col]==1)
            return false;
        }
        //below row
        for(i=row+1;i<n;i++)
        {
            if(arr[i][col]==1)
            return false;
        }



        return true;
        
    }
    public static void display(int arr[][])
    {
        int n =arr.length;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++){

                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();
    }
}
//Time Complexity is  O(n^2)
//To access the row and column of matrix min complexity is n^2
