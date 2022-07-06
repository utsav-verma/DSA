
import java.util.*;
public class subset {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n =in.nextInt();
        int nums[] = new int[n];
        for(int i=0;i<n;i++)
        {
            nums[i] = in.nextInt();
        }
        subs(nums);
    }
    public static void subs(int nums[])
    {
        List<Queue<Integer>> ans = new LinkedList<>();
        List<Integer> ansUtil = new ArrayList<>();
        permut(nums,0,ans,ansUtil);
        System.out.println(ans);
    }
    private static void permut(int nums[], int i, List<Queue<Integer>> ans, List<Integer> ansUtil) {
        if(i==nums.length)
        {
            ans.add(new LinkedList<>(ansUtil));
            return;
        }
        ansUtil.add(nums[i]);
        permut(nums,i+1,ans,ansUtil);
        ansUtil.remove(ansUtil.size()-1);
        permut(nums,i+1,ans,ansUtil);
        
    }
}
