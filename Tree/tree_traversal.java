/*
Here we would perform all the three types of traversal 
PreOrder():- Root,Left,Right
PostOrder() :- Left,Right,Root
InOrder():- Left,Root,Right
*/
import java.util.*;
public class tree_traversal {

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
    public static Node OnCreate() {
        Node root =null;
        System.out.println("Enter the data :");
        int data =in.nextInt();
        if(data ==-1)
        return null;

        root = new Node(data);
        System.out.println("Enter the left of "+data+" : ");
        root.left =OnCreate();
        System.out.println("Enter the right of "+data+" : ");
        root.right =OnCreate();

        return root;
    }
    // InOrder : left ,Root,Right
    public static void InOrder(Node root)
    {
        if(root==null)
        return;
        InOrder(root.left);
        System.out.println(root.data);
        InOrder(root.right);

    }
    //PostOrder - Left,Right,Root
    public static void PostOrder(Node root)
    {
        if(root==null)
        {
            return;
        }

        PostOrder(root.left);
        PostOrder(root.right);
        System.out.println(root.data);


    }
    //PreOrder - Root,Left,Right
    public static void PreOrder(Node root)
    {
        if(root==null)
        {
            return;
        }

        System.out.println(root.data);
        PreOrder(root.left);
        PreOrder(root.right);


    }
    public static void main(String[] args) {
        in = new Scanner(System.in);
        Node root =null;
        root = OnCreate();
        // InOrder(root);
        // PostOrder(root);
        PreOrder(root);
    }
    
}
