//Program to find Height of Tree

import java.util.*;
public class tree_height {
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
    private static Node createTree() {
        Node root =null;
        System.out.println("Enter the data : ");
        int data = in.nextInt();
        if(data==-1)
        return null;

        root = new Node(data);
        System.out.println("Enter the left of "+data+" : ");
        root.left = createTree();
        System.out.println("Enter the right of "+data+" : ");
        root.right = createTree();
        return root;
    }
    public static int height(Node root)
    {
        if(root==null)
        return 0;

        return ((int)Math.max(height(root.left),height(root.right))+1);
    }
    public static void main(String[] args) {
        in = new Scanner(System.in);
        Node root =null;
        root =createTree();
        int height =height(root);
        System.out.println(height);
    }
}
