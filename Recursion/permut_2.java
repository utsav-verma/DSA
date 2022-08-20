/*
 * https://leetcode.com/problems/permutations-ii/
 */
import java.util.*;
public class permut_2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        // ArrayList<Integer> arr = new ArrayList<>();
        int arr[] = new int[n];
        for(int i =0;i<n;i++)
        {
           arr[i] = in.nextInt();
        }
        Set<String> ans = new HashSet<>();
        permutation(arr,0,ans);
        System.out.println(ans.size());
    }
    public static void permutation(int arr[],int i,Set<String> ans)
    {
        if(i==arr.length) return;
        ans.add(Arrays.toString(arr));
        for(int j=i;j<arr.length;j++)
        {
            swap(arr,i,j);
            // ans.add(Arrays.toString(arr));
            permutation(arr,i+1,ans);
            swap(arr,i,j);
        }

    }
    public static void swap(int[] ans,int i,int j)
    {
        int temp= ans[i];
        ans[i] =ans[j];
        ans[j] = temp;
    }
}
