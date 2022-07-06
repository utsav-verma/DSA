import java.util.*;
public class right_view {
    static class Node
    {
        Node left,right;
        int data;
        Node(int data)
        {
            this.data = data;
        }
    }
    static Scanner in;
    public static Node onCreate()
    {
        Node root = null;
        System.out.println("Enter the data : ");
        int data = in.nextInt();
        if(data == -1 )
        return null;
        root = new Node(data);
        System.out.println("Enter the left of "+data+" : ");
        root.left =onCreate();
        System.out.println("Enter the right of "+data+" : ");
        root.right =onCreate();
        return root;

    }
    public static void rightView(Node root)
    {
        ArrayList<Integer> ans = new ArrayList<>();
        RightViewUtil(ans,root,0);
        for(int i : ans)
        {
            System.out.println(i);
        }
    }
    private static void RightViewUtil(ArrayList<Integer> ans, right_view.Node root, int level) {
        if(root==null)
        return;
        if(ans.size()<level+1)
        {
            ans.add(root.data);
        }
        else
        {
            ans.set(level,root.data);
        }
        RightViewUtil(ans, root.left, level+1);
        RightViewUtil(ans, root.right, level+1);
    }
    public static void main(String[] args) {
        in = new Scanner(System.in);
        Node root =onCreate();
        rightView(root);
    }
}
