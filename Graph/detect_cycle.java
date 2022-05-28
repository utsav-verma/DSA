/**
 * * Question Detect a cycle in a LinkedList
 * !Approach : - Simple traverse through all node if ever we get a visited node that means cycle is present
 */


import java.util.*;
public class detect_cycle {
    static class graph{
        static List<Integer>adj[];
        graph(int vertex)
        {
            adj = new LinkedList[vertex];

            for(int i=0;i<vertex;i++)
            {
                adj[i] = new LinkedList<>();
            }
        }
        public void addEdges(int src,int dest)
        {
            adj[src].add(dest);
            adj[dest].add(src);

        }
        public boolean detectCycle(int vertex)
        {
            boolean vis[] = new boolean[vertex];
            boolean cycle = false;
            for(int i=0;i<vertex;i++)
            {
                if(!vis[i])
                {
                    cycle = dfs(i,vis,-1);
                }
            }
                return cycle;
            
        }
        private boolean dfs(int src, boolean[] vis, int parent) {

            vis[src] =true;
                for(int neighbor:adj[src])
                {
                    if(!vis[neighbor])
                    {
                        if(dfs(neighbor,vis,src)) return true;
                    }
                    else if(neighbor!=parent) return true;
                }

            return false;
        }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the vertex and edge > ");
        int vertex =in.nextInt();
        int edge =in.nextInt();
        graph g = new graph(vertex);
        for(int i=0;i<edge;i++)
        {
            int source = in.nextInt();
            int destination = in.nextInt();
            g.addEdges(source,destination);
        }
        System.out.println("Is Cycle :- "+g.detectCycle(vertex));
    }
}
