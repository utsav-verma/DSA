/*
 * Question:- We are given 2d array in form of undirected graph  we have to find out if its Valid Tree of Not.
 ! Approach:- Convert the 2d matrix into graph and do a dfs traversal, if the neigh is visited and it is not the grandparent of parent return false its not valid tree
 ! Note:- Keep the track of Parent and GrandParent
 */
import java.util.*;
public class Graph-Valid-Tree {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        int mat[][]= new int[n][2];
        for(int i=0;i<n;i++)
        {
            mat[i][0] = in.nextInt();
            mat[i][1] = in.nextInt();
        }
        System.out.println(isValidTree(n,mat));
    }
    public static boolean isValidTree(int n,int mat[][])
    {
        ArrayList<Integer>adj[] = new ArrayList[n];
        for(int i=0;i<n;i++)
        {
            adj[i] = new ArrayList<>();
        }
        for(int i=0;i<n;i++)
        {
            int src = mat[i][0];
            int dest = mat[i][1];
            ad[src].add(dest);
            ad[dest].add(src);
        }
        boolean visited[] = new boolean[n];
        Arrays.fill(visited,false);
        return dfs(adj,0,-1,visited);
    }
    public static boolean dfs(ArrayList<Integer>adj[],int parent,int gp,boolean[]vis)
    {
        vis[parent]=true;
        for(Integer neigh:adj[parent])
        {
            if(visited[neigh] && neigh!=gp)
            {
                return false;
            }
            dfs(adj,neigh,parent);
        }
        return true;
    }
}

