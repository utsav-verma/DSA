import java.util.*;
/*
Given Matrix for n=4, a[]={1,2,3,4} remove all elements elements at odd position until 1 element remains
a[]={2,4} 
a[]={4}
ans = 4
*/

/*
Approach : Form an arraylist of 1 to n elements and then access the odd position number as arraylist is 0 base indexing and store it new arraylist 
repeat the process until the arraylist  size becomes 1.

other approach is find the 2^k element which just less than or equal to n that will be the answer
like for n = 4 nearest 2^k will be 4 
for n =20 nearest will be 16
*/
public class odd_position {
    public static void approach_1(int n)
    {
        ArrayList <Integer> list = new ArrayList<>();
        for(int i=1;i<=n;i++)
        list.add(i);
        System.out.println(list);
        solve_1(list);
    }
    public static void solve_1(ArrayList<Integer> list){
        if(list.size()==1){
            System.out.println(list.get(0));
            return;//terminates the void return type recurssion
        }
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i=0;i<list.size();i++)
        {
            if(i%2!=0)
            arr.add(list.get(i));
        }
        solve_1(arr);

    }
    public static int approach_2(int n,int p)
    {
        int z =(int)Math.pow(2,p);
        // System.out.println(z);
        if(z<=n)
        return z;
        return approach_2(n,p-1);
    }

    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);

        int n =in.nextInt();
        System.out.println("Approach 1: ");
        approach_1(n);
        System.out.println("Approach 2: ");
        int pow = (int)Math.ceil(Math.sqrt(n));
        System.out.println(approach_2(n,pow));
    }
    
}
