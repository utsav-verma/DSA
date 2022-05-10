/*abstract
Q. Count the distinct number of elemnts in an Array

*/

/**
 * count_Distinct
 */

import java.util.*;
public class count_Distinct {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n =in.nextInt();
        int arr[] = new int[n];

        for(int i=0;i<n;i++)
        {
            arr[i] = in.nextInt();
        }
        HashSet<Integer> unique = new HashSet<>();
        for(int i:arr)
        {
            if(!unique.contains(i))
            {
                unique.add(i);
            }
        }
        System.out.println(unique.size());
    }
}
