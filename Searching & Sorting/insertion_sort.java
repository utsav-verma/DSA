import java.util.*;
/*
So in this sorting Algorithm we have two parts one sorted and 2nd unsorted

eg : - 
 5 7 2 1 9 0 -9 , so i=1 , all elements before i would be sorted and all elemensts after i would be unsorted
5 7| 2 1 9 0 -9
sorted --unsorted
5 7 2 1 9 0 -9
2 5 7 | 1 9 0 -9
sorted -- unsorted 

*/

public class insertion_sort {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n[] = {5,7 , 2 ,1 ,9 ,0 ,-9};
        insertionSort(n);
        System.out.println(Arrays.toString(n));
    }

    private static void insertionSort(int[] n) {
        //  ,5 , 7 ,1 ,9 ,0 ,-9
        int temp,l=n.length;
        for(int i=1;i<l;i++)
        {
            int j = i-1;
            temp =n[i];
            while(j>=0 && n[j]>temp)
            {
                if(n[j]>temp)
                {
                    n[j+1] = n[j];
                }
                j--;
            }
            n[j+1] = temp;
            
        }
    }

}
