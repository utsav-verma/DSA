import java.util.*;
/**
 * wiggle_sequence
 */
public class wiggle_sequence {

    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the Size > ");
        int n =in.nextInt();
        int nums[] = new int[n];
        for(int i=0;i<n;i++)
        {
            // arr.add(in.nextInt());
            nums[i] = in.nextInt();
        }
        
       
        System.out.println(maxLength(arr));
        // System.out.println(isWiggle(arr));
    }
    private static int maxLength(ArrayList<Integer>arr)
    {
        ArrayList<Integer>temp = new ArrayList<>();
        m=0;
        subsequence(arr, 0, temp);
        // int max = subsequence(arr,0,temp);
        return m;
    }
    static int m;
    private static void subsequence(ArrayList<Integer> arr, int i, ArrayList<Integer> temp) {
        if(i==arr.size())
        {
            if(isWiggle(temp))
            {
                m = Math.max(m,temp.size());
                // System.out.println(temp);
            }
            return;
        }
        temp.add(arr.get(i));
        subsequence(arr, i+1, temp);
        temp.remove(temp.size()-1);
        subsequence(arr, i+1, temp);
    }
    private static boolean isWiggle(ArrayList<Integer> temp) {
        if(temp.size()==0)
        return false;
        if(temp.size()>=1&& temp.size()<=2)
        return true;
        int prev = temp.get(1) -temp.get(0);
        for(int i=1;i<temp.size()-1;i++)
        {
            int diff = temp.get(i+1)-temp.get(i);
            if(prev<0 && diff<0)
            {
                return false;
            }
            else if(prev>0 && diff>0)
            {
                return false;
            }
            prev=diff;
        }
        return true;
    }
}