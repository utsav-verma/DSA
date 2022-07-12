/*
 * Write an Algorithm to print the bottom view of Tree
 ! Link:- https://takeuforward.org/data-structure/bottom-view-of-a-binary-tree/
 */
import java.util.*;
public class Bottom_view {
    static class Node
    {
        int data;
        Node left;
        Node right;
        int level;
        Node(int data)
        {
            this.data=data;
        }
    }
    static Scanner in;
    public static Node onCreate()
    {
        Node root =null;
        System.out.println("Enter the Data : > ");
        int data =in.nextInt();
        if(data==-1)
        return null;
        root = new Node(data);
        System.out.println("Enter the left of "+data+" root : ");
        root.left =onCreate();
        System.out.println("Enter the right of "+data+" root : ");
        root.right=onCreate();
        return root;
    }
    public static void bottomView(Node root)
    {
        Queue<Node> q = new LinkedList<>();
        Map<Integer,Integer>map = new TreeMap<>();
        root.level=0;
        q.add(root);
        while(!q.isEmpty())
        {
            Node temp = q.poll();
            if(temp.left!=null)
            {
                temp.left.level=temp.level-1;
                q.add(temp.left);
            }
            if(temp.right!=null)
            {
                temp.right.level =temp.level+1;
                q.add(temp.right);
            }
            map.put(temp.level,temp.data);
        }
        System.out.println(map);
        for(Integer i:map.keySet())
        {
            System.out.println(map.get(i));
        }
    }
    public static void main(String[] args) {
        in = new Scanner(System.in);
        Node root =onCreate();
        bottomView(root);

    }
}
