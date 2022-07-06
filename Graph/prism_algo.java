/*
 * This Algorithm is used to find the minimum spanning tree
 */
import java.util.*;
public class prism_algo {

    static class Graph 
    {
        static ArrayList<ArrayList<Integer>> adj;
        Graph(int vertex)
        {
            adj = new ArrayList<>();
            for(int i=0;i<vertex;i++)
            {
                adj.add(i,new ArrayList<>());
            }
        }
        public static void addEdges(int src,int dest)
        {
            adj.get(src).add(dest);
            adj.get(dest).add(src);
        }
        public int spanningTree(int v,Map<String,Integer>map)
        {
            boolean vis[]= new boolean[v];
            PriorityQueue<Pair> q = new PriorityQueue<>();
            q.add(new Pair(0,0));
            int ans=0;
            while(q.size()!=0)
            {
                Pair cur = q.remove();
                int u= cur.v;
                if(vis[u])
                {
                    continue;
                }
                ans+=cur.wt;
                vis[u]=true;
                
                for(Integer neighbor:adj.get(u))
                {
                    String add = Integer.toString(u)+"-"+Integer.toString(neighbor);
                    
                    int weight =map.get(add);
                    if(!vis[neighbor])
                    {
                        q.add(new Pair(neighbor,weight));
                    }
                }
            }
            return ans;
        }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the vertex and edges of Graph");
        int vertex =in.nextInt();
        int edge =in.nextInt();
        Graph g = new Graph(vertex);

        Map<String,Integer>map = new HashMap<>();
        for(int i=0;i<edge;i++)
        {
            int src =in.nextInt();
            int dest = in.nextInt();
            int weight =in.nextInt();
            g.addEdges(src,dest);
            String address1 = Integer.toString(src)+"-"+Integer.toString(dest);
            String address2 = Integer.toString(dest)+"-"+Integer.toString(src);
            map.put(address1,weight);
            map.put(address2,weight);
        }
        System.out.println(g.spanningTree(vertex,map));

    }
}
class Pair implements Comparable<Pair>
{
    int wt;
    int v;
    Pair(int v,int wt)
    {
        this.v=v;
        this.wt=wt;
    }
    public int compareTo(Pair that)
    {
        return this.wt-that.wt;
    }
}
