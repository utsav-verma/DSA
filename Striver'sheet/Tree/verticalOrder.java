/*
 * Question :- https://takeuforward.org/data-structure/preorder-inorder-postorder-traversals-in-one-traversal/
 ! Approach :-  
 */
import java.util.*;
public class verticalOrder{
    static class Tree
    {
        Tree left;
        Tree right;
        int val;
        Tree(int v)
        {
            val =v;
        }
    }
    static Scanner in;
    public static Tree onCreate()
    {
        Tree root = null;
        System.out.println("Enter the Data");
        int data = in.nextInt();
        if(data==-1)
        return null;

        root = new Tree(data);
        System.out.println("Enter the left of "+data+" : ");
        root.left = onCreate();
        System.out.println("Enter the right of "+data+" : ");
        root.right = onCreate();
        return root;


    }
    static Map<Integer,TreeMap<Integer,PriorityQueue<Integer>>> map;
    public static List<List<Integer>> verticalOrder(Tree root)
    {
        map = new TreeMap<>();
        inorder(root,0,0);
        List<List<Integer>> ans= new ArrayList<>();

        for(int key : map.keySet())
        {
            TreeMap<Integer,PriorityQueue<Integer>> tm = map.get(key);
            List<Integer> li = new ArrayList<>();
            for(int i:tm.keySet())
            {
                PriorityQueue<Integer> pq = tm.get(i);
                while(!pq.isEmpty())
                {
                    li.add(pq.poll());
                }
            }
            ans.add(li);
        }
        return ans;

    }

    private static void inorder(Tree root, int index, int level) {
        if(root==null) return;

        map.putIfAbsent(index,new TreeMap<>());
        map.get(index).putIfAbsent(level,new PriorityQueue<>());
        map.get(index).get(level).add(root.val);
        inorder(root.left,index-1,level+1);
        inorder(root.right,index+1,level+1);
        
    }

    public static void main(String[] args) {
        in = new Scanner(System.in);
        Tree root =onCreate();
        System.out.println(verticalOrder(root));
    }
}