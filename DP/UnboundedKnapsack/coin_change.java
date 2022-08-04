/*
 * Question:- Array is given with a sum value we have to find number of wyas,
 * we can get the given sum
 * like for arr ={1,2,3} sum =5 we have combos {1,1,1,1,1},{1,2,2},{2,3}
 */
import java.util.*;
public class coin_change {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int arr[] ={1,3,5};
        int sum =5;
        System.out.println(count_coins(arr,0,sum));
    }
    public static int count_coins(int []arr,int i,int sum)
    {
        if(i==arr.length)
        return 0;
        if(sum-arr[i]>=0)
        {
            return 1+count_coins(arr,i,sum-arr[i])+count_coins(arr,i+1,sum);
        }
        return count_coins(arr,i+1,sum);
    }
}
