/*
 * This Program is to insert a node in BST
 */


import java.util.*;
public class insert_BST {
    static class Node
    {
        int data ;
        Node left,right;
        Node (int data)
        {
            this.data=data;
        }

    }
    static Scanner in;
    private static Node onCreate()
    {
        Node root=null;
        System.out.println("Enter the Data : ");
        int data = in.nextInt();
        if(data==-1)
        {
            return null;
        }
        root =  new Node(data);
        System.out.println("Enter the data for Left "+data+" : ");
        root.left =onCreate();
        System.out.println("Enter the data for right "+data+" : ");
        root.right=onCreate();
        return root;
    }
    //* Using Recursion

    private static Node insert1(Node root,int key)
    {
        if(root==null)
        {
            return new Node(key);
        }
        if(root.data>key)
        {
            root.left =insert1(root.left,key);
        }
        else
        root.right=insert1(root.right,key);

        return root;
    }
    private static void inOrder(Node root) {
        if(root==null)
        {
            return;
        }
        inOrder(root.left);
        System.out.print(root.data+" ");
        inOrder(root.right);
    }
    private static void insert2(Node root,int key)
    {
        Node curr=root;
        Node parent=null;
        Node newnode = new Node(key);
        while(curr!=null)
        {
            parent=curr;
            if(curr.data>key)
            {
                curr=curr.left;
            }
            else
            {
                curr=curr.right;
            }
        }
        if(parent==null)
        {
            parent =newnode;
        }
        else if(parent.data>key)
        {
            parent.left=newnode;
        }
        else
        {
            parent.right=newnode;
        }
    }
    public static void main(String[] args) {
        in = new Scanner (System.in);
        Node root =onCreate();
        inOrder(root);
        System.out.println();
        insert2(root,25);
        System.out.println();
        inOrder(root);
        
    }

}
