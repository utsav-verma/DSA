/**
 * *Question :- In this we have to check for cycle in directed graph 
 * * Same approach as Undirected Grpah
 */

import java .util.*;
public class isCycle_directed_graph {
    static class Graph{
        static private ArrayList<ArrayList<Integer>> adj;
        Graph(int v)
        {
            adj = new ArrayList<>();
            for(int i=0;i<v;i++)
            {
                adj.add(i,new ArrayList<>());
            }
        }
        public void addEdges(int src,int dest)
        {
            adj.get(src).add(dest);
        }
        private boolean isCycle(int src,boolean vis[],boolean res[])
        {
            vis[src] =true;
            res[src]=true;
            
            for (int neighbor:adj.get(src))
            {
                if(!vis[neighbor])
                {
                    boolean isCycle = isCycle(neighbor,vis,res);
                    if(isCycle) return true;
                }
                else if(res[neighbor])
                {
                    return true;
                }
            }
            res[src]=false;
            return false;
        }
        public boolean Cycle(boolean vis[])
        {
            boolean res[] = new boolean[vis.length];
            Arrays.fill(res,false);
            for(int i=0;i<vis.length;i++)
            {
                if(!vis[i])
                {
                    if(isCycle(i,vis,res)) return true;
                }
            }
            return false;
        }

    }
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the vertex and Edge of Graph :- ");
        int vertex =in.nextInt(),edge =in.nextInt();
        Graph g = new Graph(vertex);
        for(int i=0;i<edge;i++)
        {
            int source =in.nextInt();
            int dest =in.nextInt();
            g.addEdges(source,dest);
        }
        boolean vis[] = new boolean[vertex];
        Arrays.fill(vis,false);
        System.out.println("Is Cycle Present : "+g.Cycle(vis));
    }
}
