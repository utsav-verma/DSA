/**
 * * In this approach we search the depth of an node first if destination is found we return true 
 */





import java.util.*;
public class deapth_first_search {

    static class graph{
        static List<Integer> adj[];
        graph(int vertex)
        {
            adj = new LinkedList[vertex];
            for(int i=0;i<vertex;i++)
            {
                adj[i] =  new LinkedList<>();
            }
        }
        public void addEdges(int src,int dest)
        {
            adj[src].add(dest);
            adj[dest].add(src);
        }
        public  boolean dfs(int src,int dest,boolean vis[])
        {
            if(src==dest)return true;

            for(int neighbor:adj[src])
            {
                if(!vis[neighbor])
                {
                    vis[neighbor] = true;
                    boolean isConnected = dfs(neighbor,dest,vis);
                    if(isConnected)return true;
                }
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
        boolean vis[]= new boolean[vertex];
        vis[6]=true;
        System.out.println("Possible : "+g.dfs(6,4,vis));

    }
}
