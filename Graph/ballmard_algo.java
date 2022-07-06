/*
 * This Alogorithm helps to find the neagtive cycle in an directed graph
 * It is same as dijkstra's alggo
 */



import java.util.*;
public class ballmard_algo {
    static class graph{
        static ArrayList<Integer> adj[];
        static Map<String,Integer>map ;;
        graph(int vertex)
        {
            adj = new ArrayList[vertex];
            for(int i=0;i<vertex;i++)
            {

                adj[i] = new ArrayList<>();
            }
            
            map = new HashMap<>();

        }
        public static void addEdges(int src,int dest,int weight)
        {
            adj[src].add(dest);
            String address = Integer.toString(src)+"-"+Integer.toString(dest);
            map.put(address,weight);
        }
        public static boolean bellmard(int src,int v)
        {
            int dist[]= new int[v];
            Arrays.fill(dist,Integer.MAX_VALUE);
            dist[src]=0;

            for(int i=0;i<v-1;i++)
            {
                for(int j=0;j<adj.length;j++)
                {
                    for(int k:adj[j])
                    {
                        String address = Integer.toString(j)+"-"+Integer.toString(k);
                        int weight = map.get(address);

                        if(dist[j]!=Integer.MAX_VALUE && dist[j]+weight<dist[k])
                        {
                            dist[k] = dist[j]+weight;                        
                        }
                    }
                }
            }
            for(int j=0;j<adj.length;j++)
            {
                for(int k:adj[j])
                {
                    String address = Integer.toString(j)+"-"+Integer.toString(k);
                    int weight = map.get(address);

                    if(dist[j]!=Integer.MAX_VALUE && dist[j]+weight<dist[k])
                    {
                        return true;                        
                    }
                }

            }
            // System.out.println(Arrays.toString(dist));
            return false;
        }
        
    }
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the vertex and Edges of Graph > ");
        int vertex=in.nextInt();
        int edge=in.nextInt();
        graph g = new graph(vertex);
        for(int i=0;i<edge;i++)
        {
            int src =in.nextInt();
            int dest = in.nextInt();
            int weight =in.nextInt();
            g.addEdges(src,dest,weight);
        }
        System.out.println(g.bellmard(0,vertex));
        
    } 
}
