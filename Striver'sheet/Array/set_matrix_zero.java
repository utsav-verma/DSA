/**
 ** Question:- Given a matrix if an element in the matrix is 0 then you will have to set its entire 
 **column and row to 0 and then return the matrix.
 * ! link :- https://takeuforward.org/data-structure/set-matrix-zero/
 */
import java.util.*;
public class set_matrix_zero {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n =in.nextInt();
        int arr[][] = new int[n][n];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                arr[i][j] = in.nextInt();
            }
        }

        int matrix[][] = new int[n][n];
        int value =-1;
        System.out.println();
        for(int i=0;i<n;i++)
        {
            value =-1;
            for(int j=0;j<n;j++)
            {
                if(arr[i][j]==0)
                {
                    int k=j;
                    while(k>=0)
                    {
                        matrix[i][k]=0;
                        k--;
                    }
                    k=i;
                    while(k>=0)
                    {
                        matrix[k][j]=0;
                        k--;
                    }
                    value=1;
                }
                else
                {
                    matrix[i][j]=arr[i][j];
                }
                if(value==1)
                {
                    matrix[i][j]=0;
                }     

            }
        }
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                System.out.print(matrix[i][j]+" ");
            }

            System.out.println();
        }
    }
}