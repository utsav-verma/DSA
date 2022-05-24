/**
 * * Question : - Diameter of tree is the distance of left most leaf node to right most leaft Node
 * * Suppose a tree        5
 * *                     6    7
 * *                    8  9  10  11
 * ! So the diameter will be largest distance which will be  8->6->5->7->11  
 */


import java.util.*;
public class diameter_tree {
    static class Node
    {
        Node left,right;
        int data;
        Node(int d)
        {
            data = d;
        }
    }
    static Scanner in;
    public static void main(String[] args) {
        in = new Scanner(System.in);
        tree ob = new tree();
        Node head = onCreate();
        Inorder(head);
        System.out.println();
        int d =calculateDiameter(head);
        System.out.println(d);
        //*New Approach
        int h =heights (head);
        System.out.println("Diameter : - "+ans);
    }
    //!Optimized Method
    static int ans=0; 
    private static int heights(Node root)
    {
        if(root==null)
        return 0;
        int left = height(root.left);
        int right =height(root.right);
        ans = Math.max(ans,1+left+right);
        return 1 +Math.max(left,right);
    }
    private static int calculateDiameter(Node head) {
        if(head==null)
        return 0;
        int left = calculateDiameter(head.left);
        int right =calculateDiameter(head.right);
        int curr= height(head.left)+height(head.right)+1;

        return Math.max(curr,Math.max(left,right));
        
    }
    
    private static int height(Node root) {
        if(root==null)
        return 0;
        return 1+Math.max(height(root.left),height(root.right));
    }

    private static void Inorder(Node head) {
        if(head==null)
        return ;
        Inorder(head.left);
        System.out.print(head.data+" ");
        Inorder(head.right);
    }
    private static Node onCreate() {
        Node root =null;
        System.out.println("Enter the Data :- ");
        int data  = in.nextInt();
        if(data==-1)
        return null;
        root = new Node(data);
        System.out.println("Enter the left of "+data+" : ");
        root.left =onCreate();
        System.out.println("Enter the right of "+data+" : ");
        root.right =onCreate();
        return root;
    }
}
