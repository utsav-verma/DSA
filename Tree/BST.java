/*
 * Check if the Given tree is Binary Search Tree or not
 * BST is a tree whose all the sub-tree element left of root should be less than root and whose all the root sub-elements should be greater than.
 *      4
 *    3    6
 *  1   2 5  9
 * 
 */
import java.util.*;
public class BST {
    static class Node
    {
        Node left,right;
        int data;
        Node(int data)
        {
            this.data =data;
            left = null;
            right=null;
        }
    }
    public static Node onCreate()
    {
        Node root = null;
        System.out.println("Enter the data : ");
        int data = in.nextInt();
        if(data==-1)
        return null;
        root =new Node(data);
        System.out.println("Enter the left of "+data+" :");
        root.left = onCreate();
        System.out.println("Enter the right of "+data+" :");
        root.right = onCreate();
        return root;
    }
    public static boolean isBst(Node root,int min,int max)
    {
        if(root==null)
        return true;
        if(root.data<=min || root.data>=max)
        return false;

        boolean isTrueLeft = isBst(root.left,min,root.data);
        boolean isTrueRight = isBst(root.right,root.data,max);
        return isTrueLeft &isTrueRight;
    }
    static Scanner in;
    public static void main(String[] args) {
        in = new Scanner(System.in);
        Node root = onCreate();
        System.out.println(isBst(root,Integer.MIN_VALUE,Integer.MAX_VALUE));


    }
}
