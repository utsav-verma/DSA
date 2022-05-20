/**
 * * Question :- https://www.geeksforgeeks.org/largest-rectangle-under-histogram/
 * * The question says find largest area in histogram
 * 
 */


import java.util.*;
public class maximum_area_rectangle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int arr[] ={6, 2, 5, 4, 5, 1, 6};
        int ns[] =new int[arr.length];
        int ps[]=new int[arr.length];
        int max=0;
        ns =nextSmaller(arr);
        ps=prevSmaller(arr);
        System.out.println(Arrays.toString(ns));
        System.out.println(Arrays.toString(ps));
        for(int i=0;i<arr.length;i++)
        {
            int area = (ns[i]-ps[i]-1)*arr[i];
            System.out.println(area);
            max =(area>max)?area:max;
        }
        System.out.println(max);
    }

    private static int[] prevSmaller(int[] arr) {
        int ps[]= new int [arr.length];
        Stack<Integer> st = new Stack<>();
        for(int i=0;i<arr.length;i++)
        {
            while(!st.isEmpty()&&arr[st.peek()]>=arr[i])
            {
                st.pop();
            }
            if(st.isEmpty())
            {
                ps[i]=-1;
            }
            else
            {
                ps[i]=st.peek();
            }
            st.push(i);
        }
        return ps;
    }

    private static int[] nextSmaller(int[] arr) {
        int ns[]= new int [arr.length];
        int n =arr.length;
        Stack<Integer> st = new Stack<>();
        for(int i=arr.length-1;i>=0;i--)
        {
            while(!st.isEmpty()&&arr[st.peek()]>=arr[i])
            {
                st.pop();
            }
            if(st.isEmpty())
            {
                ns[i]=n;
            }
            else
            {
                ns[i]=st.peek();
            }
            st.push(i);
        }

        return ns;
    }   
}
