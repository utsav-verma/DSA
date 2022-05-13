/**
 * * Question:- Check if LinkedList is Palindrome or not 
 * !O(N) space not allowed
 * !Approach :- Two Pointer Approach one fast pointer and one slow pointer this way we get the mid of list and we reverse the list
 * * 1->4->8->9->10 so list get reversed in this way 1->4->8<-9<10 now we have two head pointer and we traverse from both sides and check if 
 * * Elements inside are same or not if same return true else return false
 */



import java.util.*;
public class palind_list {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n =in.nextInt();Node head =null;
        while(n-->0)
        {
            head =insert(head,in.nextInt());
        }
        Node mid=findMid(head);
        Node newHead=reverse(mid);
        // display(head);
        // display(newHead);
        boolean isPalin=isPalin(head,newHead);
        System.out.println(isPalin);
    }
    
    private static boolean isPalin(Node head, Node newHead) {
        while(head!=newHead )
        {
            if(head.data!=newHead.data)
            return false;
            head = head.next;
            newHead = newHead.next;
        }
        return true;
    }

    private static Node reverse(Node head) {
        if(head==null||head.next==null)
        return head;

        Node newHead=reverse(head.next);
        Node temp = head.next;
        temp.next = head;
        head.next =null;


        return newHead;
    }

    private static Node findMid(Node head) {
        Node slow =head,fast=head;
        while(fast!=null && fast.next!=null)
        {
            slow =slow.next;
            fast =fast.next.next;
        }

        return slow;
    }

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
    public static void display(Node head)
    {
        while(head!=null)
        {
            System.out.print(head.data+" ");
            head = head.next;
        }
        System.out.println();
    }
    
}
