/**
 * * Question :- Merge the intervals suppose [1,4][2,6] these intervals can be merged and formed [1,6]
 * * but intervals[1,4][5,10] are seprate and cannot be merged into one
 * ! Approach Sort the intervals and interate throught the sorted one and check if next interval can be merged or not
 * ! if yes merge it else move on
 */


import java.util.*;
public class merge_intervals {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n =in.nextInt();
        int intervals[][] = new int[n][2];

        for(int i=0;i<n;i++)
        {
            int start =in.nextInt();
            int end =in.nextInt();
            intervals[i][0] =start;
            intervals[i][1] =end;

        }
        merge(intervals);
    }
    public static void merge(int intervals[][])
    {
        List<int []> res = new ArrayList<>();
        if(intervals.length<=0 )
        {
            res.toArray(new int [0][]);
        }
        // ! Sort the Array in Decreaing Order
        //* Arrays.sort(intervals ,(a,b)->b[0]-a[0]);
        // * Sort the Array According to interval
        Arrays.sort(intervals ,(a,b)->a[0]-b[0]);
        for(int[]i:intervals)
        {
            System.out.println(Arrays.toString(i));
        }
        int start = intervals[0][0];
        int end = intervals[0][1];


        for(int [] i:intervals )
        {
            if(i[0]<=end)
            {
                end = Math.max(end,i[1]);
            }
            else
            {
                res.add(new int []{start,end});
                start =i[0];
                end =i[1];
            }
        }
        res.add(new int[]{start,end});
        for(int[]i:res)
        {
            System.out.println(Arrays.toString(i));
        }
        

    }
}
