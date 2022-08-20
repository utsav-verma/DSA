/*
 * Question:- In case right is greater than left delete left
 */
import java.util.*;
public class remove_ele {
    public static Node insert(Node head,int d)
    {
        Node newNode = new Node(d);
        if(head==null)
        {
            head=newNode;
        }
        else{
            Node temp =head;
            while(temp.next!=null)
            {
                temp = temp.next;
            }
            temp.next = newNode;
        }
        return head;

    }
    public static Node delete(Node head)
    {
        if(head==null || head.next==null)
        return head;
        Node curr =head,nextptr = head.next,prev=head;
        Node newhead =null;
        while(nextptr!=null)
        {
            if(curr.data<nextptr.data)
            {
                if(newhead==null)
                {
                    newhead=nextptr;
                }
                else if(newhead==curr)
                {
                    newhead =nextptr;
                }
                else
                {
                    prev.next=nextptr;
                    curr = nextptr;
                    nextptr = nextptr.next;
                }
            }
            else
            {
                if(newhead==null)
                newhead =curr;
                prev =curr;
                curr=nextptr;
                nextptr = nextptr.next;
            }
        
        }
        return newhead;
    }
    public static void display(Node head1)
    {
        Node head = head1;
        while(head!=null)
        {
            System.out.print(head.data+"  ");
            head =head.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n =in.nextInt();
        Node head =null;
        for(int i=0;i<n;i++)
        {
            head = insert(head,in.nextInt());
        }
        display(head);
        head =delete(head);
        display(head);
    }

}