/**
 * * Question :- We have to find the mini8mun distance to destination from source 
 * ! Approach bfs
 */


import java.util.*;
public class BreathForSearch {
    static class Graph
    {   
        static private List<Integer> adj[];
        Graph(int vertex)
        {
            adj = new LinkedList[vertex];

            for(int i=0;i<vertex;i++)
            {
                adj[i] = new LinkedList<Integer>();
            }
        }

        public  void addEdges(int source, int destination)
        {
            adj[source].add(destination);
            adj[destination].add(source);
        }
        public  int bfs(int source,int destination)
        {
            boolean vis[] = new boolean[adj.length];
            Arrays.fill(vis,false);
            int parent[] = new int[adj.length];
            Queue<Integer> q = new LinkedList<>();
            vis[source] = true;
            q.add(source);
            parent[source]=-1;
            while(!q.isEmpty())
            {
                int curr =q.poll();
                if(curr==destination)break;
                for(int neighbor:adj[curr])
                {
                    if(!vis[neighbor])
                    {
                        vis[neighbor] = true;
                        q.add(neighbor);
                        parent[neighbor]=curr;
                    }
                }
            }
            int distance =0;
            int curr = destination;
            while(parent[curr]!=-1)
            {
                System.out.print(curr+"-> ");
                curr=parent[curr];
                distance++;
            }
            System.out.print(source+"\n");
            return distance;


        }
    }
    
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        System.out.println("Enter the Vertex and  Edges ");
        int vertex =in.nextInt();
        int edges = in.nextInt();
        Graph  g= new Graph(vertex);
        
        for(int i=0;i<edges;i++)
        {
            int source = in.nextInt();
            int destination = in.nextInt();
            g.addEdges(source,destination);
        }
        int d = g.bfs(0,4);
        System.out.println(d);
    }
}
