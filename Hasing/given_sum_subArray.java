/*
Q. Find all the subarray with given sum
*/
import java.util.*;
public class given_sum_subArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n =in.nextInt();
        int arr[] = new int [n];
        for(int i=0;i<n;i++)
        {
            arr[i] = in.nextInt();
        }
        int sum =in.nextInt();
        
    }
    public static void findSubArray(int arr[],int sum)
    {
        int currSum =0;
        int start =0,end=-1;
        Map<Integer,Integer> map = new HashMap<>();
        ArrayList<ArrayList<Integer>>indices = new ArrayList<>();
        
        for(int i=0;i<arr.length;i++)
        {
            currSum+=arr[i];
            if(currSum==sum)
            {
                ArrayList<Integer> index = new ArrayList<>();
                start =0;end=i;
                index.add(start);
                index.add(end);
                indices.add(index);
                // index.removeAll();
                
                
            }
            if(map.containsKey(currSum-sum))
            {
                ArrayList<Integer> index = new ArrayList<>();
                start = map.get(currSum-sum)+1;
                end =i;
                index.add(start);
                index.add(end);
                indices.add(index);
                // index.removeAll();
            }
            map.put(currSum,i);
        }
        if(end==-1)
        System.out.println("SubArray Not Found!!!");
        else
        {
            System.out.println(indices);
        }
    }
}
