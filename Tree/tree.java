import java.util.Scanner;

/*abstract
Basic implementation of Tree
*/
/**
 * tree
 */

import java.util.*;
public class tree {

    static class Node
    {
        Node left;
        Node right;
        int data;
        Node(int data)
        {
            this.data  =data;
            // left =null;
            // right =null;
        }
    }
    static Scanner in;
    public static Node onCreate()
    {
       Node root =null;
       System.out.println("Enter the data : ");
       int data = in.nextInt();
       if(data==-1)
       return null;
       root = new Node(data);

       System.out.println("Enter the data for left "+data+" : ");
       root.left = onCreate();
    //    System.out.println("Enter the data for right : ");
       System.out.println("Enter the data for right "+data+" : ");
       root.right = onCreate();


       return root;
    }

    public static void main(String[] args) {
        Node root;
        in = new Scanner(System.in);
        root = onCreate();
        
    }
}