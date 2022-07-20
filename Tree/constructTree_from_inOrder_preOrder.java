/*
 * Construct the binary Tree rom Inorder and Pre Order elements 
 ! Link:- https://leetcode.com/problems/construct-binary-tree-from-preorder-and-inorder-traversal/
 */
import java.util.*;
public class constructTree_from_inOrder_preOrder {
    static class Node
    {
        int data;
        Node left,right;
        Node(int data)
        {
            this.data =data;
        }
    }
    static Scanner in;
    
    public static void main(String[] args) {
        in = new Scanner(System.in);
        int n =in.nextInt();
        System.out.println("Enter the Inorder > ");
        int inorder[] = new int[n];
        for(int i=0;i<n;i++)
        {
            inorder[i] = in.nextInt();
        }
        System.out.println("Enter the Preorder > ");
        int preorder[] = new int[n];
        for(int i=0;i<n;i++)
        {
            preorder[i] = in.nextInt();
        
        }
        Node root = CreateTree(inorder,preorder,n);
        System.out.println(Arrays.toString(inorder));
        System.out.println();
        Inorder(root);
    }
    private static void Inorder(Node root)
    {
        if(root==null)
        return ;
        Inorder(root.left);
        System.out.print(root.data+" ");
        Inorder(root.right);
    }
    private static Node CreateTree(int[] inorder, int[] preorder, int n) {
        Map<Integer,Integer> inmap = new HashMap<>();

        for(int i=0;i<n;i++)
        {
            inmap.put(inorder[i],i);
        }
        Node root = CreateTree(inorder,0,n-1,preorder,0,n-1,inmap);
        return root;
    }

    private static Node CreateTree(int[] inorder, int inStart, int inEnd, int[] preorder,
            int preStart, int preEnd, Map<Integer, Integer> inMap) {
            if(preStart>preEnd || inStart>inEnd)    
                return null;
                Node root = new Node(preorder[preStart]);
                int inRoot = inMap.get(preorder[preStart]);
                int numsLeft = inRoot-inStart;
                root.left = CreateTree(inorder,inStart,inRoot-1,preorder,preStart+1,preStart+numsLeft,inMap);
                root.right = CreateTree(inorder,inRoot+1,inEnd,preorder,preStart+1+numsLeft,preEnd,inMap);
                return root;
    }
}
