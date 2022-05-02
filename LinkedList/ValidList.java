import java.util.Scanner;

/*
This program is to check that list is valid or not for example
8->2->2 
so as we can see 2 is pointing towards itself so it is creating a cycle .
*/
/**
 * ValidList
 */

import java.util.*;
public class ValidList {

    static class Node
    {
        Node next;
        Node prev;
        int data;
        Node(int data)
        {
            this.data = data;
        }
    }
    static Scanner in;
    public static Node insert()
    {
        Node root =null;
        System.out.println("Enter the data");
        int data =in.nextInt();
        if(data ==-1)
        return null;
        root = new Node(data);
        root.next =insert();
        return root;

    }
    public static void display(Node root)
    {
        while(root!=null)
        {
            System.out.print(root.data+" ");
            root =root.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        in = new Scanner(System.in);
        Node root = insert();
        display(root);
        boolean isValid = isValid(root);
        System.out.println(isValid);
        
    }
    private static boolean isValid(Node root) {

        Node curr_node=root;
        while(curr_node!=null)
        {
            Node temp =curr_node.next;
            if(curr_node==temp)
            return false;
            if(temp==root)
            return false;
            curr_node = temp;

        }

        return true;
    }
    private static boolean isValidDobly(Node root) {

        Node curr_node=root;
        while(curr_node!=null)
        {
            Node temp =curr_node.next;
            if(curr_node==temp)
            return false;
            if(temp==root)
            return false;
            curr_node = temp;

        }

        return true;
    }
}