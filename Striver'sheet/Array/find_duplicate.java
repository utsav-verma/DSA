/**
 * * Question :- Find the Duplicate number that exits assuming only one number is repeated.
 * ! link :- https://takeuforward.org/data-structure/find-the-duplicate-in-an-array-of-n1-integers/
 */

import java.util.*;
public class find_duplicate {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int arr[]={1,3,4,2,2};
        System.out.println(duplicate(arr));
    }

    private static int duplicate(int[] arr) {
        int slow = arr[0];
        int fast = arr[0];
        do   
        {
            slow = arr[slow];
            fast = arr[arr[fast]];
        }while(slow!=fast);
        fast =arr[0];
        while(slow!=fast)    
        {
            slow = arr[slow];
            fast = arr[fast];
        }
        return slow;
    }
}
