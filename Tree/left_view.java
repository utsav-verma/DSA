
import java.util.*;
public class left_view {
    static class Node{
        int data ;
        Node left,right;
        Node(int data)
        {
            this.data =data;
            left =null;
            right=null;
        }
    }
    static Scanner in;
    public static Node onCreate()
    {
        Node root =null;
        int data = in.nextInt();
        if(data==-1)
        return null;
        root = new Node(data);
        System.out.println("Enter the left of "+data+" : ");
        root.left=onCreate();
        System.out.println("Enter the right of "+data+" : ");
        root.right = onCreate();
        return root;
    }
    public static void leftView(Node root)
    {
        ArrayList<Integer> ans= new ArrayList<>();
        leftViewUtil(ans,root,0);
        for(int i:ans)
        {
            System.out.println(i);
        }
    }
    public static void leftViewUtil(ArrayList<Integer>ans,Node root,int level)
    {
        if(root==null)
        {
            return;
        }
        if(ans.size()<level+1||ans.get(level)==null)
        {
            ans.add(root.data);
        }
        leftViewUtil(ans,root.left,level+1);
        leftViewUtil(ans,root.right,level+1);
    }
    public static void main(String[] args) {
        in = new Scanner(System.in);
        Node root =onCreate();
        // ArrayList<Integer> arr = new ArrayList<>();
        // System.out.println(arr.set(1,0));
        leftView(root);
        
    }
}
