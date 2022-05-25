/**
 * * Question :- Given a LinkedList in sorted form with duplicate elemnts remove all duplicates
 * ! Approch :- Using 2 pointer approch we will delink the duplicates.
 */


import java.util.*;
public class remove_duplicate {
    static class Node
    {
        Node next;
        int data;
        Node(int d)
        {
            data =d;
            next=null;
        }
    }
    static Scanner in;

    public static void main(String args[])
    {
        in = new Scanner(System.in);
        Node root = Create();
        root =removeDuplicate(root);
        display(root);
    }

    private static void display(Node root) {
        while(root!=null)
        {
            System.out.print(root.data+" ");
            root= root.next;
        }
        System.out.println();
    }

    private static Node removeDuplicate(Node root) {
      Node prev =null, curr=root;
        int flag =-1;
        while(curr!=null)
        {
            if(prev==null)
            {
                prev=curr;
            }
            else
            {
                if(curr.next==null && flag==1)
                {
                    prev.next=null;
                    break;
                }
                if(prev.data==curr.data)
                {
                    flag=1;
                }
                else
                {
                    flag=-1;
                    prev.next =curr;
                    prev =curr;
                }
            }
            curr =curr.next;
        }


       return root;
    }

    private static Node Create() {
        Node root = null;
        System.out.println("Enter The Data > ");
        int data =in.nextInt();
        if(data==-1)
        return null;
        root = new Node(data);
        root.next = Create();
        return root;
    }
}
