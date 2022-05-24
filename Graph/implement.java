/**
 * * Graph can be created uwing two rules 
 * ! Adjancey Matrix
 * ! Adjancey List
 * * So we will use both
 */


import java.util.*;
public class implement {
    static class Graph{
        static private LinkedList<Integer> adj[];
        Graph(int v)
        {
            adj = new LinkedList[v];
            for(int i=0;i<v;i++)
            {
                adj[i] = new LinkedList<Integer>();
            }
        }
        public static void addEdge(int source,int destination)
        {
            adj[source].add(destination);
            adj[destination].add(source);
        }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter number of vertices and Edgtes ");
        
        int v =in.nextInt();
        int e =in.nextInt();

        Graph graph = new Graph(v);

        for(int i=0;i<e;i++)
        {
            int source = in.nextInt();
            int destination = in.nextInt();

            graph.addEdge(source, destination);
        }
    }
}