/*
 * Question:- We have to find the maximum area of island.
 ! link:- https://leetcode.com/problems/max-area-of-island/submissions/
 ! Approach :-  we use dfs method where we traverse every connected island and mark them as 0 and move to its neighbours
 */
import java.util.*;
public class max_area_island {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the row and coloums > ");
        int row = in.nextInt();
        int col =in.nextInt();
        int grid[][] = new int[row][col];
        System.out.println("Enter the elements in grid");
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                grid[i][j] =in.nextInt();
            }
        }
        int area =maxAreaIsland(grid,row,col);
        System.out.println(area);
    }

    private static int maxAreaIsland(int[][] grid, int row, int col) {
        int ans=0;

        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                if(grid[i][j]==1)
                {
                    int area =dfs(grid,i,j,row,col);
                    ans =Math.max(area,ans);
                }
            }
        }
        return ans;
    }   
    private static int dfs(int[][] grid, int i, int j, int row, int col) {
        int area=1;
        grid[i][j]=0;

        if(isValid(grid,i+1,j,row,col))
        {
            area+=dfs(grid,i+1,j,row,col);
        }
        if(isValid(grid,i-1,j,row,col))
        {
            area+=dfs(grid,i-1,j,row,col);
        }
        if(isValid(grid,i,j+1,row,col))
        {
            area+=dfs(grid,i,j+1,row,col);
        }
        if(isValid(grid,i,j-1,row,col))
        {
            area+=dfs(grid,i+1,j-1,row,col);
        }
        return area;
    }

    private static boolean isValid(int[][] grid, int i, int j, int row, int col) {
        if(i<row && i>=0 && j>=0 && j<col && grid[i][j]==1)
        {
            return true;
        }
        return false;
    }   
}
