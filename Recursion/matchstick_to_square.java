/*
 * Question :- We are given the array of matchsticks where m[i]= height of matchstick
 * we have to Arrange the match stick in such a way that it forms a sqaure
 * we are not allowed to break a match strick but we can keep two samll matchticks together.
 ! LinK-https://leetcode.com/problems/matchsticks-to-square/submissions/
 ! Approach :-  we take find the perimeter of Array and check if its divisible by 4 ,
 ! if yes then it might be possible to create a sqaure
 ! Now we create Array side of length 4
 ! We assign every side[i] = perimeter/4
 ! we run a recursion and check if that matchaticks fits that side or not ,
 ! Using backtracking we find the solution if keeping the matchstick in i is not working we check for i+1 place
 ! this way we are getting the solution,
 ! to optimize it sort the array

 */
/*
 * Time Complexity :- O(4^n)
 */

import java.util.*;
public class matchstick_to_square {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n =in.nextInt();
        int mat[] = new int[n];
        System.out.println("Enter the Elements >");
        for(int i=0;i<n;i++)
        {
            mat[i] = in.nextInt();
        }
        
        System.out.println(matchToSquare(mat,n));
    
    }
    private static boolean matchToSquare(int mat[], int n) {
        if(mat.length<4)
            return false;

        int perimeter=0;
        for(int i:mat)
        {
            perimeter+=i;
        }
        if(perimeter%4!=0)
        return false;

        Arrays.sort(mat);
        int sides[] = new int[4];
        Arrays.fill(sides,perimeter/4);
        return makeSqaureUtil(mat,sides,n-1);

    }
    private static boolean makeSqaureUtil(int[] mat, int[] sides, int i) {
        if(i==-1)
        {
            return (sides[0]==sides[1] && sides[1]==sides[2] && sides[2]==sides[3]) ;
        }

        for(int j=0;j<4;j++)
        {
            if(sides[j]>=mat[i])
            {
                sides[j]-=mat[i];
                if(makeSqaureUtil(sides,sides,i-1))
                return true;
                sides[j]+=mat[i];
            }
        }
        return false;
    }
}
