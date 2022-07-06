import java.util.*;
public class isValidate {
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
    static Scanner in;
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
    public static Node isBst(Node root,Node leftMax,Node rightMin)
    {
        if(root==null)
        return null;
        if(root.data<=leftMax.data || root.data>=rightMin.data)
        return root;

        Node isTrueLeft = isBst(root.left,leftMax,root);
        Node isTrueRight = isBst(root.right,root,rightMin);
        if(isTrueLeft!=null) swap(root,isTrueLeft);
        if(isTrueRight!=null)swap(root,isTrueRight);
        return root;

    }
    private static void swap(Node root, Node temp) {
        int d = root.data;
        root.data=temp.data;
        temp.data=d;
    }
    public static void inOrder(Node root)
    {
        if(root==null)
        {
            return;
        }
        inOrder(root.left);
        System.out.print(root.data+" ");
        inOrder(root.right);
    }
    public static void main(String[] args) {
       in = new Scanner(System.in);
       Node root = onCreate();
       inOrder(root);
       System.out.println();
          Node leftMax =  new Node(Integer.MIN_VALUE);
          Node rightMin = new Node(Integer.MAX_VALUE);
          Node temp =isBst(root,leftMax,rightMin);
          inOrder(root);
       System.out.println();


    }

}
