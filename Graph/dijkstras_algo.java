/*
 * This Algorithm finds the shortest distance from source to destination.
 * *
 */
import java.util.*;
public class dijkstras_algo {
    static class Graph
    {
        static ArrayList<Integer>adj[];
        Map<String,Integer>map;
        Graph(int vertex)
        {
            adj = new ArrayList[vertex];
            for(int i=0;i<vertex;i++)
            {
                adj[i]= new ArrayList<>();
            }
            map = new HashMap<>();
        }
        public void addEdges(int src,int dest,int weight)
        {
            adj[src].add(dest);
            adj[dest].add(src);
            String address = Integer.toString(src)+"-"+Integer.toString(dest);
            String address1 = Integer.toString(dest)+"-"+Integer.toString(src);
            map.put(address,weight);
            map.put(address1,weight);
        }
        public int[] shortest_distance(int v,int src)
        {
            PriorityQueue<Pair> q = new PriorityQueue<>();
            boolean vis[] = new boolean[v];
            Arrays.fill(vis,false);
            int ans[]= new int[v];
            Arrays.fill(ans,Integer.MAX_VALUE);
            ans[src]=0;
            q.add(new Pair(src,0));
            while(q.size()!=0)
            {
                Pair cur = q.remove();

                int u =cur.v;
                if(vis[u])
                {
                    continue;
                }
                vis[u]=true;
                for(Integer i : adj[u])
                {
                    String address = Integer.toString(u)+"-"+Integer.toString(i);
                    int wt = map.get(address);
                    if(ans[i]>ans[u]+wt)
                    {
                        ans[i]= ans[u]+wt;
                    }
                    q.add(new Pair(i,ans[i]));
                }
            }
            return ans;

        }
    }
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the vertex and Edge of Graph >");
        int vertex =in.nextInt();
        int edge =in.nextInt();
        Graph g= new Graph(vertex);
        for(int i=0;i<edge;i++)
        {
            int src =in.nextInt();
            int dest =in.nextInt();
            int weight =in.nextInt();
            g.addEdges(src,dest,weight);
        }
        int ans[] =g.shortest_distance(vertex,0);
        System.out.println(Arrays.toString(ans));
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
