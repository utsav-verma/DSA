/*
 * Question :- Given Array and a difference so basically we have to divide the array into two subsets(s1,s2) such that 
 * their differnce is = given diff so we have to count how many such subsets exits
 ! Approach :- S1-S2 = d ->1
 ! WE know s1+s2 =S(sum of Array Elements) ->2
 ! as we add eq 1 and 2 we get 2S1 = S+diff, using this we shal calculte how many such sum exists.
 */
import java.util.*;
public class count_diff_given_sum {
    static int mat[][];
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n =in.nextInt();
        System.out.println("Enter the Elements in Array > ");
        int arr[] = new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i] = in.nextInt();
        }
        System.out.println("Enter the Difference");
        int diff =in.nextInt();
        int sum=0;
        for(int i=0;i<n;i++)
        {
            sum+=arr[i];
        }
        mat = new int[n][sum+1];
        Arrays.fill(mat,Integer.MIN_VALUE);
        System.out.println(findCount(arr,0,0,sum,diff));
        
    }
    private static int findCount(int[] arr, int i, int s, int sum, int diff) {

    }
    

    
}
