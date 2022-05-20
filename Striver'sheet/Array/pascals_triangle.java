/**
 * * Question :- Print the Pascal's Triangle for nth row
 * ! link:- https://leetcode.com/problems/pascals-triangle/
 */
import java.util.*;
public class pascals_triangle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();

        formTriangle(n);
    }

    private static void formTriangle(int n) {
        List<List<Integer>> triangle = new ArrayList<>();
        List<Integer>prev=null,curr=null;
        for(int i=0;i<n;i++)
        {   curr = new ArrayList<>();
            for(int j=0;j<=i;j++)
            {
                if(j==0||j==i)
                curr.add(1);
                else
                curr.add(prev.get(j)+prev.get(j-1));
            }
            prev =curr;
            triangle.add(curr);
        }
        for(List i : triangle)
        {
            System.out.println(i);
        }
    }
}
