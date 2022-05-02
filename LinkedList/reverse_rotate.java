import java.util.*;
public class reverse_rotate {
    static class Node
    {
        Node next;
        int data ;
        Node(int data)
        {
            this.data = data;
            next =null;
        }
    }
    
    public static Node insert(Node head,int data)
    {
        Node newnode = new Node(data);
        if(head==null)
        {
            head =newnode;
        }
        else
        {
            Node temp =head;
            while(temp.next!=null)
            {
                temp =temp.next;
            }
            temp.next =newnode;
        }
        return head;
        
        
    }
    public static Node reverse(Node start,Node end)
    {
        Node temp = start,prev =end,next=null,head=start;
        while(start!=end)
        {
            next = start.next;
            start.next=prev;
            prev = start;
            start = next;

        }
        return prev;
    }
    public static void display(Node head)
    {
        while(head!=null)
        {
            System.out.print(head.data+" ");
            head= head.next;
        }
        System.out.println();
    }

    //Range of pointers
    public static Node evePtr(Node head)
    {
        Node temp =head;
        while(temp.data%2==0)
        {
            temp =temp.next;
            if(temp==null)
            return null;
        }
        return temp;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the size of Node");
        int n =in.nextInt();
        Node head=null;
        while(n-->0)
        {
            head = insert(head,in.nextInt());
        }
        Node temp =head,prev = null;
        while(temp!=null)
        {
            if(prev==null&&temp==head&&temp.data%2==0)
            {
                Node end = evePtr(head);
                if(end!=head.next)
                head = reverse(head, end);
            }
            else if(temp.data%2==0)
            {
                Node end = evePtr(temp);
                // System.out.println(end);
                if(temp.next!=end)
                prev.next = reverse(temp, end);
            }
            prev =temp;
            temp=temp.next;
        }
        display(head);
    }

    
}
