/*

Question :- 
Given number of pages in n different books and m students. T
he books are arranged in ascending order of number of pages. Every student is assigned to read some consecutive books. 
The task is to assign books in such a way that the maximum number of pages assigned to a student is minimum

*Test Case 1* : 
Input : pages[] = {12, 34, 67, 90}
           m = 2
Output : 113

*Explanation*

There are 2 number of students. Books can be distributed 
in following fashion : 
  1) [12] and [34, 67, 90]
      Max number of pages is allocated to student 
      2 with 34 + 67 + 90 = 191 pages
  2) [12, 34] and [67, 90]
      Max number of pages is allocated to student
      2 with 67 + 90 = 157 pages 
  3) [12, 34, 67] and [90]
      Max number of pages is allocated to student 
      1 with 12 + 34 + 67 = 113 pages

Of the 3 cases, Option 3 has the minimum pages = 113.

*/

import java.util.*;
public class minimum_books {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int arr[] = {12,34,67,90};
        //student  = 2
        int res = minPages(arr,2);
        System.out.println(res);

    }
    public static int sumOf(int arr[])
    {
        int l =arr.length;
        int sum=0;
        for(int i=0;i<l;i++)
        {
            sum+=arr[i];
        }

        return sum;
    }
    public static int minPages(int arr[],int k)
    {
        int min =arr[arr.length-1];//maxmimum element in arr is arr[arr.length-1],sorted array
        int max = sumOf(arr);
        int res =0;
        while(min<=max)
        {
            int mid =(min+max)/2;
            System.out.println(min+" "+max);

            if(isfeasible(arr,k,mid))
            {
                res = mid;
                max =mid-1;
            }
            else
            {
                min =mid+1;
            }
        }
        return res;
    }
    public static boolean isfeasible(int arr[],int k,int res)
    {
        int student =1,sum=0;
        for(int i=0;i<arr.length;i++)
        {
            if(sum+arr[i]>res)
            {
                student++;
                sum =arr[i];
            }
            else
            {
                sum+=arr[i];
            }
        }
        return (student<=k);
    }
    
}
