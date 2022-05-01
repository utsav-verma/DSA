/*
Display or counts number of nodes in a tree
*/
import java.util.*;
public class size_of_tree {

    static class Node{
        Node left;
        Node right;
        int data;
        Node(int d)
        {
            data =d;
        }

    }
    static Scanner in;
    public static Node createTree()
    {
        Node root = null;
        System.out.println("Enter the data : ");
        int data =in.nextInt();
        if(data ==-1)return null;

        root = new Node(data);
        System.out.println("Enter the data for left of "+data+" :");
        root.left = createTree();
        System.out.println("Enter the data for right of "+data+" :");
        root.right = createTree();
        return root;
    }
    public static int count_node(Node root)
    {
        if(root==null)
        return 0;
        return count_node(root.left)+count_node(root.right)+1;

    }
    public static void main(String[] args) {
        in = new Scanner(System.in);
        Node root=null;
        root= createTree();
        System.out.println(count_node(root));

    }
    
}
