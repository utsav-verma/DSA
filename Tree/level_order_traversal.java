import java.util.*;
public class level_order_traversal {
    static class Node
    {
        int data;
        Node left,right;
        Node(int data)
        {
            this.data=data;
        }
    }
    static Scanner in;
    private static Node onCreate()
    {
        Node root =null;
        System.out.println("Enter the Data ");
        int data =in.nextInt();
        if(data==-1)
        return null;
        root = new Node(data);
        System.out.println("Enter the left of "+data+" : ");
        root.left=onCreate();
        System.out.println("Enter the right of "+data+" : ");
        root.right=onCreate();
        return root;
    }
    public static void main(String[] args) {
        in = new Scanner(System.in);
        Node root=onCreate();
        List<List<Integer>>ans = new ArrayList<>();
        ans =levelOrder(root);
        System.out.println(ans);
    }
    static Map<Integer,List<Integer>>hm;
    private static List<List<Integer>> levelOrder(Node root)
    {
        hm= new HashMap<>();
        dfs(root,0);
        return new ArrayList<List<Integer>>(hm.values());
    }
    private static void dfs(Node root,int level)
    {
        if(root==null)
        {
            return;
        }
        if(!hm.containsKey(level))
        {
            hm.put(level,new ArrayList<>());
        }
        hm.get(level).add(root.data);
        dfs(root.left,level+1);
        dfs(root.right,level+1);
    }
}
