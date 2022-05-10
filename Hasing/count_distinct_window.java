/*
Q. https://www.geeksforgeeks.org/count-distinct-elements-in-every-window-of-size-k/

Count distinct Element in every given window
Input: arr[] = {1, 2, 1, 3, 4, 2, 3};
       k = 4
Output: 3 4 4 3
Explanation:
First window is {1, 2, 1, 3}, count of distinct numbers is 3
Second window is {2, 1, 3, 4} count of distinct numbers is 4
Third window is {1, 3, 4, 2} count of distinct numbers is 4
Fourth window is {3, 4, 2, 3} count of distinct numbers is 3
*/
import java.util.*;
public class count_distinct_window {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //          0  1  2  3  4   5  6
        int arr[] ={1,2,2,1,3,1,1,3};
        int k =4;
        HashMap<Integer,Integer> map = new HashMap<>();
        int count = distinct(arr,k,map);
        ArrayList<Integer> elements = new ArrayList<>();
        elements.add(count);
        int end =0;
        System.out.println(map);
        for(int i=1;i+k<=arr.length;i++)
        {
            end =i+k-1;
            int freq = map.get(arr[i-1])-1;
            if(freq==0)
            {
                map.remove(arr[i-1]);
            }
            else
            map.put(arr[i-1],freq);
            if(map.containsKey(arr[end]))
            {
                freq = map.get(arr[end])+1;
                map.put(arr[end],freq);
            }
            else
            {
                map.put(arr[end],1);
            }
            System.out.println(map);
            elements.add(map.size());
        }
        System.out.println(elements);
    }
    public static int distinct(int arr[],int k,HashMap<Integer,Integer>map) {
        for(int i=0;i<k;i++)
        {
            if(map.containsKey(arr[i]))
            {
                int freq = map.get(arr[i])+1;
                map.put(arr[i],freq);

            }
            else
            {
                map.put(arr[i],1);
            }
        }
        return map.size();
        
    }
    
}
