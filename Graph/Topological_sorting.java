import java.util.*;
/**
 * *Topological_sorting
 * * Question :- Sort the tree in topological order
 * ! Dependencies or work with higher prority is placed first and lower ones are placed last 
 */

 import java.util.*;
public class Topological_sorting {

    static class Graph
    {
        static ArrayList<Integer>adj[];
        Graph(int vertex)
        {
            adj = new ArrayList[vertex];
            for(int i=0;i<vertex;i++)
            {
                adj[i] = new ArrayList<Integer>();
            }
        }
        public void addEdges(int src,int dest)
        {
            adj[src].add(dest);
        }
        public void Topological_sort(Stack<Integer>sort ,boolean vis[])
        {
            for(int i=0;i<vis.length;i++)
            {
                if(!vis[i])
                {
                    dfs(sort,i,vis);
                }
            }
        }
        public void dfs(Stack<Integer>sort,int src,boolean vis[])
        {
            vis[src]=true;
            for(Integer neighbor:adj[src])
            {
                if(!vis[neighbor])
                {
                    vis[neighbor]=true;
                    dfs(sort,neighbor,vis);
                }
            }
            sort.push(src);
        }
    }
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the Vertex and Edge of Graph > ");
        int v =in.nextInt();
        int e=in.nextInt();
        Graph g= new Graph(v);
        for(int i=0;i<e;i++)
        {
            int src =in.nextInt();
            int dest = in.nextInt();
            g.addEdges(src, dest);

        }
        Stack<Integer>sort = new Stack<>();
        boolean vis[]= new boolean[v];
        g.Topological_sort(sort,vis);
        while(!sort.isEmpty())
        {
            System.out.print(sort.pop()+" ");
        }
        System.out.println();
        
    }
}