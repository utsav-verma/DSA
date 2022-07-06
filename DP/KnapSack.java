/**
 * KnapSack
 */
import java.util.*;
public class KnapSack {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // int n =in.nextInt();
        int value[] = {20,20,20,20};
        int weight[] = {1,1,1,1};
        int capacity = 6;
        map = new HashMap<>();
        int max_weight =MaxWeight(value, weight, 3, capacity) ;
        System.out.println(max_weight);
    }
    static Map<String,Integer> map;
    public static int MaxWeight(int val[],int wt[],int n,int cap)
    {
        int weight=0;
        if(n<0)
        {
            return 0;
        }
        String i = Integer.toString(n)+"-"+Integer.toString(cap);

        if(map.containsKey(i))
        {
            weight =map.get(i);
            return weight;
        }

        if(wt[n]>cap)
        {
            return MaxWeight(val, wt, n-1, cap);
        }
        else if(wt[n]<=cap)
        {
            weight= Math.max(val[n]+MaxWeight(val,wt,n-1,cap-wt[n]),MaxWeight(val, wt, n-1, cap));
        }
        map.put(i,weight);
        return weight;
    }

    //* O(N*Capacity) */



}