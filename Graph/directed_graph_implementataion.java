/**
 * * Here the graph is directed that is in particular direction
 */


import java.util.*;
public class directed_graph_implementataion {
    static class graph 
    {
        static   ArrayList<ArrayList<Integer>> adj;
        graph(int vertex)
        {
            adj = new ArrayList<>();
            for(int i=0;i<vertex;i++)
            {
                adj.add(i,new ArrayList<>());
            }
        }
        public static void addEdges(int source,int destination)
        {
            adj.get(source).add(destination);

        }
        public  boolean Path(Integer src,int destination,boolean vis[])
        {
            if(src==destination) return true;

            for(Integer neigh : adj.get(src)) 
            {
                if(!vis[neigh])
                {
                    vis[neigh] =true;
                    boolean isConnected = Path(neigh,destination,vis);
                    if(isConnected) return true;
                }
            }
            return false;
        }
    }
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the Vertex and Edges of Graph :- ");
        int vertex =in.nextInt();
        int edge = in.nextInt();
        graph g = new graph(vertex);
        for(int i=0;i<edge;i++)
        {
            int source =in.nextInt();
            int destination = in.nextInt();
            g.addEdges(source,destination);
        }
        boolean vis[] = new boolean[vertex];
        System.out.println("isPath :- "+g.Path(0,4,vis));
    }
}
