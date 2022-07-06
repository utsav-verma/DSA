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
        //*  */
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
        //* Khan's Algorithms 
        public static void bfs(int v)
        {
            int in_degree[]= new int[v];
            Arrays.fill(in_degree,0);
            for(int i=0;i<v;i++)
            {
                for(Integer j:adj[i])
                {
                    in_degree[j]++;
                }
            }
            System.out.println("Indegree : "+Arrays.toString(in_degree));
            bfss(in_degree);

        }
        public static void bfss(int in_degree[])
        {
            Queue<Integer> queue = new LinkedList<>();
            for(int i=0;i<in_degree.length;i++)
            {
                if(in_degree[i]==0)
                {
                    queue.add(i);
                }
            }
            ArrayList<Integer> res = new ArrayList<>();
            while(!queue.isEmpty())
            {
                int cur=queue.poll();
                res.add(cur);
                for(Integer neighbor:adj[cur])
                {
                    in_degree[neighbor]--;
                    if(in_degree[neighbor]==0)
                    {
                        queue.add(neighbor);
                    }
                }
            }
            System.out.println(res);
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
        // Stack<Integer>sort = new Stack<>();
        // boolean vis[]= new boolean[v];
        // g.Topological_sort(sort,vis);
        // while(!sort.isEmpty())
        // {
        //     System.out.print(sort.pop()+" ");
        // }
        // System.out.println();
        g.bfs(v);
        
    }
}