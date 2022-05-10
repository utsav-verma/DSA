import java.util.*;
/*
In this sorting Algorithm we find the minimum element and place it at front 
5 7 2 1 9 0 -9
so  1 is minimum for 1st iteration
1 7 2 5 9 0 -9
now for 2nd iteration ,  2 is minimum 
1 2 7 5 9 0 -9
ans soon


*/
public class selection_sort {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n[] ={5, 7 ,2 ,1 ,9 ,0 ,-9};

        selectionSort(n);
        System.out.println(Arrays.toString(n));
    }

    private static void selectionSort(int[] n) {
        int minimum = 0;
        int  l = n.length;
        for(int i=0;i<l-1;i++)
        {
            minimum = i;
            for(int j=i+1;j<l;j++)
            {
                if(n[minimum]>n[j])
                {
                    minimum = j;
                }
            }
            if(i!=minimum)
            {
                swap(n,i,minimum);
            }
        }
    }
    private static void swap(int n[],int i,int j)
    {
        int temp = n[i];
        n[i]  =n [j];
        n[j] = temp;
    }
    
}
