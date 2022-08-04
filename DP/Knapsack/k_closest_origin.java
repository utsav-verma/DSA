/*
 * Over here we need to rreturn the k pair which are cosest to origin.
 ! Approach :- we will be using max Heap sructure to get the kth closest.
 */


import java.util.*;
public class k_closest_origin {
    static class pair implements Comparable<pair>
    {
        int dist;
        String p;
        pair(int x,int y)
        {
            dist = (x*x)+(y*y);
            p = Integer.toString(x)+","+Integer.toString(y);
        }
        public int compareTo(pair that)
        {
            return this.dist-that.dist;
        }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the Elements > ");
        int n =in.nextInt();
        int mat[][]= new int[n][2];

        for(int i=0;i<n;i++)
        {
            mat[i][0] =in.nextInt();
            mat[i][1] =in.nextInt();

        }
        System.out.println("Enter the value of K > ");
        int k =in.nextInt();
        PriorityQueue<pair> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int i=0;i<n;i++)
        {
            pair p = new pair(mat[i][0],mat[i][1]);
            pq.add(p);
            if(pq.size()>k)
            {
                pq.poll();
            }
        }
        for(pair p : pq)
        {
            System.out.println(p.p);
        }

    }
}
