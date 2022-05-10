/*
In this sorting Algorithm the Array gets sorted from the back
*/

import java.util.*;

public class bubble_sort {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n[] = {5,7 , 2 ,1 ,9 ,0 ,-9};
        bubbleSort(n);
        System.out.println(Arrays.toString(n));


    }
    public static void bubbleSort(int num[]) {

        int  l =num.length;
        for(int i=0;i<l;i++)
        {
            for(int j=0;j<l-i-1;j++)
            {
                if(num[j]>num[j+1])
                {
                    swap(num,j,j+1);
                }
            }
        }
        
    }
    public static void swap(int num[],int i,int j) {

        int temp = num[i];
        num[i] = num[j];
        num[j] = temp;
    }
}
